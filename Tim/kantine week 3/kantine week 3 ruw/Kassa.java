import java.util.*;

/**
 * Write a description of class Kassa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kassa
{
    private KassaRij kassaRij;
    private int aantalartikelen;
    private double geldinkassa;
    private Dienblad dienblad;
    private Iterator<Artikel> artikelenIt;
    private int aantalartikelen2;
    private double geldinkassa2;
    
    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij)
    {
        this.kassaRij = kassarij;
    }
    
    /**
     * vraag het aantal artikelen en de totaalprijs op.
     * De implemantatie wordt later vervangen
     * door een echte betaling door de persoon.
     * @param persoon die moet afrekenen
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
     * @return aantal artikelen
     */
    public int aantalArtikelen()
    {
        return this.aantalartikelen;
    }
    
    /**
     * Geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode
     * resetkassa is aangeroepen.
     * @return hoeveelheid geld in de kassa
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
