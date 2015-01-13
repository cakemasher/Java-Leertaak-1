/**
 * Klasse voor persoon kantinemedewerker.
 * 
 * @author (Tim Zijlstra) 
 * @version ()
 */
public class KantineMedewerker extends Persoon
{
    // Het nummer van de kantinemedewerker
    private int medewerkersnummer;
    
    // Of de kantinemedewerker toegang heeft tot de kassa
    private boolean kassatoegang;
    
    /**
     * Constructor
     * @param bsn                   Het bsn nummer van de persoon.
     * @param firstname             De voornaam van de persoon.
     * @param lastname              De achternaam van de persoon.
     * @param birthyear             Het geboortejaar van de persoon.
     * @param birthmonth            De geboortemaand van de persoon.
     * @param birthday              De geboorteday van de persoon.
     * @param geslacht              Het geslacht van de persoon.
     * @param medewerkersNummer     Het nummer van de medewerker.
     * @param kassaToegang          Kassatoegang true or false.
     */
    public KantineMedewerker(int bsn, String firstname, String lastname, int birthyear, int birthmonth, int birthday, char geslacht, int medewerkersNummer, boolean kassaToegang)
    {
        super(bsn, firstname, lastname, birthyear, birthmonth, birthday, geslacht);
        setMedewerkersNummer(medewerkersNummer);
        setKassaToegang(kassaToegang);        
    }
    
    /**
     * Methode voor medewerkersnummer van de persoon.
     * @param medewerkersNummer     Het nummer van de medewerker.
     */
    public void setMedewerkersNummer(int medewerkersNummer)
    {
        this.medewerkersnummer = medewerkersNummer;
    }
    
    /**
     * Methode of persoon kassatoegang heeft.
     * @param kassaToegang  kassatoegang true or false.
     */
    public void setKassaToegang(boolean kassaToegang)
    {
        this.kassatoegang = kassaToegang;
    }
    
    public int getMedewerkersNummer()
    {
        return this.medewerkersnummer;
    }
    
    public boolean getKassaToegang()
    {
        return this.kassatoegang;
    }
    
    /**
     * Methode om de gegevens van de persoon aftedrukken.
     */
    public void drukAf()
    {
        System.out.println("Kantinemedewerkergegevens");
        System.out.println("---------------------------------");
        System.out.println("Medewerkersnummer: " + this.medewerkersnummer);
        System.out.println("Kassatoegang: " + this.kassatoegang);
        System.out.println("---------------------------------");
        System.out.println("");
    }
    
    public String toString()
    {        
        String printResult = "";
        printResult += super.toString();
        printResult += " - " + this.getMedewerkersNummer();
        printResult += " - " + this.getKassaToegang();
        
        return printResult;
    }
}
