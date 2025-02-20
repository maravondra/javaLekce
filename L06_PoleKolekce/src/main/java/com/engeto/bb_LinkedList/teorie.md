# 📚 Java LinkedList – Školení

## 1️⃣ Úvod do LinkedList

`LinkedList` je součástí **Java Collections Framework** a implementuje rozhraní `List`, `Deque` a `Queue`. Na rozdíl od
`ArrayList`, který používá dynamické pole, `LinkedList` je **dvojitě propojený seznam** (doubly linked list), kde každý
prvek obsahuje odkaz na předchozí a následující prvek.

## 2️⃣ Struktura LinkedList

Každý prvek (uzel) v `LinkedList` obsahuje:

- **Data** – uložená hodnota.
- **Odkaz na předchozí uzel** (prev).
- **Odkaz na následující uzel** (next).

📌 **Výhody:**
✔ Rychlé přidávání a odebírání prvků na začátku nebo uprostřed seznamu.  
📌 **Nevýhody:**
❌ Pomalejší přístup k prvkům (`O(n)`) oproti `ArrayList` (`O(1)`).

---

## 3️⃣ Vytvoření a použití LinkedList

### ✅ Import a základní operace

```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Vytvoření LinkedList
        LinkedList<String> seznam = new LinkedList<>();

        // Přidání prvků
        seznam.add("A");
        seznam.add("B");
        seznam.add("C");

        // Přidání na první a poslední pozici
        seznam.addFirst("X");
        seznam.addLast("Y");

        // Výpis seznamu
        System.out.println(seznam); // [X, A, B, C, Y]

        // Odebrání prvků
        seznam.removeFirst(); // Odstraní "X"
        seznam.removeLast();  // Odstraní "Y"
        seznam.remove(1);     // Odstraní "B"

        System.out.println(seznam); // [A, C]
    }
}
```

## 4️⃣ Výkonnostní srovnání LinkedList vs. ArrayList

| Operace             | LinkedList | ArrayList |
|---------------------|------------|-----------|
| Přidání na konec    | O(1)       | O(1)      |
| Přidání na začátek  | O(1)       | O(n)      |
| Odebrání ze začátku | O(1)       | O(n)      |
| Přístup k prvku     | O(n)       | O(1)      |

### Shrnutí:

Pokud často přidáváte/odebíráte prvky **uvnitř seznamu**, je `LinkedList` lepší volba. Pokud potřebujete **rychlý
náhodný přístup**, použijte `ArrayList`.

## 5️⃣ Použití jako Queue a Stack

### ✅ Queue (FIFO - First In, First Out)

`LinkedList` může být použit jako **Queue** pro správu dat v pořadí, jak byla přidána, což je princip FIFO.

```java
LinkedList<Integer> queue = new LinkedList<>();
queue.

add(10);  // Přidání na konec
queue.

add(20);
queue.

add(30);

System.out.

println(queue.poll());  // Odstraní a vrátí první prvek - 10
```

### ✅ Stack (LIFO - Last In, First Out)

`LinkedList` může být také použit jako **Stack**, kde se poslední přidaný prvek dostane jako první (LIFO).

```java
LinkedList<Integer> stack = new LinkedList<>();
stack.

push(10);  // Přidání na začátek
stack.

push(20);
stack.

push(30);

System.out.

println(stack.pop());  // Odstraní a vrátí poslední prvek - 30
```

## 6️⃣ Závěr

- `LinkedList` se hodí, když často přidáváte a mažete prvky.
- `ArrayList` je lepší pro rychlý přístup k prvkům.
- `LinkedList` lze použít jako **Queue** nebo **Stack**.

### 🔥 Otázky na procvičení:

1. Jaká je složitost operace `get(index)` v `LinkedList`?
2. Jak byste implementovali vlastní **jednoduchý** `LinkedList`?
3. Co se stane, pokud v `LinkedList` použijete `remove(Object)`?

### 🎯 Cvičení:

Napište program, který ukládá jména studentů do `LinkedList` a umožňuje je přidávat, mazat a zobrazovat.
