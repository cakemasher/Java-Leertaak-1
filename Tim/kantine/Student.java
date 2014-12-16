/**
 * Klasse voor persoon student.
 * 
 * @author (Tim Zijlstra) 
 * @version ()
 */
public class Student extends Persoon
{
    // Het nummer van de student
    private int studentnummer;
    
    // De studierichting van de student
    private String studierichting;
    
    /**
     * Constructor
     * @param bsn                   Het bsn nummer van de persoon.
     * @param firstname             De voornaam van de persoon.
     * @param lastname              De achternaam van de persoon.
     * @param birthyear             Het geboortejaar van de persoon.
     * @param birthmonth            De geboortemaand van de persoon.
     * @param birthday              De geboorteday van de persoon.
     * @param geslacht              Het geslacht van de persoon.
     * @param StudentNummer         Het nummer van de student.
     * @param StudieRichting        De studierichting van de student.
     */
    public Student(int bsn, String firstname, String lastname, int birthyear, int birthmonth, int birthday, char geslacht, int StudentNummer, String StudieRichting)
    {
        super(bsn, firstname, lastname, birthyear, birthmonth, birthday, geslacht);        
        setStudentNummer(StudentNummer);
        setStudieRichting(StudieRichting);
    }
    
    /**
     * Methode voor de studentnummer van de student.
     * @param StudentNummer     Het nummer van de student.
     */
    public void setStudentNummer(int StudentNummer)
    {
        this.studentnummer = StudentNummer;
    }
    
    /**
     * Methode voor de studierichting van de student.
     * @param StudieRichting    De studierichting van de student.
     */
    public void setStudieRichting(String StudieRichting)
    {
        this.studierichting = StudieRichting;
    }
    
    /**
     * Methode om de studentnummer van de student te krijgen.
     * @return studentnummer    Het studentnummer van de student.
     */
    public int getStudentNummer()
    {
        return this.studentnummer;
    }
    
    /**
     * Methode om de studierichting van de student te krijgen.
     * @return studierichting   De studierichting van de student.
     */
    public String getStudieRichting()
    {
        return this.studierichting;
    }
    
    /**
     * Methode om de gegevens van de student aftedrukken.
     */
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
