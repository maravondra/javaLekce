# Set v Javě

## 1. Co je to Set?

`Set` je kolekce, která v Javě implementuje rozhraní **`java.util.Set`**. Hlavní charakteristikou
Setu je, že *
*neumožňuje duplikáty**. To znamená, že každý prvek v Setu musí být unikátní. Všechny implementace
`Setu` v Javě také *
*nezaručují pořadí prvků**, což znamená, že pořadí, ve kterém jsou prvky uloženy, se může lišit.

### Hlavní vlastnosti Setu:

- **Unikátní prvky**: Neexistují žádné duplikáty.
- **Nepořadí**: Prvky nejsou uloženy v žádném specifickém pořadí (ačkoliv některé implementace Setu
  pořadí zachovávají).
- **Bez indexů**: Na rozdíl od seznamu (`List`), který používá indexy pro přístup k prvkům, Set nemá
  přímou podporu pro
  indexování.

## 2. Typy implementací Setu

V Javě existují různé implementace `Setu`, které se liší ve způsobu implementace a vlastnostech.

### 2.1. HashSet

`HashSet` je nejběžnější implementace `Setu`. Ukládá prvky pomocí **hashování**, což znamená, že
pořadí prvků není
definováno.

- **Charakteristika**:
    - Nejrychlejší pro základní operace, jako je přidání a vyhledávání (průměrná časová složitost O(
      1)).
    - Nepodporuje udržování pořadí vložených prvků.

- **Použití**: Ideální, pokud nepotřebujete zachovat pořadí, ale chcete rychlý přístup k prvkům.

### 2.2. LinkedHashSet

`LinkedHashSet` je varianta `HashSet`, která **uchovává pořadí**, ve kterém byly prvky přidány.
Používá vnitřní spojový
seznam, který uchovává pořadí vložených prvků.

- **Charakteristika**:
    - Uchovává pořadí vložených prvků.
    - Operace přidávání, odebírání a kontrola existencí jsou také velmi rychlé (průměrná časová
      složitost O(1)).

- **Použití**: Používá se, když chcete zachovat pořadí prvků, ale zároveň chcete využít výhod
  rychlého přístupu.

### 2.3. TreeSet

`TreeSet` je implementace `Setu`, která uchovává prvky v **seřazeném pořadí**. Používá **binární
vyhledávací strom** (
obvykle červené-černé stromy), aby udržovala seřazenost.

- **Charakteristika**:
    - Prvky jsou seřazeny podle jejich přirozeného pořadí (pomocí metody `compareTo` v implementaci
      `Comparable`), nebo
      pomocí specifikovaného komparátoru.
    - Operace jako přidání, odebírání a vyhledávání mají časovou složitost O(log n).

- **Použití**: Ideální pro případy, kdy potřebujete udržovat prvky ve třídě seřazené, např. pro
  analýzu dat nebo
  implementaci prioritních front.

## 3. Operace s Setem

Set poskytuje několik základních operací, které jsou běžně používány v praxi. Zde jsou některé z
nejdůležitějších:

### 3.1. Přidání prvku

- **`add(E e)`**: Přidá prvek do setu, pokud již není přítomen. Pokud prvek v setu již existuje,
  operace vrátí `false`.
  ```java
  set.add("Java");

## HashSet a TreeSet

✅ Vysvětlení:

* Set – kolekce unikátních hodnot
* HashSet – neudržuje pořadí, rychlý (hashCode)
* TreeSet – třídí podle přirozeného řazení (např. abecedně), pomalejší
