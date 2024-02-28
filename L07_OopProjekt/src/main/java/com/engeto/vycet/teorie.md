# Enum

Samozřejmě, enum (zkratka pro "enumeration" neboli "výčet") je speciální typ dat, který umožňuje
definovat výčet konstantních hodnot, které tvoří omezený seznam možností. Enumy jsou užitečné pro
reprezentaci sady předem známých hodnot, jako jsou dny v týdnu, měsíce, stavy objektu apod.

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
