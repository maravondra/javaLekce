# Interfae

Interface v Javě je speciální typ třídy, který je používán k definování metod, které třídy, které
implementují toto rozhraní, musí obsahovat. Rozhraní samo o sobě neobsahuje žádnou implementaci
těchto metod (tj. žádný kód, který by tyto metody vykonával), pouze jejich deklarace.

Rozhraní může také obsahovat konstanty (statické a finální proměnné), výchozí metody (default
methods) a statické metody.

## Proč používat interface?

1) **Abstrakce**: Umožňuje oddělit, co třída dělá, od toho, jak to dělá.
2) **Vícenásobná dědičnost**: Java nepodporuje vícenásobnou dědičnost u tříd, ale třída může
   implementovat
   několik rozhraní.
3) **Flexibilita a rozšiřitelnost**: Umožňuje změnit nebo přidat nové funkce bez změny existujícího
   kódu.

```java
public interface PaymentMethod {

  void pay(double amount);

  void refund(double amount);
}
```

Kreditní karta

```java
public class CreditCard implements PaymentMethod {

  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using Credit Card.");
  }

  @Override
  public void refund(double amount) {
    System.out.println("Refunded " + amount + " to Credit Card.");
  }
}
```

PayPal

```java
public class PayPal implements PaymentMethod {

  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using PayPal.");
  }

  @Override
  public void refund(double amount) {
    System.out.println("Refunded " + amount + " to PayPal.");
  }
}
```

Bankovní převod

```java
public class BankTransfer implements PaymentMethod {

  @Override
  public void pay(double amount) {
    System.out.println("Paid " + amount + " using Bank Transfer.");
  }

  @Override
  public void refund(double amount) {
    System.out.println("Refunded " + amount + " to Bank Transfer.");
  }
}
```

Použití implementovaných tříd

```java
public class Main {

  public static void main(String[] args) {
    PaymentMethod creditCard = new CreditCard();
    creditCard.pay(100.0);
    creditCard.refund(50.0);

    PaymentMethod payPal = new PayPal();
    payPal.pay(200.0);
    payPal.refund(100.0);

    PaymentMethod bankTransfer = new BankTransfer();
    bankTransfer.pay(300.0);
    bankTransfer.refund(150.0);
  }
}
```

## Vysvětlení

* Rozhraní PaymentMethod definuje dvě metody: pay a refund. Každá třída, která implementuje toto
  rozhraní, musí tyto metody implementovat.
* Třídy CreditCard, PayPal a BankTransfer implementují rozhraní PaymentMethod a poskytují konkrétní
  implementaci metod pay a refund.
* Třída Main pak demonstruje použití těchto implementací.

Tento příklad ukazuje, jak lze rozhraní použít k definování standardních operací pro různé typy
platebních metod v systému elektronického obchodu. Rozhraní zajišťuje, že všechny platební metody
budou mít konzistentní sadu metod, které mohou být volány jednotným způsobem.

# Výchozí metody (Default methods)

Default metody v rozhraní (zavedené v Jave 8) umožňují poskytovat výchozí implementace metod přímo v
rozhraní. To znamená, že třídy, které implementují toto rozhraní, nemusí nutně přepisovat tyto
metody, pokud jim výchozí implementace vyhovuje. Zde je několik hlavních výhod default metod:

Výhody default metod v rozhraní

1) Rozšíření rozhraní bez přerušení existujících implementací:
    * Před zavedením default metod bylo přidání nové metody do rozhraní velmi problematické, protože
      by to
      vyžadovalo, aby všechny existující třídy, které toto rozhraní implementují, přidaly
      implementaci
      nové metody. S default metodami může být nová metoda přidána do rozhraní s výchozí
      implementací,
      aniž by se muselo měnit cokoli v existujících třídách.
2) Redukce duplikace kódu:
    * Default metody umožňují poskytovat základní, společné chování pro všechny implementace
      rozhraní. To
      může vést k menší duplikaci kódu, protože základní implementace může být definována jednou v
      rozhraní a pouze specifické chování může být přepsáno v jednotlivých třídách.
3) Vylepšená čitelnost a údržba kódu:
    * Implementace základních metod přímo v rozhraní může zlepšit čitelnost a údržbu kódu, protože
      základní chování je centralizováno na jednom místě.

Zde je příklad, jak by mohly být default metody použity v rozhraní PaymentMethod:

```java
public interface PaymentMethod {

  void pay(double amount);

  void refund(double amount);

  default void printReceipt(double amount) {
    System.out.println("Receipt: Payment of " + amount + " processed.");
  }
}
```

- Rozhraní PaymentMethod nyní obsahuje default metodu printReceipt, která poskytuje základní
  implementaci pro tisk účtenky.
- Implementace CreditCard, PayPal a BankTransfer volají metodu printReceipt ve svých implementacích
  metody pay, aniž by musely poskytovat vlastní implementaci této metody.
- Pokud by bylo potřeba specifické chování pro tisk účtenky, implementující třída může přepsat
  default
  metodu printReceipt.