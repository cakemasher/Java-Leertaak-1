
import java.util.ArrayList;
import java.util.Iterator;

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
    private KantineAanbod kantineaanbod;
    
    /**
     * Constructor
     */
    public Kantine()
    {
        this.kassarij = new KassaRij();
        this.kassa = new Kassa(this.kassarij);
    }
    
    /**
     * In deze methode kiest een Persoon met een dienblad
     * de artikelen in artikelnamen.
     * @param persoon
     * @artikelnamen
     */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen)
    {
        this.persoon = persoon;
        this.dienblad = new Dienblad();
        this.persoon.pakDienblad(dienblad);
        
        for(String artikel : artikelnamen)
        {
            this.dienblad.voegToe(this.kantineaanbod.getArtikel(artikel));
        }
        
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
     * De methode reset de bijgehouden telling van
     * het aantal artikelen
     * en "leegt" de inhoud van de kassa.
     */
    public void resetKassa()
    {
        this.kassa.resetKassa();
    }
    
    /*
     * return de kassa.
     */
    public Kassa getKassa()
    {
        return this.kassa;
    }
    
    /*
     * set het kantineaanbod.
     */
    public void setKantineAanbod(KantineAanbod aanbod)
    {
        this.kantineaanbod = aanbod;
    }
    
    /*
     * return het kantine aanbod.
     */
    public KantineAanbod getKantineAanbod()
    {
        return this.kantineaanbod;
    }
}
