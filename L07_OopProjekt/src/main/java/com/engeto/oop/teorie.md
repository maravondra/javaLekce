Deklarace metody v Javě je tedy následující:

```
[modifikátorPřístupu] [návratovýTyp] [názevMetody]([parametry])
```

# Zapoudreni

Pro jednoduchosti jste nastavovali všechny atributy naší třídy
jako `public`, tedy jako veřejně přístupné. Většinou se však
spíše nechce, aby se daly zvenčí modifikovat a používá se modifikátor
`private`. Atribut je poté viditelný jen uvnitř třídy a zvenčí
se Java tváří, že vůbec neexistuje. Při návrhu třídy tedy nastavíme
vše na `private` a v případě, že něco bude opravdu potřeba
vystavit, použijeme `getter` and `setter`.

1) S hodnotami atributů objektu A může manipulovat vždy pouze tentýž objekt A
2) Žádný jiný objekt (ani objekt téže třídy) by neměl mít možnost manipulovat s hodnotami atributů
   našeho objektu.
3) Pokud chceme, aby objekt změnil hodnotu svých atributů (tedy aby přešel do jiného stavu), pošleme
   mu zprávu (zavoláme některou z metod tohoto objektu).

# Abstrakce

že každý objekt musí pohlížet na ostatní objekty jako na „černé skříňky“, které mají jasně dané
ovládací prvky (rozhraní), ale nesmí spoléhat na to, jak fungují uvnitř.

