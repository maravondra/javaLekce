# JSON

JSON znamená "JavaScript Object Notation" a je to formát pro výměnu dat. Je to velmi populární
způsob, jak strukturovat data, zejména v webovém prostředí.

JSON vypadá jako soubor slovníků v Pythonu nebo jako objekt v JavaScriptu. Skládá se z párování
klíčů a hodnot, přičemž klíče jsou řetězce a hodnoty mohou být jakéhokoli typu dat, včetně řetězců,
čísel, boolean hodnot, pole a dokonce i dalších JSON objektů.

```json
{
  "jmeno": "John",
  "prijmeni": "Doe",
  "vek": 30,
  "zamestnani": "programator",
  "plat": 50000,
  "zamestnavatel": {
    "nazev": "Acme Inc.",
    "adresa": "123 Main Street"
  },
  "projekty": [
    "projekt1",
    "projekt2",
    "projekt3"
  ]
}
```

V tomto příkladu máme JSON objekt reprezentující osobu. Klíče jako "jmeno", "vek", "plat" jsou
spojeny s jejich odpovídajícími hodnotami.

JSON se používá pro přenos dat mezi serverem a klientem v různých programovacích jazycích, protože
je snadno čitelný pro lidi a snadno zpracovatelný pro stroje.

## Proc json

Plno programu muze velmi jednoduse konvertovat JSON format do objektu

## JSON syntax

+ Data jsou v párech název/hodnota
+ Data jsou oddělena čárkami
+ Složené závorky drží předměty
+ Hranaté závorky obsahují pole

link: https://www.w3schools.com/js/js_json_datatypes.asp

### Jmeno a hodnota

```json
"name" : "John"
```

### Objekt v JSON

```json
{
  "name": "John"
}
```

## Datove typy

- a string

```json
{
  "name": "John"
}
```

- a number

```json
{
  "age": 30
}
```

- an object

```json
{
  "employee": {
    "name": "John",
    "age": 30,
    "city": "New York"
  }
}
```

- an array

```json
{
  "employees": [
    "John",
    "Anna",
    "Peter"
  ]
}
```

- a boolean

```json
{
  "sale": true
}
```

- null

```json
{
  "middlename": null
}
```

## Formatovat json

Link: https://jsonformatter.curiousconcept.com/#
Link: https://jsonformatter.org/

**Spatny json**

```json 
{
  "topic": "Informace o knihách",
  "books": [
    {
      "title": "Válka světů",
      "author": "H.G. Wells",
      "year": 1898
    },
    {
      "title": "1984",
      "author": "George Orwell",
      "year": 1949,
      "genre": "dystopický román"
    },
    {
      "title": "Mistr a Markétka",
      "author": "Michail Bulgakov",
      "year": 1966
    }
    {
      "title": "To Kill a Mockingbird",
      "author": "Harper Lee",
      "year": 1960
    }
  ],
  "count": 4
}
```

** spravny json**

```json 
{
  "topic": "Informace o knihách",
  "books": [
    {
      "title": "Válka světů",
      "author": "H.G. Wells",
      "year": 1898
    },
    {
      "title": "1984",
      "author": "George Orwell",
      "year": 1949,
      "genre": "dystopický román"
    },
    {
      "title": "Mistr a Markétka",
      "author": "Michail Bulgakov",
      "year": 1966
    },
    {
      "title": "To Kill a Mockingbird",
      "author": "Harper Lee",
      "year": 1960
    }
  ],
  "count": 4
}
```