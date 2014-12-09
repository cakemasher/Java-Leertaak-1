
/**
 * Write a description of class Docent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docent extends Persoon
{
    private String afkorting;
    private String afdeling;
    
    /**
     * Constructor for objects of class Docent
     */
    public Docent(String Afkorting, String Afdeling)
    {
        super();
        setDocentAfkorting(Afkorting);
        setAfdeling(Afdeling);
    }
    
    public void setDocentAfkorting(String Afkorting)
    {
        this.afkorting = Afkorting;        
    }
    
    public void setAfdeling(String Afdeling)
    {
        this.afdeling = Afdeling;
    }
    
    public String getDocentAfkorting()
    {
        return this.afkorting;
    }
    
    public String getAfdeling()
    {
        return this.afdeling;
    }
    
    public void drukAf()
    {
        System.out.println("Docentgegevens");
        System.out.println("---------------------------------");
        System.out.println("Afkorting: " + this.afkorting);
        System.out.println("Afdeling: " + this.afdeling);
        System.out.println("---------------------------------");
        System.out.println("");
    }
}
