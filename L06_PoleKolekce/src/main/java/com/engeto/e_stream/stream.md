# Stream
StreamAPI představuje novou abstraktní vrstvu, pomocí které lze
zpracovávat data z kolekcí. Spolu se StreamAPI, které přišlo s Javou verze
8, se objevily také lambda výrazy, které velmi zjednodušují zápis dotazu.


![stream_cycle.svg.svg](..%2F..%2F..%2F..%2Fresources%2Fimage_md%2Fstream_cycle.svg.svg)

## Vlastnosti streamu

1. Stream není nová datová struktura a neukládá si někam prvky, se kterými pracuje.
2. Operace nad streamem dat nemění původní data. Místo toho tvoří stream nový.
3. Operace nad streamy jsou tzv. lazy-evaluated. To znamená, že jednotlivé operace nad daty ve streamu se provádějí postupně.
4. Streamy mohou mít konečnou i nekonečnou velikost.
5. Prvky streamu jsou vždy zpracovány pouze jednou.
6. Streamy umožňují jednoduché paralelní zpracování kolekcí.
7. Jednou vytvořená instance streamu nelze použít vícekrát.

Možná už umíš používat for cykly k procházení seznamů. Streamy jsou ale způsob, jak totéž dělat elegantněji, rychleji a čitelněji. Představ si to jako výrobní linku v továrně, kde na začátku hodíš bednu surovin a na konci ti vypadne hotový, zabalený produkt.

# Co je to vlastně Stream?
   Stream v Javě není datová struktura (jako třeba ArrayList). Stream neukládá data. Je to spíše potrubí, kterým data protékají. Během toho, co protékají, je můžeme:

1. Filtrovat (vyhodit, co nechceme). 
2. Transformovat (změnit jejich podobu). 
3. Spočítat nebo sesbírat (vytvořit výsledek).

Tři fáze práce se Streamem:
1. Zdroj (Source): Odkud data bereme (např. ze seznamu). 
2. Mezioperační kroky (Intermediate Operations): Úpravy dat. Tyto operace jsou "líné" – neprovedou se, dokud nespustíme finále. 
3. Terminální operace (Terminal Operation): Uzavření streamu a získání výsledku.

# Praktická ukázka: Od cyklu ke Streamu

Představ si, že máme seznam jmen a chceme vybrat jen ta, která začínají na písmeno "A", převést je na velká písmena a uložit do nového seznamu.

Starý způsob (pro srovnání):
``` java
List<String> jmena = Arrays.asList("Alena", "Borek", "Adam", "Cyril");
List<String> vysledek = new ArrayList<>();

for (String jmeno : jmena) {
 if (jmeno.startsWith("A")) {
  vysledek.add(jmeno.toUpperCase());
 }
}
```

Moderní způsob (Stream API):
``` java
List<String> jmena = Arrays.asList("Alena", "Borek", "Adam", "Cyril");

List<String> vysledek = jmena.stream()            // 1. Zdroj
.filter(j -> j.startsWith("A"))              // 2. Filtrace
.map(String::toUpperCase)                    // 3. Transformace
.toList();                                   // 4. Terminální operace

```

# Komplexnější příklad (Práce s objekty)
``` java
class Student {
    String jmeno;
    int znamka;
    // ... konstruktor a gettery
}

// Seznam studentů
List<Student> studenti = Arrays.asList(
    new Student("Petr", 1),
    new Student("Jana", 3),
    new Student("Lucie", 5),
    new Student("Marek", 2)
);

double prumer = studenti.stream()
    .filter(s -> s.getZnamka() < 5)         // Vynecháme ty, co mají 5
    .mapToInt(Student::getZnamka)          // Zaměříme se jen na čísla (známky)
    .average()                             // Spočítáme průměr
    .orElse(0.0);                          // Pokud by byl seznam prázdný, vrátíme 0.0

System.out.println("Průměr úspěšných: " + prumer);

``` 

# Na co si dát pozor (Rady učitele)
1) Stream je jednorázový: Jakmile nad streamem zavoláš terminální operaci (např. toList() nebo count()), stream se uzavře. Nemůžeš ho použít znovu. Musíš vytvořit nový. 
2) Líné vyhodnocování (Laziness): Stream neudělá nic, dokud nezavoláš terminální operaci. Můžeš mít 100 filtrů, ale dokud neřekneš "teď mi dej výsledek", Java ani nepohne prstem. 
3) Čitelnost vs. Výkon: Pro malé seznamy je klasický cyklus občas o mikrosekundu rychlejší, ale v 99 % případů volíme Stream kvůli čistotě kódu a snadné údržbě.