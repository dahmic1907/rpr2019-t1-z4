package ba.unsa.etf.rpr;

public class Korpa {
    private  Artikl[] artikli = new Artikl[50];
    private int brojArtikala = 0;

    public boolean dodajArtikl(Artikl a) {
        if(brojArtikala >= 50) return false;
        artikli[brojArtikala] = new Artikl(a.getNaziv(), a.getCijena(),a.getKod());
        brojArtikala++;
        return true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i <  brojArtikala; i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl a = new Artikl( artikli[i].getNaziv(),artikli[i].getCijena() ,artikli[i].getKod());
                artikli[i] = null;
                for(int j = i; j < brojArtikala-1; j++){
                    artikli[j] = artikli[j+1];
                }
                artikli[brojArtikala -1 ] = null;
                brojArtikala--;
                return a; //jedinstevi su kodovi pa smo izbacili taj artikl
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for(int i = 0; i <  brojArtikala; i++){
            ukupnaCijena  +=  artikli[i].getCijena();
        }
        return ukupnaCijena;
    }
    void setBrojArtikala(int n){
        brojArtikala = n;
    }
    int getBrojArtikala(){
        return  brojArtikala;
    }

}
