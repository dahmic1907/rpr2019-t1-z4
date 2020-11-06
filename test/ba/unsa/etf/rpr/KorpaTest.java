package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodavanjeArtikl() {
        Korpa k = new Korpa();
        k.setBrojArtikala(10);
        Artikl a =  new Artikl("Biciklo", 150, "12" );
        k.dodajArtikl(a);
        assertEquals(11, k.getBrojArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa k =  new Korpa();
        Artikl a =  new Artikl("Auto", 300, "50");
        k.dodajArtikl(a);
        k.izbaciArtiklSaKodom("50");
        assertEquals(0, k.getBrojArtikala());
    }
    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa k  = new Korpa();
        Artikl a = new Artikl("Biciklo" , 150,  "12");
        k.dodajArtikl(a);
        Artikl b = new Artikl("Biciklo" , 150,  "13");
        k.dodajArtikl(b);
        int cijena =  a.getCijena() + b.getCijena();
        assertEquals(cijena,  k.dajUkupnuCijenuArtikala());
    }

}