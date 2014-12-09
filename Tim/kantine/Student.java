
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
    public Student(int StudentNummer, String StudieRichting)
    {
        super();
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
        super.drukAf();
        System.out.println("Studentgegevens");
        System.out.println("---------------------------------");
        System.out.println("Studentnummer: " + this.studentnummer);
        System.out.println("Studierichting: " + this.studierichting);
        System.out.println("---------------------------------");
        System.out.println("");
    }
}
