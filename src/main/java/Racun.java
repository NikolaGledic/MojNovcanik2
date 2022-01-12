import java.util.ArrayList;
import java.util.Random;

public class Racun {

    private long brojRacuna;
    private double stanje;
    ArrayList<Double> prethodneTransakcije;

    public Racun() {
        Random rnd = new Random();
        brojRacuna = rnd.nextLong(1000000, 1999999999);
        stanje = 0;
        prethodneTransakcije = new ArrayList<>();
    }

    public void setPrethodneTransakcije(ArrayList<Double> prethodneTransakcije) {
        this.prethodneTransakcije = prethodneTransakcije;
    }

    public long getBrojRacuna() {
        return brojRacuna;
    }

    public double getStanje() {
        return stanje;
    }

    public ArrayList<Double> getPrethodneTransakcije() {
        return prethodneTransakcije;
    }

    public void dodajNovac (double iznos){
        if (iznos > 0) {
            stanje = stanje + iznos;
            prethodneTransakcije.add(iznos);
        }
        else {
            System.out.println("Iznos za uplatu ne moze biti 0 ili manji");
        }
    }

    public void skiniNovac(double iznos){
        if (iznos > 0){
            if (stanje-iznos > 0){
                stanje = stanje - iznos;
                prethodneTransakcije.add(0-iznos);
            }
            else {
                System.out.println("Nemate dovoljno sredstava da izvrsite transakciju");
            }
        }
        else{
            System.out.println("Iznos za isplatu ne moze biti 0 ili manji");
        }
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Broj Racuna: ").append(brojRacuna).append(" ");
        sb.append("Stanje: ").append(stanje);
        return sb.toString();
    }
}
