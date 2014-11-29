
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
        this.aantalartikelen = this.aantalartikelen + persoon.getAantalArtikelen();
        this.geldinkassa = this.geldinkassa + persoon.getTotaalPrijs();
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
