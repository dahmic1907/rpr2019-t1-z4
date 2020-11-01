package ba.unsa.etf.rpr;

public class Supermarket {
   private Artikl[] artikli_supermarketa = new Artikl[1000];
   private int brojArtikalaSupermarketa = 0;

    public Artikl[] getArtikli() {
        return artikli_supermarketa;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = new Artikl("", 1, "");
        for(int i = 0; i < brojArtikalaSupermarketa; i++){
            if(artikli_supermarketa[i].getKod() == kod){
                a  = artikli_supermarketa[i];
                for(int j = 0; j < brojArtikalaSupermarketa-1; j++){
                    artikli_supermarketa[j] = artikli_supermarketa[j+1];
                }
                brojArtikalaSupermarketa --;
                break; //jedinstven kod pa mozemo prekinuti
            }
        }
        return a;
    }

    public void dodajArtikl(Artikl a) {
        artikli_supermarketa[brojArtikalaSupermarketa] = a;
        brojArtikalaSupermarketa++;
    }
}
