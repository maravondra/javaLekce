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


- `add()`, `addAll()` - Pro přidání nových prvků do listu tu máme dvě metody. První z nich přidá jeden prvek, jenž uvedeme v
	parametru. Druhá, jak název napovídá, přidá více prvků. Jako parametr
	tudíž bere jinou kolekci.

- `clear()` - Metoda clear() vymaže všechny prvk.

- `contains()` - Pomocí metody contains() zjišťujeme, zda list obsahuje daný prvek. Získáme hodnotu typu
	boolean.

- `toArray()` - Další metoda zkopíruje prvky z listu do pole.

- `remove()`, `removeAll()` - Pro mazání prvků z kolekce máme také dvě metody. Fungují podobně, jako add() a addAll(). Obě jsou velmi užitečné v případě, že máme v listu instance nějaké třídy (např. uživatele), nemusíme si držet jejich číselné indexy, jen zavoláme např. list.remove(karel), kdy předáme konkrétní instanci, která se má ze seznamu odebrat.

- `retainAll()` - Metoda retainAll() umožňuje porovnávat dvě kolekce a zachová pouze prvky, které mají společné.

- `size()` - Pro zjištění počtu prvků v kolekci voláme metodu size().
### Priklad
Je potřeba napsat program (něco jako manager) kde budeme evidovat návštěvy v našem hotelu.

- přidat návštěvu s rattingenm 
- přidat návštěvu bez rattingu
- vypsat všechny návštévy a to buď rattingem nebo i bez

## Linked list
- `addFirst()` - Přidá nový prvek na začátek seznamu.
- `addLast()` - Přidá nový prvek na konec seznamu.
- `getFirst()` - Vrátí první prvek.
- `getLast()` - Vrátí poslední prvek.
- `removeFirst()` - Odstraní první prvek.
- `removeLast()` - Odstraní poslední prvek.