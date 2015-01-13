/**
 * Klasse voor persoon docent.
 * 
 * @author (Tim Zijlstra) 
 * @version ()
 */
public class Docent extends Persoon
{
    // Afkortin van de docent
    private String afkorting;
    
    // Afdeling van de docent.
    private String afdeling;
    
    /**
     * Constructor
     * @param bsn           Het bsn nummer van de persoon.
     * @param firstname     De voornaam van de persoon.
     * @param lastname      De achternaam van de persoon.
     * @param birthyear     Het geboortejaar van de persoon.
     * @param birthmonth    De geboortemaand van de persoon.
     * @param birthday      De geboorteday van de persoon.
     * @param geslacht      Het geslacht van de persoon.
     * @param Afkorting     De afkorting van de docent.
     * @param Afdeling      De afdeling van de docent.
     */
    public Docent(int bsn, String firstname, String lastname, int birthyear, int birthmonth, int birthday, char geslacht, String Afkorting, String Afdeling)
    {
        super(bsn, firstname, lastname, birthyear, birthmonth, birthday, geslacht);
        setDocentAfkorting(Afkorting);
        setAfdeling(Afdeling);
    }
    
    /**
     * Methode voor de afkorting van de docent.
     * @param Afkorting     De afkorting van de docent.
     */
    public void setDocentAfkorting(String Afkorting)
    {
        this.afkorting = Afkorting;        
    }
    
    /**
     * Methode voor de afdeling van de docent.
     * @param Afdeling      De Afdeling van de docent.
     */
    public void setAfdeling(String Afdeling)
    {
        this.afdeling = Afdeling;
    }
    
    /**
     * Methode om de afkorting van de docent te krijgen.
     * @return afkorting    De afkorting van de docent.
     */
    public String getDocentAfkorting()
    {
        return this.afkorting;
    }
    
    /**
     * Methode om de afdeling van de docent te krijgen.
     * @return afdeling     De afdeling van de docent.
     */
    public String getAfdeling()
    {
        return this.afdeling;
    }
    
    /**
     * Methode om de gegevens van de docent aftedrukken.
     */
    public void drukAf()
    {
        System.out.println("Docentgegevens");
        System.out.println("---------------------------------");
        System.out.println("Afkorting: " + this.afkorting);
        System.out.println("Afdeling: " + this.afdeling);
        System.out.println("---------------------------------");
        System.out.println("");
    }
    
    public String toString()
    {
        String printResult = "";
        printResult += super.toString();
        printResult +=  " - " + this.getDocentAfkorting();
        printResult += " - " + this.getAfdeling();
        
        return printResult;        
    }
}
