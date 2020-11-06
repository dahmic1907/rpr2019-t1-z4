package ba.unsa.etf.rpr;

public class Supermarket {
   private Artikl[] artikli_supermarketa = new Artikl[1000];
   private int brojArtikalaSupermarketa = 0;

    public Artikl[] getArtikli() {
        return artikli_supermarketa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i = 0; i < brojArtikalaSupermarketa; i++){
            if(artikli_supermarketa[i].getKod().equals(kod)){
                Artikl a = new Artikl(artikli_supermarketa[i].getNaziv(), artikli_supermarketa[i].getCijena(), artikli_supermarketa[i].getKod());
                artikli_supermarketa[i] = null;
                for(int j = i; j < brojArtikalaSupermarketa-1; j++){
                    artikli_supermarketa[j] = artikli_supermarketa[j+1];
                }
                artikli_supermarketa[brojArtikalaSupermarketa -1]= null;
                brojArtikalaSupermarketa --;
                return a ; //jedinstven kod pa mozemo prekinuti
            }
        }
        return null;
    }

    public boolean dodajArtikl(Artikl a) {
        if(brojArtikalaSupermarketa < 1000) {
            artikli_supermarketa[brojArtikalaSupermarketa] = new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            brojArtikalaSupermarketa++;
            return true;
        }
        return false;

    }
    int getBrojArtikalaSupermarketa(){
        return brojArtikalaSupermarketa;
    }
    void setBrojArtikalaSupermarketa(int n){
        brojArtikalaSupermarketa = n;
    }
}

