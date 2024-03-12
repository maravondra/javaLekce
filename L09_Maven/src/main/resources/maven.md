# Maven

## Vysvelteni pom

`<modelVersion>` - Tento element specifikuje verzi modelu POM, kterým je 4.0.0.

`<parent>` - Tato část definuje rodičovský POM, ze kterého tento projekt dědí konfiguraci. Projekt zdědil konfiguraci z
org.example:lekce_engeto verze 1.0-SNAPSHOT.

`<groupId>` - Jedná se o identifikátor skupiny, který identifikuje projekt. V tomto případě je skupina com.engeto.

`<artifactId>` - Toto je identifikátor artefaktu (tj. projektu). V tomto případě je to L09_Maven.

`<properties>` - Tato část obsahuje vlastnosti (properties) projektu. V tomto případě jsou zde definovány vlastnosti pro
verzi kompilátoru Javy (maven.compiler.source a maven.compiler.target) a kódování zdrojových souborů (
project.build.sourceEncoding). Kompilátor Java by měl používat verzi 17 pro zdrojové soubory a cílovou platformu.
Zdrojové soubory by měly být kódovány v UTF-8.

`<packaging>` - Tato část specifikuje typ balíčku, který bude vytvořen pro tento projekt. V tomto případě je balíček
typu JAR (Java Archive), což je běžný formát pro distribuci knihoven a aplikací napsaných v Javě.

`<version>` - Tato část definuje verzi projektu. V tomto případě je verze 0.1.0. Verze je číselný řetězec, který
umožňuje identifikovat a sledovat změny v projektu v průběhu času.

## Dependencies

https://mvnrepository.com/artifact/org.projectlombok/lombok

potom udelal update.

1) vysvetlit co je to Maven build

Fáze `pre-clean` v Mavenu je jedna ze standardních fází životního cyklu projektu. Tato fáze se spouští před provedením
čistění (smazání) zdrojových a kompilovaných souborů projektu.

Během fáze `pre-clean` Maven vykonává různé úkoly definované ve vašem projektu, které je třeba provést předtím, než
budou
soubory smazány. To může zahrnovat například:

- Odstranění dočasných souborů generovaných při předchozích sestaveních.
- Vyčištění adresářů určených pro kompilaci.
- Provedení konfiguračních úkonů před čištěním, pokud jsou definovány v pluginu nebo skriptech.

Fáze `pre-clean` poskytuje možnost provést úkoly před tím, než bude spuštěna samotná čistící operace. To může být
užitečné
například pro přípravu prostředí nebo provedení dodatečných úprav před vyčištěním projektu.

1) spustit pres okno
2) spustit pres run configurations
3) podivat se na target