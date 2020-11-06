package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s =  new Supermarket();
        Artikl a =  new Artikl("Sesir", 10 ,  "2");
        Artikl b =  new Artikl("Kapa", 6, "3");
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        s.izbaciArtiklSaKodom("2");
        assertEquals(1, s.getBrojArtikalaSupermarketa());

    }

    @Test
    void dodajArtikl() {
        Supermarket s = new Supermarket();
        Artikl a = new Artikl("Majica", 15, "3");
        Artikl b = new Artikl(" Hlace", 30, "10");
        s.dodajArtikl(a);
        s.dodajArtikl(b);
        assertEquals(2, s.getBrojArtikalaSupermarketa());
    }
    @Test
    void prekoracenoKapacitetaSupermarketa(){
        Supermarket s = new Supermarket();
        s.setBrojArtikalaSupermarketa(1000);
        Artikl a = new Artikl("Biciklo", 199, "10");
        boolean i = s.dodajArtikl(a);
        assertFalse(i);

    }
}