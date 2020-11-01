package ba.unsa.etf.rpr;

public class Korpa {
    private  Artikl[] artikli = new Artikl[50];
    private int brojArtikala = 0;

    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala >= 50) return false;
        artikli[brojArtikala].setNaziv(a.getNaziv());
        artikli[brojArtikala].setKod(a.getKod());
        artikli[brojArtikala].setCijena(a.getCijena());
        brojArtikala++;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = new Artikl("", 0, "");
        for(int i = 0; i <  brojArtikala; i++){
            if(artikli[i].getKod() == kod){
                a = artikli[i];
                for(int j = i; j < brojArtikala -1; j++){
                    artikli[j] = artikli[j+1];
                }
                brojArtikala--;
                break; //jedinstevi su kodovi pa smo izbacili taj artikl
            }
        }
        //vratiti artikl u supermarket
        return a;

    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;

        for(Artikl a :  artikli){
            ukupnaCijena =  a.getCijena();
        }
        return ukupnaCijena;
    }



}
