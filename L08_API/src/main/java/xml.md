# XML

XML znamená "eXtensible Markup Language" a je to další formát pro výměnu dat, stejně jako JSON. XML
byl jedním z prvních standardizovaných způsobů značkování dat pro použití na internetu.

XML používá značky k definici struktury a obsahu dat. Tyto značky jsou uzavřeny v hranatých
závorkách <>. Každá značka má začátek a konec, který označuje začátek a konec elementu. Elementy
mohou mít atributy, které poskytují další informace o tomto elementu.

```xml

<person>
    <name>John Doe</name>
    <age>30</age>
    <occupation>Programmer</occupation>
    <salary>50000</salary>
    <employer>
        <name>Acme Inc.</name>
        <address>123 Main Street</address>
    </employer>
    <projects>
        <project>Project 1</project>
        <project>Project 2</project>
        <project>Project 3</project>
    </projects>
</person>
```

V tomto příkladu máme XML dokument reprezentující stejná data jako JSON dokument v předchozím
příkladu. Každý prvek má značku, která určuje jeho název, a obsahuje hodnotu nebo další elementy.
Elementy mohou být vnořené do sebe, což umožňuje reprezentovat složitější struktury dat.

XML se často používá ve sdílení dat mezi různými systémy a aplikacemi, stejně jako JSON. Obecně se
říká, že XML je více uzavřený a složitý než JSON, ale má také své místo v mnoha situacích, zejména
tam, kde jsou vyžadovány striktní struktury dat.

## V detailu

XML and HTML were designed with different goals:

- XML was designed to carry data - with focus on what data is
- HTML was designed to display data - with focus on how data looks

**vyhody**

- XML zjednodušuje sdílení dat
- XML zjednodušuje přenos dat
- XML zjednodušuje změny platformy
- XML zjednodušuje dostupnost dat

## Struktura

```xml

<root>
    <child>
        <subchild>.....</subchild>
    </child>
</root>
```

Priklad

``` xml
<?xml version="1.0" encoding="UTF-8"?>
<bookstore>
  <book category="cooking">
    <title lang="en">Everyday Italian</title>
    <author>Giada De Laurentiis</author>
    <year>2005</year>
    <price>30.00</price>
  </book>
  <book category="children">
    <title lang="en">Harry Potter</title>
    <author>J K. Rowling</author>
    <year>2005</year>
    <price>29.99</price>
  </book>
  <book category="web">
    <title lang="en">Learning XML</title>
    <author>Erik T. Ray</author>
    <year>2003</year>
    <price>39.95</price>
  </book>
</bookstore>
```

Komenatere v XML

``` xml
<!-- This is a comment -->

```

## Atributy

Atributy jsou navrženy tak, aby obsahovaly data související s konkrétním prvkem.

``` xml
<person gender="female">
```

``` xml
<person gender="female">
  <firstname>Anna</firstname>
  <lastname>Smith</lastname>
</person>
```

``` xml
<person>
  <gender>female</gender>
  <firstname>Anna</firstname>
  <lastname>Smith</lastname>
</person>
```

In the first example, gender is an attribute. In the last example, gender is an element. Both
examples provide the same information.

There are no rules about when to use attributes or when to use elements in XML.

Validace: https://jsonformatter.org/xml-validator

## XML definovat

XML Schema is an XML-based alternative to DTD:

```xml

<xs:element name="note">

    <xs:complexType>
        <xs:sequence>
            <xs:element name="to" type="xs:string"/>
            <xs:element name="from" type="xs:string"/>
            <xs:element name="heading" type="xs:string"/>
            <xs:element name="body" type="xs:string"/>
        </xs:sequence>
    </xs:complexType>

</xs:element>
```

Vysvetleni

- <xs:element name="note"> defines the element called "note"
- <xs:complexType> the "note" element is a complex type
- <xs:sequence> the complex type is a sequence of elements
- <xs:element name="to" type="xs:string"> the element "to" is of type string (text)
- <xs:element name="from" type="xs:string"> the element "from" is of type string
- <xs:element name="heading" type="xs:string"> the element "heading" is of type string
- <xs:element name="body" type="xs:string"> the element "body" is of type string