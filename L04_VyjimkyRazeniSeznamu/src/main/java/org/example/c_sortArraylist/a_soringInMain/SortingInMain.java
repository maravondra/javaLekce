package org.example.c_sortArraylist.a_soringInMain;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class SortingInMain {

  public static void main(String[] args) {
    ArrayList<Person> list = new ArrayList<>();
    list.add(new Person("Alice", 30));
    list.add(new Person("Bob", 25));
    list.add(new Person("Charlie", 35));

    System.out.println("Před řazením: " + list);

    /**
     * Jak funguje compare v Comparator?
     * Metoda compare porovnává dva objekty a vrací celé číslo, které říká, jak mají být tyto objekty seřazeny.
     *
     * Přesněji:
     * Pokud vrátí záporné číslo (< 0), znamená to, že p1 by měl být před p2.
     *
     * Pokud vrátí 0, znamená to, že p1 a p2 jsou považováni za stejné z hlediska řazení.
     *
     * Pokud vrátí kladné číslo (> 0), znamená to, že p1 by měl být za p2.
     */
    // Řazení podle věku (vzestupně)
    Collections.sort(list, new Comparator<Person>() {
      @Override
      public int compare(Person p1, Person p2) {
        return Integer.compare(p1.age, p2.age);
      }
    });

    System.out.println("Po řazení podle věku: " + list);

    Collections.shuffle(list);
    System.out.println("Po promíchání: " + list);

    // napsani pomoci lambda vyrazu
    list.sort((p1, p2) -> Integer.compare(p1.age, p2.age));

    System.out.println("Po řazení podle věku pomocí lambda: " + list);

    Collections.shuffle(list);
    // jeste jednou pro ukazku
    /**
     * Rozbor: list.sort(...)
     *   sort je metoda z Java 8, která se dá zavolat přímo na List.
     *   Očekává objekt, který implementuje rozhraní Comparator<T>.
     *   Ten určuje, jak prvky seřadit.
     * Comparator.comparingInt(...)
     *   Statická metoda v rozhraní Comparator.
     *   Vezme funkci, která z objektu vrací int (v tomto případě věk osoby).
     *   Vrací Comparator, který seřadí objekty podle hodnot, které funkce vrací.
     *p -> p.age
     *   To je tzv. lambda výraz.
     *   p je parametr, což je instance třídy Person.
     *   p.age znamená, že pro každý prvek chceme porovnávat právě jeho věk (int).
     * */
    list.sort(Comparator.comparingInt(p -> p.age));

    // uplne stejna vec, ale s pouzitim metody getAge
    /**
     *
     * list.sort(Comparator.comparingInt(...)) je stále nejjednodušší a nejčistší způsob řazení podle int hodnoty.
     * Můžeš využít metodové reference (Person::getAge) pro větší přehlednost.
     */
    list.sort(Comparator.comparingInt(Person::getAge));

    /**
     * Řazení podle více kritérií (multi-level sort)
     * Příklad: Nejprve podle věku, pak podle jména.
     */
    list.sort(
        Comparator.comparingInt(Person::getAge)
            .thenComparing(Person::getName)
    );

    /**
     *✅ 4. Řazení pomocí streamů
     * Vhodné pro případy, kdy nechceš měnit původní kolekci:
     */
    List<Person> sorted = list.stream()
        .sorted(Comparator.comparingInt(Person::getAge))
        .toList();

    /**
     * ✅ 7. Řazení s lokální komparací – česká diakritika
     */
    Collator czCollator = Collator.getInstance(new Locale("cs", "CZ"));
    list.sort(Comparator.comparing(Person::getName, czCollator));

  }
}
