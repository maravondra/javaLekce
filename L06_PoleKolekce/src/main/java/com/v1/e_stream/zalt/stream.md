# Stream
StreamAPI představuje novou abstraktní vrstvu, pomocí které lze
zpracovávat data z kolekcí. Spolu se StreamAPI, které přišlo s Javou verze
8, se objevily také lambda výrazy, které velmi zjednodušují zápis dotazu.


![stream_cycle.svg.svg](..%2F..%2F..%2F..%2Fresources%2Fimage_md%2Fstream_cycle.svg.svg)

## Vlastnosti streamu

1. Stream není nová datová struktura a neukládá si někam prvky, se kterými pracuje.
2. Operace nad streamem dat nemění původní data. Místo toho tvoří stream nový.
3. Operace nad streamy jsou tzv. lazy-evaluated. To znamená, že jednotlivé operace nad daty ve streamu se provádějí postupně.
4. Streamy mohou mít konečnou i nekonečnou velikost.
5. Prvky streamu jsou vždy zpracovány pouze jednou.
6. Streamy umožňují jednoduché paralelní zpracování kolekcí.
7. Jednou vytvořená instance streamu nelze použít vícekrát.