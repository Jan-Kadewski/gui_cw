import java.util.ArrayList;
import java.util.List;

public class Sklep {
    String adres;
    String nazwa;
    List<Rower> rowery;

    public Sklep() {
        this.nazwa = "Moj sklep";
        this.rowery = new ArrayList<Rower>();
        this.rowery.add(new Rower("mojRower", 1000));
        this.rowery.add(new Rower("Romet", 3500));

    }

   public  Rower wybierzRowerPoNazwie(String nazwa){
        for(Rower r : this.rowery){
            if(r.nazwa.equals(nazwa)){
                return r;
            }
        }
        return null;
    }


    public Sklep(String adres, String nazwa, List<Rower> rowery) {
        this.adres = adres;
        this.nazwa = nazwa;
        this.rowery = rowery;
    }

    void sprzedaj(Rower rower, Klient klient) {
        rowery.remove(rower);
        klient.dodajRower(rower);
    };

    public List<Rower> pokazAsortyment(){
        return rowery;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "adres='" + adres + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", rowery=" + rowery +
                '}';
    }
}
