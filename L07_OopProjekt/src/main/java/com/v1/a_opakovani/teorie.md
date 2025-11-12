# Objektově orientované programování v Javě

## Co je to třída

Třída je šablona nebo blueprint pro vytváření objektů. Definuje atributy (vlastnosti) a metody (chování), které objekt
bude mít.

## Jak se vytváří třída

Třída se v Javě definuje pomocí klíčového slova `class`:

```java
public class Auto {
    // Tělo třídy
}
```

## Co to je konstruktor

Konstruktor je speciální metoda třídy, která se volá při vytváření objektu. Používá se k inicializaci atributů třídy.

## Jak se vytváří konstruktor

Konstruktor má stejný název jako třída a nemá návratový typ:

```java
public class Auto {
    String barva;

    // Konstruktor
    public Auto(String barva) {
        this.barva = barva;
    }
}
```

## Co to je metoda

Metoda je blok kódu, který vykonává určitou operaci. Metody umožňují znovupoužitelnost kódu.

## Jak se vytváří metoda

Metoda se definuje pomocí návratového typu, názvu metody a volitelných parametrů:

```java
public class Auto {
    public void zapnoutMotor() {
        System.out.println("Motor běží");
    }
}
```

## Co to je atribut

Atribut je proměnná uvnitř třídy, která uchovává stav objektu.

## Jak se vytváří atribut

Atribut se definuje jako proměnná uvnitř třídy:

```java
public class Auto {
    String barva; // Atribut
}
```

## Jaké jsou modifikátory přístupu

Modifikátory přístupu určují viditelnost a dostupnost atributů a metod.

### Typy modifikátorů přístupu:

- `public` – přístup odkudkoliv
- `private` – přístup pouze uvnitř třídy
- `protected` – přístup v rámci balíčku a odvozených tříd
- (bez modifikátoru) – přístup pouze v rámci balíčku

## Jak se používají modifikátory přístupu

| Modifikátor            | Daná třída | Stejný balíček | Potomci třídy (odvozené třídy) | Svět (vše ostatní) |
|------------------------|------------|----------------|--------------------------------|--------------------|
| **public**             | ✔          | ✔              | ✔                              | ✔                  |
| **protected**          | ✔          | ✔              | ✔                              | ❌                  |
| **(bez modifikátoru)** | ✔          | ✔              | ❌                              | ❌                  |
| **private**            | ✔          | ❌              | ❌                              | ❌                  |

```java
public class Auto {
    private String barva;

    public void setBarva(String barva) {
        this.barva = barva;
    }

    public String getBarva() {
        return barva;
    }
}
```

## Getter a Setter

Gettery a settery umožňují řízený přístup k soukromým atributům.

```java
public class Auto {
    private String barva;

    public String getBarva() {
        return barva;
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }
}
```

## Jak se vytváří objekt třídy

Objekt se vytváří pomocí klíčového slova `new`:

```java
Auto mojeAuto = new Auto("Červená");
System.out.

println(mojeAuto.getBarva());
```

## Co je to statika

`static` označuje, že člen (metoda, atribut) patří třídě, nikoli instanci.

## Jak se používá statická metoda – příklad

Statické metody lze volat bez vytváření instance třídy.

```java
public class Matematika {
    public static int secti(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        int vysledek = Matematika.secti(5, 10);
        System.out.println("Součet: " + vysledek);
    }
}
```

