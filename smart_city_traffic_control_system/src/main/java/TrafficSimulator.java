import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrafficSimulator {

    private static final String API_BASE = "http://localhost:8080/api/v1";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Random random = new Random();

    public static void main(String[] args) throws Exception {
        System.out.println("🚦 Spouštím simulátor městského provozu...");

        while (true) {
            try {
                // 1. Získáme ID všech křižovatek z našeho hlavního serveru
                List<String> ids = fetchIntersectionIds();

                if (ids.isEmpty()) {
                    System.out.println("⚠️ Žádné křižovatky nenalezeny. Vytvořte nějaké přes UI/Postman.");
                } else {
                    // Vybereme náhodnou křižovatku
                    String targetId = ids.get(random.nextInt(ids.size()));

                    // 2. Náhodná akce: Buď změna barvy, nebo sanitka
                    if (random.nextInt(10) > 8) {
                        triggerAmbulance(targetId);
                    } else {
                        changeTrafficLight(targetId);
                    }
                }
            } catch (Exception e) {
                System.err.println("❌ Chyba simulátoru (běží hlavní server?): " + e.getMessage());
            }

            // Počkáme pár sekund před další změnou
            TimeUnit.SECONDS.sleep(3);
        }
    }

    private static void changeTrafficLight(String id) throws Exception {
        String nextState = random.nextBoolean() ? "GREEN" : "RED";
        System.out.println("🔄 Měním " + id.substring(0, 8) + " na " + nextState);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_BASE + "/traffic-lights/" + id + "/state?value=" + nextState))
                .method("PATCH", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<Void> send = client.send(request, HttpResponse.BodyHandlers.discarding());
        if(send.statusCode() == 200) {
            System.out.println("✅ Odpověď: " + send.statusCode());
        }else {
            System.err.println("❌ Chyba při změně stavu: " + send.statusCode());
        }
    }

    private static void triggerAmbulance(String id) throws Exception {
        System.out.println("🚨 !!! SANITKA NA KŘIŽOVATCE " + id.substring(0, 8) + " !!!");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_BASE + "/emergency/ambulance-pass?intersectionId=" + id))
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();
        client.send(request, HttpResponse.BodyHandlers.discarding());
    }

    private static List<String> fetchIntersectionIds() throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_BASE + "/traffic-lights"))
                .GET()
                .build();

        String body = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

        // Jednoduchý regex pro vytažení UUID z JSONu bez externích knihoven
        Matcher m = Pattern.compile("[a-f0-9-]{36}").matcher(body);
        return m.results().map(mr -> mr.group()).toList();
    }
}