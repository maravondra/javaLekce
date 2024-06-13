- [ ] predstaveni

- [ ] Opakovani co to je trida
    - [ ] Co je to trida
    - [ ] Jak se vytvari trida
    - [ ] Co to je konstruktor
    - [ ] Jak se vytvari konstruktor
    - [ ] Co to je metoda
    - [ ] Jak se vytvari metoda
    - [ ] Co to je atribut
    - [ ] Jak se vytvari atribut
    - [ ] Jake jsou modifikatory pristupu
    - [ ] Jak se pouzivaji modifikatory pristupu
    - [ ] Getter and setter
    - [ ] Jak se vytvari objekt tridy

    - [ ] Co je to statika
    - [ ] Jak se pouziva staticka metoda
      příklad nějaké třídy a její použítí:

```java
class Clovek {

  String jmeno;
  int vek;

  public final static int MAX_VEK = 150;

  public Clovek(String jmeno, int vek) {
    this.jmeno = jmeno;
    this.vek = vek;
  }

  public void predstavSe() {
    System.out.println("Ahoj, jmenuji se " + jmeno + " a je mi " + vek + " let.");
  }
}

public class Main {

  public static void main(String[] args) {
    Clovek petrNovak = new Clovek("Petr", 30);
    petrNovak.predstavSe();

    Clovek.MAX_VEK = 200;
  }
}
```

- [ ] dědičnost
  [teorie.md](src%2Fmain%2Fjava%2Fcom%2Fengeto%2Fa_dedicnost%2Fteorie.md)

- [ ] polymorfismus
  [teorie.md](src%2Fmain%2Fjava%2Fcom%2Fengeto%2Fb_polymorfismus%2Fteorie.md)

- [ ] interface [teorie.md](src%2Fmain%2Fjava%2Fcom%2Fengeto%2Fc_rozhrani%2Fteorie.md)
- [ ] enum
  [teorie.md](src%2Fmain%2Fjava%2Fcom%2Fengeto%2Fd_vycet%2Fteorie.md)