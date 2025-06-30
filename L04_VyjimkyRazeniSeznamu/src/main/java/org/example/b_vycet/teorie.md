# Enum

`enum` (z anglického enumeration – výčet) slouží k definici **pevně daného seznamu hodnot**. Používá
se
tam, kde má proměnná nabývat pouze určitých **předem definovaných stavů**.

Například: dny v týdnu, stavy objednávky, typy paliva, atd.

``` java
enum DenVTydnu {
    PONDELI,
    UTERY,
    STREDA,
    CTVRTEK,
    PATEK,
    SOBOTA,
    NEDELE
}
```

V tomto příkladu jsme definovali enum DenVTydnu, který obsahuje sedm konstantních hodnot
reprezentujících dny v týdnu. Můžeme pak použít tento enum k deklaraci proměnných a k porovnávání
hodnot:

``` java
public class Main {
    public static void main(String[] args) {
        DenVTydnu dnes = DenVTydnu.PONDELI;

        System.out.println("Today is " + today);

        if (dnes == DenVTydnu.PONDELI) {
            System.out.println("Dnes je pondělí.");
        } else {
            System.out.println("Dnes není pondělí.");
        }
    }
}
``` 

V tomto příkladu jsme vytvořili proměnnou dnes typu DenVTydnu a porovnali jsme ji s hodnotou PONDELI
pomocí operátoru ==. Enumy jsou v Javě silně doporučovaným způsobem, jak reprezentovat omezené
množství hodnot, protože poskytují přehlednost, typovou bezpečnost a snadnou čitelnost kódu.

# Metody pro ENUM

Každý enum v Javě má několik užitečných metod:

- `values()`: Vrací pole všech konstant v pořadí, v jakém byly deklarovány.
- `valueOf(String name)`: Vrací konstantu s daným jménem. Pokud taková konstanta neexistuje, vyhodí
  výjimku IllegalArgumentException.
  .

``` java
    Day[] days = Day.values();
    for (Day day : days) {
        System.out.println(day);
    }
    
    // Použití valueOf()
    System.out.println("Day: " + day);
```

# Enum s vlastními metodami a proměnnými

Enumy mohou mít i vlastní proměnné a metody. Můžeš je používat k uložení dalších informací a
definování funkcionality.

``` java
public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6);

    private final double mass;   // v kilogramech
    private final double radius; // v metrech

    // Konstruktor enumu
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    // Povrchová gravitace
    public double surfaceGravity() {
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }
}

public class EnumWithMethodsExample {
    public static void main(String[] args) {
        for (Planet planet : Planet.values()) {
            System.out.printf("Planet: %s, Mass: %f, Radius: %f, Surface Gravity: %f%n",
                planet, planet.getMass(), planet.getRadius(), planet.surfaceGravity());
        }
    }
}
```