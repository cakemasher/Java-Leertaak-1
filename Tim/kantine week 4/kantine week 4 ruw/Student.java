
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Persoon
{
    private int studentnummer;
    private String studierichting;
    
    /**
     * Constructor for objects of class Student
     */
    public Student(int bsn, String firstname, String lastname, int birthyear, int birthmonth, int birthday, char geslacht, int StudentNummer, String StudieRichting)
    {
        super(bsn, firstname, lastname, birthyear, birthmonth, birthday, geslacht);        
        setStudentNummer(StudentNummer);
        setStudieRichting(StudieRichting);
    }
    
    public void setStudentNummer(int StudentNummer)
    {
        this.studentnummer = StudentNummer;
    }
    
    public void setStudieRichting(String StudieRichting)
    {
        this.studierichting = StudieRichting;
    }
    
    public int getStudentNummer()
    {
        return this.studentnummer;
    }
    
    public String getStudieRichting()
    {
        return this.studierichting;
    }
    
    public void drukAf()
    {
        System.out.println("Studentgegevens");
        System.out.println("---------------------------------");
        System.out.println("BugerServiceNummer: " + this.getBSN());
        System.out.println("Firstname: " + this.getFirstName());
        System.out.println("Lastname: " + this.getLastName());
        System.out.println("BirthDate: " + this.getBirthDate());
        System.out.println("Geslacht: " + this.getGeslacht());
        System.out.println("Studentnummer: " + this.studentnummer);
        System.out.println("Studierichting: " + this.studierichting);
        System.out.println("---------------------------------");
        System.out.println("");
    }
}
