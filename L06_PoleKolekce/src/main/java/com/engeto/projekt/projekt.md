### Zadani

Připrav **třídy** pro realizaci datového modelu sledování objednávek v restauraci.
Vytvořený kód bude **součástí backendu aplikace** pro terminály, které ovládají **číšníci a kuchaři
**   .

Celý systém má kromě evidence čekajících a vyřízených objednávek poskytovat i informace pro
účetnictví a podklady pro hledání optimalizací a slabých míst v přípravě a vydávání jídel.

***zásobník jídel  (dish + cook book)***
název (title)
cenu (price)
přibližnou dobu přípravy (preparation time) v minutách
URL odkaz na fotografii (image). -> Ulož pouze název souboru bez přípony <-

Doba přípravy musí být kladné číslo — systém nepovolí zadat záporné číslo či nulu.

Kuchaři mají možnost některá jídla ze zásobníku vyřadit, přidat, nebo upravit

je speciální fotografie s názvem blank

***Objednávky (orders)***
Restaurace má očíslované stoly.
Jedna objednávka popisuje objednání jednoho konkrétního jídla a vztahuje se ke konkrétnímu stolu

* jaké jídlo bylo objednáno
* kolik kusů tohoto jídla
* kdy byla objednávka zadána (orderedTime)
* kdy vyřízena (fulfilmentTime)
* je zaplacena

Zákazníci u stolu 8 si objednali 4 ks minerální vody jemně perlivé dnes v 15:38:17. Zatím vodu
nedostali a objednávka není zaplacena.

### Ukládání dat

do textového souboru či textových souborů

### Požadované výstupy

Připrav třídu RestaurantManager s metodami pro získání těchto informací.

1) Kolik objednávek je aktuálně rozpracovaných a nedokončených.
2) Možnost seřadit objednávky podle času zadání.
3) Průměrnou dobu zpracování objednávek.
4) Seznam jídel, která byla dnes objednána. Bez ohledu na to, kolikrát bylo dané jídlo objednáno.
5) Export seznamu objednávek pro jeden stůl ve formátu (například pro výpis na obrazovku):




