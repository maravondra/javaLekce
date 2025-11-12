# 🧠 Co je Stream v Javě

**Stream** v Javě není datová struktura (jako `List`, `Array` nebo `Set`).  
Je to nástroj pro práci s daty v proudu (streamu) – umožňuje **zpracovávat kolekce dat funkcionálním
způsobem**.

Můžeš si to představit jako **potrubí**, kterým teče proud dat.  
Do potrubí vložíš data (např. seznam čísel) a postupně na ně aplikuješ různé operace (např.
filtrování, třídění, mapování).

![stream_cycle.svg.svg](..%2F..%2F..%2F..%2Fresources%2Fimage_md%2Fstream_cycle.svg.svg)

## 🔧 Základní princip

1. **Vstupní zdroj** – např. `List`, `Set`, nebo pole (`array`)
2. **Stream operace** – např. `filter()`, `map()`, `sorted()`, `limit()`
3. **Terminální operace** – např. `collect()`, `forEach()`, `count()`

> Stream sám o sobě *neukládá data*, jen definuje, jak s daty zacházet.

## 📋 Příklad: Bez streamu vs. se streamem

### ❌ Tradiční způsob

```java
List<String> names = List.of("Anna", "Petr", "Karel", "Adam");
List<String> result = new ArrayList<>();

for(String name :names){
    if(name.startsWith("A")){
       result.add(name.toUpperCase());
   }
}

    System.out.println(result); // [ANNA, ADAM]
```

### ✅ Se Stream API

```java
List<String> names = List.of("Anna", "Petr", "Karel", "Adam");

List<String> result = names.stream()
    .filter(name -> name.startsWith("A"))  // vyber jen jména na A
    .map(String::toUpperCase)               // převeď na velká písmena
    .toList();                              // ulož do nového seznamu

System.out.println(result); // [ANNA, ADAM]
```

# 🧩 Typy operací

## 🌀 Meziproduktové (intermediate)

Operace, které vytváří nový **Stream**:

- `filter()` – vybere jen určité prvky
- `map()` – změní hodnoty prvků
- `sorted()` – seřadí
- `limit()` – omezí počet prvků

---

## 🏁 Terminální (terminal)

Operace, které ukončí **Stream** a vrátí výsledek:

- `collect()` – vrátí kolekci
- `forEach()` – provede akci nad každým prvkem
- `count()` – spočítá prvky
- `findFirst()` – vrátí první prvek  


## ⚙️ Příklad s čísly

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

int sum = numbers.stream()
  .filter(n -> n % 2 == 0)     // nech jen sudá čísla
  .mapToInt(n -> n * n)        // umocni je na druhou
  .sum();                      // sečti

System.out.println(sum); // 56  (2² + 4² + 6²)
```

# 🚀 Výhody používání Streamů

- ✅ Kratší a přehlednější kód
- ✅ Snadná práce s kolekcemi
- ✅ Možnost paralelního zpracování (`parallelStream()`)
- ✅ Méně chyb způsobených mutací dat

---

## 💡 Shrnutí

Streamy umožňují:

- Zpracovávat data bez cyklů `for`
- Řetězit více operací do sebe
- Používat funkcionální styl programování

---

## 📘 Doporučení

Streamy se nejlépe učí na praktických příkladech.  
Můžeš si zkusit např.:

- Vyfiltrovat slova delší než 5 znaků
- Spočítat průměr čísel v seznamu
- Najít největší hodnotu  



# 🧩 Nejčastěji používané metody ve Stream API

| Kategorie | Metoda | Popis | Příklad použití |
|------------|---------|--------|----------------|
| **Vytvoření streamu** | `stream()` | Vytvoří stream z kolekce | `list.stream()` |
|  | `Arrays.stream()` | Vytvoří stream z pole | `Arrays.stream(array)` |
|  | `Stream.of()` | Vytvoří stream z několika hodnot | `Stream.of("A", "B", "C")` |
| **Filtrování a výběr dat** | `filter()` | Vybere prvky podle podmínky | `.filter(x -> x > 10)` |
|  | `distinct()` | Odstraní duplicitní hodnoty | `.distinct()` |
|  | `limit()` | Omezí počet prvků ve streamu | `.limit(5)` |
|  | `skip()` | Přeskočí prvních *n* prvků | `.skip(2)` |
| **Transformace** | `map()` | Převede prvky na jinou hodnotu | `.map(String::toUpperCase)` |
|  | `mapToInt()` | Převede na `IntStream` | `.mapToInt(Integer::intValue)` |
|  | `flatMap()` | „Rozbalí“ vnořené kolekce | `.flatMap(List::stream)` |
| **Řazení a změna pořadí** | `sorted()` | Seřadí prvky | `.sorted()` |
|  | `sorted(Comparator)` | Seřadí podle vlastního porovnání | `.sorted((a,b) -> b.compareTo(a))` |
| **Agregace a výpočty** | `count()` | Vrátí počet prvků | `.count()` |
|  | `sum()` | Spočítá součet (u `IntStream`) | `.mapToInt(...).sum()` |
|  | `average()` | Vrátí průměr | `.mapToInt(...).average()` |
|  | `max()` | Najde největší hodnotu | `.max(Integer::compareTo)` |
|  | `min()` | Najde nejmenší hodnotu | `.min(Integer::compareTo)` |
| **Shromažďování výsledků** | `collect()` | Uloží výsledek do kolekce | `.collect(Collectors.toList())` |
|  | `toList()` | Zkratka pro `collect(Collectors.toList())` | `.toList()` |
|  | `joining()` | Spojí texty dohromady | `.collect(Collectors.joining(", "))` |
| **Procházení streamu** | `forEach()` | Provede akci nad každým prvkem | `.forEach(System.out::println)` |
|  | `peek()` | Umožní nahlédnout na data (debug) | `.peek(System.out::println)` |
| **Vyhledávání** | `findFirst()` | Vrátí první prvek | `.findFirst()` |
|  | `findAny()` | Vrátí libovolný prvek (užitečné u paralelního streamu) | `.findAny()` |
|  | `anyMatch()` | Zjistí, zda nějaký prvek splňuje podmínku | `.anyMatch(x -> x > 10)` |
|  | `allMatch()` | Zjistí, zda všechny prvky splňují podmínku | `.allMatch(x -> x > 0)` |
|  | `noneMatch()` | Zjistí, zda žádný prvek nesplňuje podmínku | `.noneMatch(x -> x < 0)` |
| **Paralelní zpracování** | `parallelStream()` | Spustí stream paralelně | `list.parallelStream()` |
|  | `sequential()` | Přepne zpět na sekvenční zpracování | `.sequential()` |

---

📘 **Tip:**  
Pokud si nejsi jistý, jestli metoda stream „ukončí“ nebo jen „připraví další krok“, pamatuj:
- 🌀 **Meziproduktové (intermediate)** – vrací nový stream (např. `filter`, `map`, `sorted`)
- 🏁 **Terminální (terminal)** – ukončí stream a vrátí v

