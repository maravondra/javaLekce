package org.example.a_exception.pizza;

import java.util.Scanner;

public class PizzaAutomat {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Vítejte v PizzaApp 🍕");

      System.out.print("Zadejte velikost pizzy (malá/střední/velká): ");
      String velikost = scanner.nextLine().trim().toLowerCase();

      if (!velikost.equals("malá") && !velikost.equals("střední") && !velikost.equals("velká")) {
        throw new IllegalArgumentException("Neplatná velikost pizzy.");
      }

      System.out.print("Kolik pizz si přejete objednat? ");
      int pocet = Integer.parseInt(scanner.nextLine());

      if (pocet <= 0) {
        throw new IllegalArgumentException("Počet pizz musí být větší než 0.");
      }

      // doplneno na pozdeji
      if (pocet > 100) {
        throw new PrilisMocPizzException(
            "Příliš mnoho pizz objednáno!",
            pocet,
            100
        );
      }

      int cenaZaKus = switch (velikost) {
        case "malá" -> 120;
        case "střední" -> 150;
        case "velká" -> 180;
        default -> 0; // nemělo by nastat
      };

      int celkovaCena = pocet * cenaZaKus;
      System.out.println("Vaše objednávka: " + pocet + "x " + velikost + " pizza");
      System.out.println("Celková cena: " + celkovaCena + " Kč");

    } catch (NumberFormatException e) {
      System.out.println("Chyba: Zadejte prosím platné číslo.");
    } catch (IllegalArgumentException e) {
      System.out.println("Chyba: " + e.getMessage());
    }

    // doplneni take na pozdeji
    catch (PrilisMocPizzException e) {
      System.out.println("Speciální chyba: " + e.getMessage());
      System.out.println(
          "Požadováno: " + e.getPozadovanyPocet() + ", maximální limit: " + e.getMaximalniPocet());
    } catch (Exception e) {
      System.out.println("Neznámá chyba: " + e.getMessage());
    }

    System.out.println("Děkujeme za použití PizzaApp! 👋");

  }
}
