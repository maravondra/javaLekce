# Polymorfismus

Polymorfismus je jeden z klíčových konceptů v objektově orientovaném programování (OOP). Slovo
pochází z řeckých slov "poly" (mnoho) a "morph" (tvar), takže doslova znamená "mnoho tvarů". V
kontextu programování to znamená schopnost objektů různých tříd odpovídat na stejnou metodu (nebo
operaci) různými způsoby.

1) Dědičný polymorfismus (polymorfismus podtříd)
2) Přetěžování (overloading)

## Dědičný polymorfismus

Tento typ polymorfismu se týká situace, kdy různé třídy dědí od stejné základní třídy a přepisují
její metody. Při volání těchto metod se rozhodne na základě typu objektu, která implementace se
použije.

```java
class Zvirata {

  void zvuk() {
    // Metoda, která bude přepsána v podtřídách
  }
}

class Pes extends Zvirata {

  void zvuk() {
    System.out.println("Haf haf!");
  }
}

class Kocka extends Zvirata {

  void zvuk() {
    System.out.println("Mňau mňau!");
  }
}

public class PolymorfismusPriklad {

  public static void main(String[] args) {
    Zvirata[] zvirata = {new Pes(), new Kocka()};

    for (Zvirata zvire : zvirata) {
      zvire.zvuk(); // Volání metody závisí na typu objektu
    }
  }
}
```

V tomto příkladu volání zvuk() na objektu Pes vypíše "Haf haf!", zatímco na objektu Kocka vypíše "
Mňau mňau!". To je polymorfismus v akci.

## Přetěžování (overloading)

Přetěžování se týká situace, kdy v jedné třídě existuje více metod se stejným názvem, ale s různými
parametry.

```java
class Matematika {

  int add(int a, int b) {
    return a + b;
  }

  double add(double a, double b) {
    return a + b;
  }

}

public class PretezovaniPriklad {

  public static void main(String[] args) {
    Matematika m = new Matematika();
    System.out.println(m.add(1, 2)); // Výstup: 3
    System.out.println(m.add(1.5, 2.5)); // Výstup: 4.0
  }
}

```

V tomto příkladu máme dvě metody add se stejným názvem, ale s různými parametry. Kompilátor
rozhodne, kterou metodu volat na základě typů předaných argumentů.

## Shrnutí

Polymorfismus umožňuje programátorům psát flexibilnější a udržovatelnější kód. Zjednodušuje
rozšiřitelnost systému a umožňuje volání metod na objektech, aniž by bylo nutné vědět, ke které
třídě konkrétní objekt patří.