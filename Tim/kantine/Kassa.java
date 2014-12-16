import java.util.*;

/**
 * Klassa voor de kassa in de kantine.
 * 
 * @author (Tim Zijlstra) 
 * @version ()
 */
public class Kassa
{
    // Een object kassarij
    private KassaRij kassaRij;
    
    // Het aantalartikelen
    private int aantalartikelen;
    
    // Het geld in de kassa
    private double geldinkassa;
    
    // Een object
    private Dienblad dienblad;
    
    // Iterator lijst van artikelen
    private Iterator<Artikel> artikelenIt;
    
    // Tweede aantalartikelen 
    private int aantalartikelen2;
    
    // Tweede geldinkassa
    private double geldinkassa2;
    
    /**
     * Constructor
     * @param kassarij  De naam van het object kassarij.
     */
    public Kassa(KassaRij kassarij)
    {
        this.kassaRij = kassarij;
    }
    
    /**
     * vraag het aantal artikelen en de totaalprijs op.
     * De implemantatie wordt later vervangen
     * door een echte betaling door de persoon.
     * @param persoon   De naam van het object persoon.
     */
    public void rekenAf(Persoon persoon)
    {
        this.dienblad = persoon.getDienblad();
        this.artikelenIt = this.dienblad.getIterator();
        
        this.aantalartikelen2 = 0;
        
        while(artikelenIt.hasNext())
        {
            Artikel it = artikelenIt.next();
            this.geldinkassa = this.geldinkassa + it.getPrice();
            this.aantalartikelen2++;
        }
        
        this.aantalartikelen = this.aantalartikelen + this.aantalartikelen2;
    }   
    
    /**
     * Geeft het aantal artikelen dat de kassa
     * heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden
     * is aangeroepen.
     * @return aantalartikelen  Het aantalartikelen.
     */
    public int aantalArtikelen()
    {
        return this.aantalartikelen;
    }
    
    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     * resetkassa is aangeroepen.
     * @return geldinkassa  De hoeveelheid geld in de kassa.
     */
    public double hoeveelheidGeldInKassa()
    {
        return this.geldinkassa;
    }
    
    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa()
    {
        this.aantalartikelen = 0;
        this.geldinkassa = 0;
    }
}
