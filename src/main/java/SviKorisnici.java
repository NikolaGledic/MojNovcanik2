import java.util.ArrayList;

public class SviKorisnici {

    ArrayList<Korisnik> sviKorisniciBanke;

    public SviKorisnici() {
        this.sviKorisniciBanke = new ArrayList<>();
    }

    public ArrayList<Korisnik> getSviKorisniciBanke() {
        return sviKorisniciBanke;
    }

    public void setSviKorisniciBanke(ArrayList<Korisnik> sviKorisniciBanke) {
        this.sviKorisniciBanke = sviKorisniciBanke;
    }

    public void dodajKorisnikaUBanku(Korisnik k){
        sviKorisniciBanke.add(k);
    }

    public Korisnik ulogujSe(String u, String pass){
        for (Korisnik korisnik : sviKorisniciBanke) {
            if (korisnik.getUsername().equals(u) && korisnik.getPassword().equals(pass)){
                return korisnik;
            }
        }
        return null;
    }
}
