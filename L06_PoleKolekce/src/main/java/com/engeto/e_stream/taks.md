Představ si, že vyvíjíš systém pro e-shop s elektronikou. Máme seznam objednávek a tvým úkolem je vytvořit „Report prodeje“.

# Zadání úkolu:
Máš k dispozici seznam objektů třídy Order (Objednávka). Každá objednávka obsahuje:

- customerName (Jméno zákazníka)
- items (Seznam položek v objednávce – každá položka má name, category a price)
- status (Stav: PENDING, SHIPPED, CANCELLED)

Tvým úkolem je pomocí Stream API:

- Vyfiltrovat pouze objednávky, které jsou ve stavu SHIPPED (odesláno). 
- Z těchto objednávek vybrat všechny položky, které patří do kategorie "Electronics". 
- Získat unikátní názvy těchto produktů (nechceme duplicity). 
- Seřadit názvy produktů abecedně.

Výsledek uložit do List<String>.

``` java
import java.util.*;
import java.util.stream.*;

class Item {
    String name;
    String category;
    double price;

    public Item(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public String getName() { return name; }
    public String getCategory() { return category; }
}

class Order {
    String customerName;
    String status;
    List<Item> items;

    public Order(String customerName, String status, List<Item> items) {
        this.customerName = customerName;
        this.status = status;
        this.items = items;
    }
    public String getStatus() { return status; }
    public List<Item> getItems() { return items; }
}

public class EshopReport {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Jan", "SHIPPED", Arrays.asList(
                new Item("iPhone 15", "Electronics", 25000),
                new Item("Ponožky", "Clothing", 200)
            )),
            new Order("Petr", "PENDING", Arrays.asList(
                new Item("Monitor", "Electronics", 5000)
            )),
            new Order("Lucie", "SHIPPED", Arrays.asList(
                new Item("iPhone 15", "Electronics", 25000),
                new Item("Sluchátka", "Electronics", 3000),
                new Item("Kniha o Javě", "Books", 500)
            )),
            new Order("Marek", "CANCELLED", Arrays.asList(
                new Item("Nabíječka", "Electronics", 800)
            ))
        );

        // --- TVŮJ ÚKOL ZAČÍNÁ ZDE ---
        List<String> result = orders.stream()
            // Zde doplň operace...
            .collect(Collectors.toList()); 

        System.out.println("Výsledný report: " + result);
    }
}
``` 

Vysledek

``` java
List<String> result = orders.stream()
    // 1. Nejdřív vyfiltrujeme jen odeslané objednávky
    .filter(order -> "SHIPPED".equals(order.getStatus()))
    
    // 2. Teď přichází to kouzlo: flatMap. 
    // Z každé objednávky vytáhneme její List<Item> a "vysypeme" je do jednoho velkého proudu položek.
    .flatMap(order -> order.getItems().stream())
    
    // 3. Teď už pracujeme s jednotlivými Item, tak odfiltrujeme elektroniku
    .filter(item -> "Electronics".equals(item.getCategory()))
    
    // 4. Zajímá nás jen název (převod z Item na String)
    .map(Item::getName)
    
    // 5. Chceme unikátní názvy (iPhone 15 tam byl dvakrát)
    .distinct()
    
    // 6. Seřadíme abecedně
    .sorted()
    
    // 7. A šup s tím do výsledného listu
    .toList(); // v novějších verzích Javy stačí takto, případně .collect(Collectors.toList())

System.out.println("Výsledný report: " + result);
// Očekávaný výstup: [iPhone 15, Sluchátka]

``` 