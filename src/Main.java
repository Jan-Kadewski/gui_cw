import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Sklep s1 = new Sklep();
        s1.pokazAsortyment();
        Klient k1 = new Klient("Piotr");
        Klient k2 = new Klient("Tomasz");

//        Rower wybranyRower = s1.wybierzRowerPoNazwie("mojRower");
//        System.out.println(s1.pokazAsortyment());
//        s1.sprzedaj(wybranyRower,k1);
//        System.out.println(k1.pokazRowery());
//        System.out.println(s1.pokazAsortyment());
//        Rower wybranyRower2 = s1.wybierzRowerPoNazwie("Romet");
//        s1.sprzedaj(wybranyRower2,k1);
//        System.out.println(k1.pokazRowery());
//        System.out.println(s1.pokazAsortyment());


        Scanner sc = new Scanner(System.in);
        String wybranyUser = sc.next();

        System.out.println("Wybierz usera:");
        System.out.println("a. " + k1.nazwa);
        System.out.println("b. " + k2.nazwa);

        Klient wybranyKlient = null;
//        if(wybranyUser.equals("a")){
//            wybranyKlient = k1;
//        }else if(wybranyKlient.equals("b")){
//            wybranyKlient = k2;
//        }

        switch (wybranyUser){
            case "a":{
                System.out.println("wybrano :" + k1.nazwa);
                wybranyKlient = k1;
                break;
            }
            case "b":{
                System.out.println("wybrano :" + k2.nazwa);
                wybranyKlient = k2;
                break;
            }
        }

        kupRower(sc,s1,wybranyKlient);
        System.out.println("Obecny stan magazynowy sklepu:" + s1.pokazAsortyment());
        System.out.println("Rowery klienta pana "+ wybranyKlient.nazwa + "; obecne rowery: " + wybranyKlient.pokazRowery());









//    }
    }



    private static void kupRower(Scanner sc, Sklep sklep, Klient klient){
        System.out.println("Asortyment naszego sklepu:");
        System.out.println(sklep.pokazAsortyment());
        System.out.println("Podaj nazwe roweru do kupna:");
        String nazwaRoweruDoKupna = sc.next();
        System.out.println("Rower do kupna:"+ nazwaRoweruDoKupna);
        Rower wybranyRower = sklep.wybierzRowerPoNazwie(nazwaRoweruDoKupna);
        System.out.println("Wybrany rower do zakupu:"+ wybranyRower);
        sklep.sprzedaj(wybranyRower ,klient);

    }

}
