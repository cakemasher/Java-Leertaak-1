
/**
 * Write a description of class KantineSimulatie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KantineSimulatie
{
    private Kantine kantine;
    
    /**
     * Constructor
     */
    public KantineSimulatie()
    {
        this.kantine = new Kantine();
    }
    
    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen)
    {
        for(int i = 1; i <= dagen; i++)
        {
            for(int j = 0; j < 10+i; j++)
            {
                this.kantine.loopPakSluitAan();
            }
            this.kantine.verwerkRijVoorKassa();
            System.out.println("");
            System.out.println("Dag " + i);
            System.out.println("--------------------");
            System.out.println("Aantal artikelen: " + this.kantine.aantalArtikelen());
            System.out.println("Totaal in kassa: " +  this.kantine.hoeveelheidGeldInKassa());
            System.out.println("--------------------");
            this.kantine.resetKassa();
        }
    }
    
}
