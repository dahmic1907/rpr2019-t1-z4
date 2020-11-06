package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl a = new Artikl("Mujo", 10,  "12");
        assertEquals(a.getNaziv(), "Mujo");
    }

    @Test
    void getCijena() {
        Artikl a = new Artikl("Mujo", 10,  "12");
        assertEquals(a.getCijena(), 10);
    }

    @Test
    void getKod() {
        Artikl a = new Artikl("Mujo", 10,  "12");
        assertEquals(a.getKod(),  "12");
    }
}