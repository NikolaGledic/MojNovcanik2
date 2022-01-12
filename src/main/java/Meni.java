import java.util.ArrayList;
import java.util.Scanner;

public class Meni {
    Scanner sc = new Scanner(System.in);
    SviKorisnici svi = new SviKorisnici();
    Korisnik ulogovan = new Korisnik();

    public void prviMeni(){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Dobrodosli!");
        System.out.println("----------------------------------------------------------------------");
        boolean izlaz = false;
        while (!izlaz){
            System.out.println("""
                Izaberite opciju:
                1) Uloguj se
                2) Novi korisnik
                3) Izlaz""");
            int izbor = sc.nextInt();
            switch (izbor) {
                case 1 -> {
                    System.out.println("Unesite korisnicko ime: ");
                    String ime = sc.next();
                    System.out.println("Unesite lozinku: ");
                    String pass = sc.next();
                    ulogovan = svi.ulogujSe(ime, pass);
                    if (ulogovan != null) {
                        korisnickiMenijedan(ulogovan);
                    }
                    else {
                        System.out.println("Pogresno korisnicko ime ili lozinka");
                    }
                }
                case 2 -> {
                    Korisnik k = new Korisnik();
                    svi.dodajKorisnikaUBanku(k.dodajKorisnika());
                }
                case 3 -> {
                    System.out.println("Hvala na poverenju.");
                    izlaz = true;
                }
                default -> System.out.println("Greska u izboru!");
            }


        }

    }
    public void korisnickiMenijedan(Korisnik u){
        boolean izlaz = false;
        while (!izlaz){
            System.out.println("""
                Izaberite opciju:
                1) Izabari racun
                2) Napravi racun
                3) Prikazi racune
                4) Nazad""");
            int izbor = sc.nextInt();
            switch (izbor) {
                case 1 -> {
                    System.out.println("Izaberite jedan od racuna: ");
                    System.out.println(u.ispisRacuna());
                    int izborDva = sc.nextInt();
                    if (u.izborRacuna(izborDva) != null) {
                        korisnickiMenidva(u.izborRacuna(izborDva));
                    }
                else {
                        System.out.println("Pogresan izbor!");
                    }
                }
                case 2 -> {
                u.dodajRacun();
                }
                case 3 -> {
                    System.out.println(u.ispisRacuna());
                }

                case 4 -> {
                    izlaz = true;
                }
                default -> System.out.println("Greska u izboru");
            }
    }
    }

    public void korisnickiMenidva(Racun r){
        boolean izlaz = false;
        while (!izlaz){
            System.out.println("""
                Izaberite opciju:
                1) Dodaj novac na racun
                2) Skini novac sa racuna
                3) Trenutno stanje
                4) Nazad""");
            int izbor = sc.nextInt();
            switch (izbor) {
                case 1 -> {
                    System.out.println("Unesite iznos: ");
                    double d = sc.nextDouble();
                    r.dodajNovac(d);
                }
                case 2 -> {
                    System.out.println("Unesite iznos: ");
                    double d = sc.nextDouble();
                    r.skiniNovac(d);
                }
                case 3 -> {
                    System.out.println(r.getStanje());
                }
                case 4 -> {
                    izlaz = true;
                }
                default -> System.out.println("Greska u izboru!");
            }
            }
    }
}

