import java.util.ArrayList;
import java.util.Scanner;

public class Korisnik {
    Scanner sc = new Scanner(System.in);
    private String ime;
    private String prezime;
    private String username;
    private String password;
    ArrayList<Racun> racuniKorisnika;

    public Korisnik (){

    }

    public Korisnik(String ime, String prezime, String username, String password) {
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
        racuniKorisnika = new ArrayList<>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Racun> getRacuniKorisnika() {
        return racuniKorisnika;
    }

    public Korisnik dodajKorisnika(){
        System.out.println("Unesite ime: ");
        ime = sc.next();
        System.out.println("Unesite prezime: ");
        prezime = sc.next();
        System.out.println("Unesite korisnicko ime: ");
        username = sc.next();
        System.out.println("Unesite lozinku: ");
        password = sc.next();
        Korisnik k = new Korisnik(ime, prezime , username, password);
        return k;
    }



    public void dodajRacun(){
        Racun r = new Racun();
        racuniKorisnika.add(r);
        System.out.println(r);
    }

    public Racun izborRacuna(int r){
        if (r > 0 && r <= racuniKorisnika.size()) {
            return racuniKorisnika.get(r - 1);
        }
        else {
            return null;
        }
    }

    public String ispisRacuna(){
        StringBuilder sb = new StringBuilder();
        for (Racun racun : racuniKorisnika) {
            sb.append(racuniKorisnika.indexOf(racun) + 1).append(") ").append(racun).append("\n");
        }
        return sb.toString();
    }



}
