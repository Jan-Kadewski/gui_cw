import java.util.ArrayList;
import java.util.List;

public class Klient {
    String nazwa;
    List<Rower> rowery;

    public Klient(String nazwa){
        this.nazwa=nazwa;
        this.rowery = new ArrayList<>();
    }

    void dodajRower(Rower rower){
        this.rowery.add(rower);
    }
    List<Rower> pokazRowery(){
        return rowery;
    }


}
