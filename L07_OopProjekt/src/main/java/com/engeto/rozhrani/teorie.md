# Interfae

Rozhraní je způsob, jak definovat smlouvu, kterou musí třídy dodržovat.
Obsahuje pouze abstraktní metody a konstanty (v Javě).
Třídy mohou implementovat (nikoli dědit) rozhraní a
musí implementovat všechny jeho abstraktní metody.
To umožňuje třídám definovat společné chování, aniž by musely dědit od stejného předka.

```java
interface Prepravitelny {

  void preprav();
}
```

```java
class Auto implements Prepravitelny {

  @Override
  public void preprav() {
    System.out.println("Auto přepravuje zboží.");
  }
}
```

```java
class Lod implements Prepravitelny {

  @Override
  public void preprav() {
    System.out.println("Loď přepravuje zboží po moři.");
  }
}
```

V tomto příkladu máme rozhraní Prepravitelny, které obsahuje abstraktní metodu `preprav()`.
Třídy Auto a Lod implementují toto rozhraní a poskytují svou vlastní implementaci
metody `preprav()`.
Ve funkci `main()` pak můžeme vytvořit instance těchto tříd a volat metodu `preprav()`, která
provede odpovídající akce pro každý typ prepravovacího prostředku.