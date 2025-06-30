# 📘 Výjimky v Javě – Úvod pro začátečníky

Výjimky (angl. *exceptions*) jsou způsob, jak v Javě ošetřit **chyby nebo neočekávané situace**, ke
kterým může dojít za běhu programu (runtime).

---

## ❗ Proč používat výjimky?

Bez výjimek by program při chybě **spadl** a dál by nepokračoval.

S výjimkami můžeš:

- **Zachytit chybu**
- **Reagovat na ni** (např. vypsat chybovou hlášku, zkusit něco jiného, nebo korektně ukončit
  aplikaci)

---


---

## 🛠️ Použití výjimek

### 1. `try` / `catch` – zachycení výjimky

```java
try {
    int vysledek = 10 / 0;  // způsobí výjimku
    System.out.println("Výsledek: " + vysledek);
} catch (ArithmeticException e) {
    System.out.println("Chyba: Dělení nulou není povoleno!");
}


