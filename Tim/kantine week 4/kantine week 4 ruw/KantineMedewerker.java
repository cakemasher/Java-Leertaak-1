
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
    public KantineMedewerker(int bsn, String firstname, String lastname, int birthyear, int birthmonth, int birthday, char geslacht, int medewerkersNummer, boolean kassaToegang)
    {
        super(bsn, firstname, lastname, birthyear, birthmonth, birthday, geslacht);
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
        System.out.println("BugerServiceNummer: " + this.getBSN());
        System.out.println("Firstname: " + this.getFirstName());
        System.out.println("Lastname: " + this.getLastName());
        System.out.println("BirthDate: " + this.getBirthDate());
        System.out.println("Geslacht: " + this.getGeslacht());
        System.out.println("Medewerkersnummer: " + this.medewerkersnummer);
        System.out.println("Kassatoegang: " + this.kassatoegang);
        System.out.println("---------------------------------");
        System.out.println("");
    }
}
