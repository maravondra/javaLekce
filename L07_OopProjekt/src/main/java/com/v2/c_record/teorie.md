## 🔍 Co je record?

record je speciální typ třídy v Javě, který byl představen od Java 14 (preview) a oficiálně od Java

16. Je určen pro neměnitelné (immutable) datové objekty – ideální pro objekty, které slouží k
    přenosu dat (např. DTO, response objekty, klíče do mapy).

## ✅ Hlavní vlastnosti

* Automaticky generuje:
    * konstruktor
    * gettery (nazývané jako name() místo getName())
    * toString()
    * equals() a hashCode()
* Všechny pole jsou final a nemohou se měnit.
* Nejde dědit od jiného recordu (record je automaticky final).
* Konstruktor a metody si ale můžeš předefinovat.

## 🧱 Syntaxe

```java

public record Person(String name, int age) {

}

public class RecordDemo {

  public static void main(String[] args) {
    Person p = new Person("Alice", 30);

    System.out.println(p.name()); // Alice
    System.out.println(p.age());  // 30
    System.out.println(p);        // Person[name=Alice, age=30]
  }
}
```

## 🛑 Co NEjde u recordu

* Nemůžeš měnit hodnoty (pole jsou final).
* Není možné dědit z jiné třídy nebo recordu.
* Nemá settery.
* Konstruktor kontroluje pouze při vytváření – později už hodnoty změnit nelze.

## ✍️ Vlastní konstruktor (volitelně)

```java

public record Person(String name, int age) {

  public Person {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }
  }

  public String nameUpperCase() {
    return name.toUpperCase();
  }
}

public class RecordDemo {

  public static void main(String[] args) {
    Person p = new Person("Alice", 30);
    System.out.println(p.nameUpperCase()); // ALICE

    // p.age = 31; // Chyba - pole je final
  }
}
```

## 🧠 Kdy použít record?

Použij record, když:

* potřebuješ jen přenášet data,
* nechceš řešit přepisování equals, hashCode, toString,
* nechceš, aby se objekt měnil po vytvoření,
* nepotřebuješ složité chování nebo dědičnost.