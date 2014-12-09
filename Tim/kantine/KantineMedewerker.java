
/**
 * Write a description of class KantineMedewerker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KantineMedewerker extends Persoon
{
    private int medewerkersnummer;
    private boolean kassatoegang;
    
    /**
     * Constructor for objects of class KantineMedewerker
     */
    public KantineMedewerker(int medewerkersNummer, boolean kassaToegang)
    {
        super();
        setMedewerkersNummer(medewerkersNummer);
        setKassaToegang(kassaToegang);        
    }
    
    public void setMedewerkersNummer(int medewerkersNummer)
    {
        this.medewerkersnummer = medewerkersNummer;
    }
    
    public void setKassaToegang(boolean kassaToegang)
    {
        this.kassatoegang = kassaToegang;
    }
    
    public void drukAf()
    {
        System.out.println("Kantinemedewerkergegevens");
        System.out.println("---------------------------------");
        System.out.println("Medewerkersnummer: " + this.medewerkersnummer);
        System.out.println("Kassatoegang: " + this.kassatoegang);
        System.out.println("---------------------------------");
        System.out.println("");
    }
}
