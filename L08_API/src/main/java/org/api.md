## Posilani API

Link: https://reqres.in/

## Typy API

### SOAP

je protokolem pro výměnu zpráv založených na XML přes síť, hlavně pomocí HTTP.

**nevyhody**

- Velký zápis komunikace.
- Složitost.
- Pomalé zpracování jednotlivými systémy (složité na parsovaní a validaci).

### REST

**vyhody**

- jednoduché a změnám odolné rozhraní – snadná rozšiřitelnost
- malé nároky na klienta z hlediska porozumění sémantice operací
- transparentnost – resource lze na „cestě“ velice snadno cacheovat, transformovat atd.

# GraphQL

Link: https://www.itnetwork.cz/javascript/graphql/graphql-graphql-vs-rest

Světlo světa GraphQL spatřilo roku 2012. Autorem je firma Meta
Platforms (dříve Facebook), která jej vyvinula pro
potřebu efektivní a rychlé komunikace mezi mobilními zařízeními.

## Proč

| Funkce                          | Rest                         |
|---------------------------------|------------------------------|
| Pro načtení všech dat uživatele | GET /uzivatel/<id>           |
| Seznam prispevku                | GET /uzivatel/<id>/prispevky |  
| Sledujici uzivatele             | GET /uzivatel/<id>/sledujici |  

Pro získání potřebných dat je zapotřebí se připojit ke všem třem
přístupovým bodům a stáhnout všechna data. Včetně těch, která
nepotřebujeme.

**V GraphQL nám stačí jeden přesně formulovaný
dotaz:**

```
{
    "query" : {
        Uzivatel(id: "123456")
        jmeno
        prispevky{
          titulek
        }
        sledujici(posledni: 2){
          jmeno
        }
    }
}
```

Pak bude nasledujici odpoved

```
{
   "data" : {
      "Uzivatel" :{
        "jmeno": "marie",
        "prispevky" : [
        {"titulek": "engeto"}
        ]
        "sledujici": [
          {"jmeno":"prvni"},
          {"jmeno":"dana"},
        ]
   }
}
```

1) REST pro komunikaci s databází používá různé metody
   (součásti protokolu HTTP). Nejčastěji používané metody jsou
   GET pro čtení dat, POST pro přidání nových dat,
   PUT pro změnu existujících dat a DELETE pro
   smazání dat.

2) Naproti tomu GraphQL používá základní
   dotaz (Query), který zastává funkci načítání dat.
   Pro vše ostatní, jako je úprava, vkládání a mazání dat se používá
   mutace (Mutation).


