# Terminologie

* Objekt (třída) – jednotlivé prvky modelované reality (jak data, tak související funkčnost) jsou v
  programu seskupeny do entit, nazývaných objekty. Objekty si pamatují svůj stav a navenek poskytují
  operace (přístupné jako metody pro volání).
* Zapouzdření – zaručuje, že objekt nemůže přímo přistupovat k „vnitřnostem“ jiných objektů, což by
  mohlo vést k nekonzistenci. Každý objekt navenek zpřístupňuje rozhraní, pomocí kterého (a nijak
  jinak) se s objektem pracuje, a k tomu se používají: modifikátory přístupu, jmenný prostor...
* Instance objektu -
* Dědičnost – objekty jsou organizovány stromovým způsobem, kdy objekty nějakého druhu mohou dědit z
  jiného druhu objektů, čímž přebírají jejich schopnosti, ke kterým pouze přidávají svoje vlastní
  rozšíření. Tato myšlenka se obvykle implementuje pomocí rozdělení objektů do tříd, přičemž každý
  objekt je instancí nějaké třídy. Každá třída pak může dědit od jiné třídy (v některých
  programovacích jazycích i z několika jiných tříd).
* Polymorfismus – odkazovaný objekt se chová podle toho, jaké třídy je instancí. Pozná se tak, že
  několik objektů poskytuje stejné rozhraní, pracuje se s nimi navenek stejným způsobem, ale jejich
  konkrétní chování se liší podle implementace. U polymorfismu podmíněného dědičností to znamená, že
  na místo, kde je očekávána instance nějaké třídy, můžeme dosadit i instanci libovolné její
  podtřídy, neboť rozhraní třídy je podmnožinou rozhraní podtřídy. U polymorfismu nepodmíněného
  dědičností je dostačující, jestliže se rozhraní (nebo jejich požadované části) u různých tříd
  shodují, pak jsou vzájemně polymorfní.

# Objektově orientované programování (OOP)

Deklarace metody v Javě je tedy následující:

```
[modifikátorPřístupu] [návratovýTyp] [názevMetody]([parametry])
```

## Zapoudreni

Pro jednoduchosti jste nastavovali všechny atributy naší třídy
jako `public`, tedy jako veřejně přístupné. Většinou se však
spíše nechce, aby se daly zvenčí modifikovat a používá se modifikátor
`private`. Atribut je poté viditelný jen uvnitř třídy a zvenčí
se Java tváří, že vůbec neexistuje. Při návrhu třídy tedy nastavíme
vše na `private` a v případě, že něco bude opravdu potřeba
vystavit, použijeme `getter` and `setter`.

1) S hodnotami atributů objektu A může manipulovat vždy pouze tentýž objekt A
2) Žádný jiný objekt (ani objekt téže třídy) by neměl mít možnost manipulovat s hodnotami atributů
   našeho objektu.
3) Pokud chceme, aby objekt změnil hodnotu svých atributů (tedy aby přešel do jiného stavu), pošleme
   mu zprávu (zavoláme některou z metod tohoto objektu).

## Abstrakce

že každý objekt musí pohlížet na ostatní objekty jako na „černé skříňky“, které mají jasně dané
ovládací prvky (rozhraní), ale nesmí spoléhat na to, jak fungují uvnitř.

## Dedicnost

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