# Kolekce

## Generické kolekce

Generické kolekce řeší problém s datovým typem na úrovni jazyka Java.
Zavádí tzv. genericitu. Zjednodušeně řečeno se jedná o možnost
specifikovat datový typ až ve chvíli vytvoření instance. Ve třídě
samotné kolekce se poté pracuje s generickým typem, který slouží jako
zástupce pro budoucí datový typ. Můžeme si to představit tak, že se
generický typ ve třídě změní např. na `String` ve chvíli,
když vytvoříme její instanci. Jedná se tedy o možnost třídy nějakým
způsobem parametrizovat.

![collections_hiearchie.png](..%2F..%2F..%2F..%2Fresources%2Fimage_md%2Fcollections_hiearchie.png)

Seznam nejčastěji využívá toho, že ačkoli velikost pole nemůžeme za
běhu programu měnit, můžeme za běhu vytvořit pole nové.

Metody a další prvky na třídě
List

Popišme si důležité metody na tomto rozhraní. List tvoří
základ pro všechny seznamy v Javě a obsahuje zejména následující
metody:

- `add()`, `addAll()` - Pro přidání nových prvků do listu tu máme dvě metody. První z nich přidá jeden prvek, jenž
  uvedeme v
  parametru. Druhá, jak název napovídá, přidá více prvků. Jako parametr
  tudíž bere jinou kolekci.

- `clear()` - Metoda clear() vymaže všechny prvk.

- `contains()` - Pomocí metody contains() zjišťujeme, zda list obsahuje daný prvek. Získáme hodnotu typu
  boolean.

- `toArray()` - Další metoda zkopíruje prvky z listu do pole.

- `remove()`, `removeAll()` - Pro mazání prvků z kolekce máme také dvě metody. Fungují podobně, jako add() a addAll().
  Obě jsou velmi užitečné v případě, že máme v listu instance nějaké třídy (např. uživatele), nemusíme si držet jejich
  číselné indexy, jen zavoláme např. list.remove(karel), kdy předáme konkrétní instanci, která se má ze seznamu odebrat.

- `retainAll()` - Metoda retainAll() umožňuje porovnávat dvě kolekce a zachová pouze prvky, které mají společné.

- `size()` - Pro zjištění počtu prvků v kolekci voláme metodu size().

### Priklad

Je potřeba napsat program (něco jako manager) kde budeme evidovat návštěvy v našem hotelu.

- přidat návštěvu s rattingenm
- přidat návštěvu bez rattingu
- vypsat všechny návštévy a to buď rattingem nebo i bez

# Srovnání ArrayList a LinkedList podle použití

## 1. Přehled

`ArrayList` a `LinkedList` jsou dvě implementace rozhraní `List` v Javě, každá s odlišnými výhodami a nevýhodami. Výběr
správné struktury závisí na konkrétním scénáři použití.

---

## 2. Srovnání použití

| Kritérium                                | ArrayList                                       | LinkedList                                              |
|------------------------------------------|-------------------------------------------------|---------------------------------------------------------|
| **Rychlý přístup k prvkům podle indexu** | ✅ **Ano** (O(1)) - přímý přístup přes index     | ❌ **Ne** (O(n)) - musí projít seznam                    |
| **Časté přidávání/mazání na konci**      | ✅ **Ano** (O(1), pokud není třeba zvětšit pole) | ✅ **Ano** (O(1))                                        |
| **Časté přidávání/mazání na začátku**    | ❌ **Ne** (O(n) - nutnost posunout prvky)        | ✅ **Ano** (O(1))                                        |
| **Časté přidávání/mazání uprostřed**     | ❌ **Ne** (O(n) - posun prvků)                   | ✅ **Ano** (O(1), pokud máme referenci na uzel)          |
| **Paměťová náročnost**                   | ✅ **Nižší** - uloženo v poli                    | ❌ **Vyšší** - navíc reference na předchozí a další uzel |
| **Iterace přes prvky**                   | ✅ **Rychlá** díky sekvenčnímu ukládání          | ❌ **Pomalejší** kvůli ukazatelům                        |
| **Vhodné pro velké množství dat?**       | ✅ **Ano** - lepší cache efektivita              | ❌ **Ne** - více overheadu kvůli referencím              |

---

## 3. Kdy použít **ArrayList**?

- **Potřebuješ častý přístup k prvkům podle indexu.**
- **Seznam se málo mění (málo mazání a vkládání).**
- **Paměťová efektivita je důležitá.**
- **Použití pro čtení dat, kde se seznam mění jen minimálně.**

## 4. Kdy použít LinkedList?

- Potřebuješ **často přidávat nebo mazat prvky** (zejména **na začátku nebo uprostřed**).
- **Přístup k prvkům podle indexu není kritický**.
- Struktura **často mění svůj obsah a velikost**.
- Vhodné pro **fronty (FIFO)** nebo **zásobníky (LIFO)**.

## 5 Shrnutí

- **Použij `ArrayList`**, pokud se seznam **častěji čte než upravuje**.
- **Použij `LinkedList`**, pokud **často přidáváš nebo mažeš prvky uprostřed seznamu**.

# Časová složitost

## 1. Úvod do O(1)

O(1) označuje **konstantní časovou složitost** v analýze algoritmů.  
To znamená, že doba běhu operace je **nezávislá na velikosti vstupních dat**.

Jinými slovy, operace trvá **stejně dlouho**, ať už pracujeme s **10** prvky nebo s **milionem** prvků.

---

## 3. Porovnání s jinými složitostmi

| Notace       | Název            | Příklad použití                          |
|--------------|------------------|------------------------------------------|
| **O(1)**     | Konstantní čas   | Přístup k prvku v `ArrayList`            |
| **O(n)**     | Lineární čas     | Procházení všech prvků seznamu           |
| **O(log n)** | Logaritmický čas | Hledání v setříděném `TreeSet`           |
| **O(n²)**    | Kvadratický čas  | Dvojitý `for` cyklus (např. Bubble Sort) |
