package com.engeto.a_dedicnost.zoo;

public class MainZoo {

    public static void main(String[] args) {

        /** <b>Zadání</b>
         *  rekneme si ze chceme naprogramovat system pro zpravu nasich zamestanacu v pražské zoo
         *
         *  první otázkou je, jaké zamestnance v zoo mame?
         *
         *  v zoo mame <b>chovatele</b> a <b>pokadní</b>
         *
         *  jaké vlastnosti/atributy tyto zamestnance mají?
         *
         *
         *  dalsi si musime definovat jake maji metody
         *
         *  <b>Chovatel</b> - metoda pro vypocet vahy zvirete v librách a metodu pro prihlaseni
         *  <b>Pokladní</b> - metodu pro prihlaseni, uzavrit pokladnu a otevrit pokladnu
         *
         **/

        /**
         * otazka : jsou tam nejake spolecne vlastnosti mezi chovatelem a pokladni?
         *
         * odpoved :  ano, maji spolecne vlastnosti jmeno, heslo a rok nastupu
         *            ano, maji spolecne metody, ktere se tykaji prihlaseni
         */

        // 1) vytvorime si tridu User, ktera bude obsahovat jmeno, heslo a rok nastupu
        //    take metodu pro prihlaseni

        // 2) vytvorime instanci teto tridy (jen pro zkousku)
        User userMarek = new User("Marek", "ppp", 2022);

        // 3) pohrajemene si s touto instanci (get an logIn)
        System.out.println(userMarek.logIn("aaa"));
        System.out.println(userMarek.logIn("ppp"));
        System.out.println(userMarek.getName());

        // 4) vyvorime si chovatele

        // 5) instance chovatele
        Keeper david = new Keeper("David", "add", 2023, "slon", 100);
        System.out.println(david.logIn("aad"));
        System.out.println(david.logIn("add"));
        System.out.println(" *** vypis parameter ***");
        System.out.println(david.getPassword());
        System.out.println(david.getName());
        System.out.println(david.getYearOfBoarding());
        System.out.println(" *** ---- *** ");
        System.out.println(david.getWeightOfMyAnimal());

        // 6) nakonec si vytvorime tridu pokladni a jeho instanci
        Cashier jana = new Cashier("Jana", "kkk", 2024, "pokladna1");
        System.out.println(jana.logIn("kkk"));
        System.out.println(jana.logIn("aaa"));
        System.out.println(jana.getOffice());

        // 7) ted ale prisel dalsi pozadavek, ze je potreba dostat vahu v librach...
        // spatna cesta : prevadet to ve teto tride
        System.out.println(david.getWeightOfMyAnimal() * 2.204);

        // lepsi reseni je si ve tride vytvorit odpovidajici metodu a promennou
        System.out.println(david.weightInPound());

        // 8) a jak muzeme incializovat tridy
        // dokonce muzeme priradit do rodice instanci potomka
        User pepa = new Cashier("Pepa", "dddd", 2000, "pokladna2");
        // nicmene tento objekt ma viditlne pouze metody a paramatery rodice
        // v tomto pripade jmeno, heslo, rok nastupu
        // metody specifick=e pro Cashier nejsou videt

        /**
         * nicmene pokud chceme dostat vsechny metody a atributy muzeme udelat pretitpovani
         */
        Cashier pepaCashier = ((Cashier) pepa);
        // a tento objekt jiz ale ma viditlne ty metody cashier
        System.out.println(pepaCashier.getOffice());

        // jak otestovat nejaky objetk
        System.out.println(" Check of pepa");
        System.out.println("is user " + (pepa instanceof User));
        System.out.println("is cashier " + (pepa instanceof Cashier));
        System.out.println("is keeper " + (pepa instanceof Keeper));

        System.out.println(" Check of userMarek");
        System.out.println("is user " + (userMarek instanceof User));
        System.out.println("is cashier " + (userMarek instanceof Cashier));
        System.out.println("is keeper " + (userMarek instanceof Keeper));

        System.out.println(" Check of pepaCashier");
        System.out.println("is user " + (pepaCashier instanceof User));
        System.out.println("is cashier " + (pepaCashier instanceof Cashier));

        // NAVIC
        /* 9) abstraktni trida ... v tomto pridade mozna nedava velky smysl vytvaret instanci od tridy user...
         * pokud nechceme aby bylo mozne vytvaret instance muzeme to omezit pomoci klicoveho slova
         * abstract
         */


    }


}
