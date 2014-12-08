
import java.util.LinkedList;

/**
 * Write a description of class KassaRij here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KassaRij
{
    private LinkedList<Persoon> kassarij;
    
    /**
     * Constructor
     */
    public KassaRij()
    {
        this.kassarij = new LinkedList<Persoon>();
    }
    
    /**
     * Persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon)
    {
        this.kassarij.add(persoon);
    }
    
    /**
     * Indien er een rij bestaat, de eerste Persoon uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij()
    {
        Persoon eerstepersoon;
        if(this.kassarij == null)
        {
            return null;
        }
        else
        {
            eerstepersoon = kassarij.get(0);
            this.kassarij.remove(eerstepersoon);
            return eerstepersoon;
        }
    }
    
    /**
     * Methode kijkt of er personen in de rij staan.
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij()
    {
        if(this.kassarij == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    /*
     * Return the grootte van de array kassarij.
     */    
    public int arraySize()
    {
        return this.kassarij.size();
    }
}
