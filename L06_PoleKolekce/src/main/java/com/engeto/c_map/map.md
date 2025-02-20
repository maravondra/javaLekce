# Mapy

Myšlenka slovníku spočívá v tom, že často potřebujeme přistupovat k
prvku pomocí nějakého klíče. Takto to vlastně funguje i v poli, kde jsou
klíče (v poli indexy) číselné. Slovník umožňuje indexovat libovolným
datovým typem, např. textovým řetězcem. K prvkům kolekce poté
přistupujeme pomocí těchto řetězců. Analogii nalezneme v opravdovém
papírovém slovníku, kde máme pod slovíčkem (které je textovým
řetězcem) jeho překlad, výklad, další významy atd.

## HashMap

# 🔹 Co je `HashMap` a k čemu slouží?

`HashMap` je jedna z nejpoužívanějších kolekcí v Javě. Slouží k ukládání dvojic **klíč → hodnota**, kde každý klíč je
unikátní a odkazuje na jednu hodnotu.

## 📌 Hlavní vlastnosti `HashMap`

- ✅ Rychlé vyhledávání, vkládání a mazání hodnot (`O(1)`)
- ✅ Nezaručuje pořadí prvků
- ✅ Klíče musí být **unikátní** (hodnoty se mohou opakovat)
- ✅ Podporuje `null` klíče i `null` hodnoty

## 📌 Kde se `HashMap` využívá?

- **Uchování konfigurací** (např. nastavení aplikace)
- **Indexování dat** (např. asociace ID s objekty)
- **Počítání výskytů** prvků v seznamu
- **Rychlé vyhledávání** hodnot na základě klíčů

---

# 🔹 Struktura `HashMap` (klíč → hodnota, vnitřní implementace)

`HashMap` využívá **hashovací tabulku**, což je pole tzv. **bucketů** (segmentů). Každý bucket může obsahovat více
prvků, pokud dojde ke **kolizi hashů**.

1. **Při vložení prvku (`put`)**:
    - Vypočítá se `hashCode()` klíče.
    - Určí se index v tabulce (`hash % velikostTabulky`).
    - Pokud je bucket prázdný, vloží se nový záznam.
    - Pokud bucket obsahuje jiný prvek se stejným `hashCode()`, použije se:
        - **Linked List** (Java 7)
        - **TreeMap pro větší množství kolizí** (Java 8+)

2. **Při získání prvku (`get`)**:
    - Opět se spočítá `hashCode()` a určí index.
    - Pokud je na indexu více prvků (kolize), použije se `equals()` pro nalezení správného klíče.

## 📌 Ukázka jednoduché `HashMap`

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 22);

        System.out.println("Věk Alice: " + map.get("Alice")); // Výstup: Věk Alice: 25
    }
}
```

| Kolekce      | Struktura                | Pořadí prvků  | Přístup k prvku      | Unikátní klíče/hodnoty | Vhodné pro                       |
|--------------|--------------------------|---------------|----------------------|------------------------|----------------------------------|
| `HashMap`    | Klíč → Hodnota           | ❌ Nezachovává | O(1) – rychlé        | ✅ Unikátní klíče       | Mapování dat, rychlé vyhledávání |
| `ArrayList`  | Pole (dynamické)         | ✅ Zachovává   | O(1) přístup (index) | ❌ Neunikátní prvky     | Seznamy, práce s indexy          |
| `LinkedList` | Obousměrně vázaný seznam | ✅ Zachovává   | O(n) vyhledávání     | ❌ Neunikátní prvky     | Časté vkládání/smazání prvků     |
| `HashSet`    | Množina (bez klíčů)      | ❌ Nezachovává | O(1) – rychlé        | ✅ Unikátní prvky       | Eliminace duplicit               |

