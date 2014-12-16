import java.util.LinkedList;

/**
 * Klasse voor een kassarij in de kantine.
 * 
 * @author (Tim Zijlstra) 
 * @version ()
 */
public class KassaRij
{
    // Een lijst van personen.
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
     * @param persoon   De naam van het object persoon.
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
    
    /**
     * Methode om de grootte te returen van de kassarij.
     * @return grootte  De grotte van de kassarij.
     */    
    public int arraySize()
    {
        return this.kassarij.size();
    }
    
    /**
     * Extra toegevoegd!!
     * Methode om te laten zien wie er in de rij staan
     */
    public void drukRijAf()
    {
        for(Persoon persoon: kassarij)
        {
            System.out.println(persoon.getFirstName() + " " + persoon.getLastName());
        }
    }
}
