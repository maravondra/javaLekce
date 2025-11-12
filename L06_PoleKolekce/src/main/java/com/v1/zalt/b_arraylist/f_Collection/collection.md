Třída `Collection` v Javě je rozhraní (ne konkrétní třída) v rámci balíku `java.util`, které definuje základní metody
pro práci s kolekcemi objektů. Poskytuje základní rámec pro struktury, jako jsou seznamy, množiny nebo fronty, které
sdílejí podobné operace. Rozhraní `Collection` obsahuje základní metody, jako:

- `add()`: Přidá prvek do kolekce.
- `remove()`: Odstraní konkrétní prvek z kolekce.
- `size()`: Vrátí počet prvků v kolekci.
- `isEmpty()`: Vrátí, zda je kolekce prázdná.
- `contains()`: Zkontroluje, zda kolekce obsahuje určitý prvek.
- `iterator()`: Poskytuje iterátor pro průchod prvky kolekce.

`Collection` tedy vytváří sjednocený rámec, který mohou implementovat konkrétní typy kolekcí, jako jsou `List`, `Set`
a `Queue`. Každá z těchto implementací pak může mít různé vlastnosti a chování – například seznamy jsou pořadové,
množiny obsahují jen unikátní prvky a fronty umožňují přístup k prvkům podle specifických pravidel.

Je to praktické, protože díky rozhraní `Collection` můžeš psát univerzální kód, který bude fungovat s různými typy
kolekcí, což výrazně zjednodušuje práci s daty a zvyšuje flexibilitu tvé aplikace.

## Metody třídy `Collections`

Zde jsou některé užitečné metody:

* Collections.sort(List<T> list)
  Seřadí prvky v seznamu list podle jejich přirozeného řazení (např. List<String> seřadí abecedně).

Pro použití s vlastní logikou můžeš použít Collections.sort(List<T> list, Comparator<? super T> c), kde Comparator
definuje pořadí.

* Collections.reverse(List<?> list)
  Obrátí pořadí prvků v seznamu list, takže první prvek se stane posledním a naopak. Toto je užitečné, pokud chceš
  rychle
  převrátit uspořádání seznamu.

Collections.shuffle(List<?> list)
Náhodně zamíchá pořadí prvků v seznamu list, což je vhodné pro případy, kdy chceš náhodný pořadí, například pro karty
nebo otázky v testu.

Collections.frequency(Collection<?> c, Object o)
Vrátí počet výskytů prvku o v kolekci c. Pomůže, když chceš zjistit, kolikrát se konkrétní prvek objevil.

Collections.replaceAll(List<T> list, T oldVal, T newVal)
Nahradí všechny výskyty hodnoty oldVal hodnotou newVal v seznamu list. Pomocí této metody můžeš snadno upravit určité
hodnoty.

Collections.binarySearch(List<? extends Comparable<? super T>> list, T key)
Provede binární vyhledávání prvku key v seřazeném seznamu list a vrátí jeho index. Pokud prvek nenajde, vrátí záporné
číslo. Seznam musí být předem seřazen, aby tato metoda fungovala správně.

Collections.copy(List<? super T> dest, List<? extends T> src)
Zkopíruje všechny prvky ze seznamu src do seznamu dest. dest musí mít stejnou nebo větší velikost než src.

Collections.fill(List<? super T> list, T obj)
Naplní celý seznam list stejnou hodnotou obj. Můžeš použít, pokud chceš inicializovat nebo přepsat seznam stejnými
hodnotami.

Collections.disjoint(Collection<?> c1, Collection<?> c2)
Vrátí true, pokud kolekce c1 a c2 nemají žádné společné prvky (jsou disjunktní). To je užitečné pro kontrolu, zda dvě
kolekce nemají žádný překryv.

Collections.unmodifiableList(List<? extends T> list)
Vytvoří neměnnou (read-only) verzi seznamu list. Jakýkoli pokus o úpravu výsledného seznamu vyvolá výjimku
UnsupportedOperationException.