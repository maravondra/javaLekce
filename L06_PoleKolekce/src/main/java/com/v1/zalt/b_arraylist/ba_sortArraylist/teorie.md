## 1. Úvod do `ArrayList`

`ArrayList` je dynamická datová struktura v Javě, která umožňuje ukládání objektů a jejich přidávání nebo odebírání. Na
rozdíl od běžného pole (`array`) je velikost `ArrayList` flexibilní, což znamená, že se automaticky přizpůsobí podle
potřeby.

### Příklad použití `ArrayList`:

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        System.out.println(list);
    }
}
