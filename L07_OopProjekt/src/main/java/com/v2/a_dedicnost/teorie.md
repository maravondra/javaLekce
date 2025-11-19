# 🧩 Dědičnost v Javě (Inheritance)

## 1. Co je dědičnost
Dědičnost je **mechanismus v objektově orientovaném programování**, který umožňuje:
- **vytvářet nové třídy na základě existujících tříd**,
- **přebírat (dědit)** jejich vlastnosti a metody,
- a **rozšiřovat nebo upravovat** jejich chování.

👉 Cílem je **znovupoužití kódu** a **zjednodušení hierarchie objektů**.

---

## 2. Základní terminologie

| Pojem | Význam |
|--------|---------|
| **Parent class (Superclass / Base class)** | Třída, ze které se dědí (např. `Animal`) |
| **Child class (Subclass / Derived class)** | Třída, která dědí od jiné třídy (např. `Dog`) |
| **extends** | Klíčové slovo, které označuje dědění |
| **super** | Odkaz na nadřazenou třídu (její konstruktor nebo metody) |

---

## 3. Syntaxe

```java
class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // zděděná metoda
        dog.bark();  // vlastní metoda
    }
}
```

**Výstup:**
```
Animal eats.
Dog barks.
```

---

## 4. Konstruktor a `super`

Dědičnost se vztahuje i na **konstruktory**, i když se **nedědí přímo**.  
Každá podtřída **automaticky volá konstruktor nadtřídy** – buď implicitně, nebo pomocí `super()`.

```java
class Animal {
    Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // volá konstruktor Animal()
        System.out.println("Dog created");
    }
}
```

**Výstup:**
```
Animal created
Dog created
```

---

## 5. Přepisování metod (Overriding)

Podtřída může **přepsat metodu** nadtřídy, aby změnila její chování.

```java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
```

💡 Anotace `@Override` zajišťuje, že metoda opravdu přepisuje něco z nadtřídy (a ne třeba překlepem tvoří novou metodu).

---

## 6. Klíčové slovo `final`

- `final class` → nelze z ní dědit
- `final method` → nelze ji přepsat

```java
final class Car { }  // z této třídy nelze dědit

class Vehicle {
    final void start() {
        System.out.println("Starting...");
    }
}
```

---

## 7. Typy dědičnosti

| Typ | Popis | V Javě? |
|------|--------|----------|
| **Single Inheritance** | Jedna třída dědí od jedné jiné | ✅ |
| **Multilevel Inheritance** | Řetězec dědičnosti (např. `A -> B -> C`) | ✅ |
| **Hierarchical Inheritance** | Více tříd dědí z jedné | ✅ |
| **Multiple Inheritance** | Dědění z více tříd | ❌ (řeší se přes rozhraní – `interface`) |

---

## 8. Dědičnost vs. kompozice

- **Dědičnost (is-a)** – `Dog is an Animal`
- **Kompozice (has-a)** – `Car has an Engine`

💡 Doporučení: pokud lze použít kompozici místo dědičnosti, často je to lepší volba kvůli menší závislosti tříd.

---

## 9. Dědičnost a polymorfismus

Dědičnost umožňuje **polymorfismus**, tedy chování závislé na typu objektu.

```java
Animal a = new Dog();
a.makeSound();  // V době běhu se volá metoda z Dog
```

💬 I když proměnná `a` má typ `Animal`, díky **dynamickému dispatchingu** se spustí metoda `Dog.makeSound()`.

---

## 10. Čemu se při dědičnosti vyhnout

- Zbytečně hluboké hierarchie (těžko udržovatelné)
- Porušování principu **Liskov Substitution Principle**
- Sdílení stavů přes `protected` proměnné
- Dědění tam, kde se lépe hodí **kompozice**

---

## 11. Shrnutí

✅ Dědičnost umožňuje:
- znovupoužití kódu
- logické členění tříd
- polymorfní chování

⚠️ Ale:
- může zvýšit složitost kódu
- špatné použití vede k těžko rozšiřitelnému návrhu

---
