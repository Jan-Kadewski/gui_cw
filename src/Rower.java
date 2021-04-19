public class Rower {
    public Rower(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    String nazwa;
    double cena;

    @Override
    public String toString() {
        return "Rower{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
