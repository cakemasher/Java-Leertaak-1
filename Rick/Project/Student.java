/**
 * Write a description of class Student here.
 * 
 * @author Rick Wolthuis
 * @version 7-1-2015
 */

class Student extends Persoon
{
    private int studentnummer;
    private String studierichting   = "Onbekend";
    
    
    public Student (int BSN, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht) {
        super (BSN, voornaam, achternaam, dag, maand, jaar, geslacht);
    }
    
    
    public String toString ()
    {
        String vanPersoon = super.toString();
        
        return vanPersoon + "## Type: Student, nummer: " + this.studentnummer + ", richting: " + this.studierichting;
    }
    
    
    public void setStudentnummer (int nummer)
    {
        this.studentnummer = nummer;
    }
    
    
    public void setStudierichting (String richting)
    {
        this.studierichting = richting;
    }
    
    
    public int getStudentnummer ()
    {
        return this.studentnummer;
    }
    
    
    public String getStudierichting ()
    {
        return this.studierichting;
    }   
    
            
    public double geefKortingsPercentage ()
    {
        return 35;
    }
}