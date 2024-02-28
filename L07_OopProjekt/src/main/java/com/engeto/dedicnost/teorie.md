# Dedicnost

Dědičnost je jedna ze základních vlastností OOP a slouží k tvoření
**nových datových struktur** na **základě starých**.

V programovacím světě se termín **dědičnost** používá k popisu způsobu,
jakým mohou objekty nebo třídy **sdílet** vlastnosti a chování jiných objektů nebo tříd.
Tento koncept je **_hlavním_** stavebním kamenem objektově orientovaného programování (OOP).
V OOP může třída (nebo objekt) **zdědit vlastnosti a metody** z jiné třídy, která se nazývá
rodičovská třída.

Například, představ si, že máme třídu **Zvíře**, která obsahuje obecné vlastnosti a
metody pro všechna zvířata. Potom můžeme vytvořit další třídy, jako jsou **Pes** a **Kočka**,
které zdědí vlastnosti a metody z třídy "Zvíře". Tímto způsobem můžeme vytvořit
hierarchii tříd, kde se specializované třídy mohou stavět
na obecných vlastnostech a chování rodičovských tříd.

```java
// Rodicova trida
class Zvire {

  String typ;

  public void zvuk() {
    System.out.println("Zvire vydava zvuk.");
  }
}
```

```java
// Potomkova pes
class Pes extends Zvire {

  public Pes() {
    typ = "Pes";
  }

  @Override
  public void zvuk() {
    System.out.println("Pes štěká.");
  }
}
```

```java
// Potomkova kocka
class Kocka extends Zvire {

  public Kocka() {
    typ = "Kocka";
  }

  @Override
  public void zvuk() {
    System.out.println("Kocka mňouká.");
  }
}
```

```java
public class Dedicnost {

  public static void main(String[] args) {
    Pes pes = new Pes();
    Kocka kocka = new Kocka();

    pes.zvuk(); // Vypíše "Pes štěká."
    kocka.zvuk(); // Vypíše "Kocka mňouká."
  }
}
```

V tomto příkladu máme třídu **Zvire**, která obsahuje vlastnost typ a metodu `zvuk()`.
Potom máme dvě potomkovské třídy, Pes a Kocka, které dědí od třídy Zvire.
Každá z těchto tříd přepisuje (override) metodu `zvuk()` tak,
aby vydávala specifický zvuk pro psa resp. kočku.

Ve funkci main() pak vytvoříme instance těchto tříd a zavoláme jejich metodu `zvuk()`,
která vypíše specifický zvuk pro každé zvíře.