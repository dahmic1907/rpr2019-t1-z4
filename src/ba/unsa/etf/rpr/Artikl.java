package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private String kod;
    private int cijena;

    public Artikl(String n, int i, String s) {
        naziv = n;
        cijena = i;
        kod = s;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public String getNaziv() {

        return naziv;
    }
    public int  getCijena() {
        return cijena;
    }

    public String getKod() {

        return kod;
    }

}
