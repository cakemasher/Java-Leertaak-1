
import java.util.ArrayList;

/**
 * Write a description of class Kantine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kantine
{
    private KassaRij kassarij;
    private Kassa kassa;
    private Persoon persoon;
    private Dienblad dienblad;
    private Artikel artikel1;
    private Artikel artikel2;
    /**
     * Constructor
     */
    public Kantine()
    {
        this.kassarij = new KassaRij();
        this.kassa = new Kassa(this.kassarij);
    }
    
    /**
     * In deze methode wordt een Persoon en Dienblad
     * gemaakt en aan elkaar gekoppeld.
     * Maak twee Artikelen aan en plaats deze op het dienblad.
     * Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */
    public void loopPakSluitAan()
    {
        this.persoon = new Persoon(12345, "Tim", "Zijlstra", 1995, 12, 11, 'M');
        this.dienblad = new Dienblad();
        this.artikel1 = new Artikel("Energie", 0.30);
        this.artikel2 = new Artikel("Kratbier", 9.95);
        
        this.persoon.pakDienblad(this.dienblad);
        this.persoon.pakArtikel(this.artikel1);
        this.persoon.pakArtikel(this.artikel2);
        this.kassarij.sluitAchteraan(this.persoon);
    }
    
    /**
     * Deze methode handeltde rij voor de kassa af.
     */
    public void verwerkRijVoorKassa()
    {
        int loop = 0;
        Persoon eerstepersoon;
        while(loop <= this.kassarij.arraySize())
        {
            eerstepersoon = this.kassarij.eerstePersoonInRij();
            this.kassa.rekenAf(eerstepersoon);
            loop++;
        }
    }
    
    /**
     * Deze methode telt het geld uit de kassa
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa()
    {
        return this.kassa.hoeveelheidGeldInKassa();
    }
    
    /**
     * Deze methode geeft het aantal gepasseerde artikelen.
     * @return het aantal gepasseerde artikelen
     */
    public int aantalArtikelen()
    {
        return this.kassa.aantalArtikelen();
    }
    
    /**
     * De methode reset de bijgehouden telling van
     * het aantal artikelen
     * en "leegt" de inhoud van de kassa.
     */
    public void resetKassa()
    {
        this.kassa.resetKassa();
    }
}
