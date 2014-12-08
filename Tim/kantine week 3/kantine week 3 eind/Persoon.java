import java.util.ArrayList;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persoon
{
    // De onderstaande variables worden gedeclareerd.
    private int bsn;
    private String firstname;
    private String lastname;
    private int birthyear;
    private int birthmonth;
    private int birthday;
    private char geslacht;
    private int month;
    private int monthday;
    private String onbekend;
    private String man;
    private String vrouw;
    private Dienblad dienblad;
        
    public Persoon()
    {
        
    }
    
    /* Constructer voor de class Persoon. */
    public Persoon(int bsn, String firstname, String lastname, int birthyear, int birthmonth, int birthday, char geslacht)
    {
        /* De setters aanroepen om de controles uit te voeren.*/
        setBSN(bsn);
        setFirstName(firstname);
        setLastName(lastname);
        setBirthDate(birthyear, birthmonth, birthday);
        setGeslacht(geslacht);
        
    }
    
    /* Een void functie waarmee de gegevens worden geprint. */
    public void drukAf()
    {
        System.out.println("Persoonsgegevens");
        System.out.println("-----------------------");
        System.out.println("BugerServiceNummer: " + this.getBSN());
        System.out.println("Firstname: " + this.getFirstName());
        System.out.println("Lastname: " + this.getLastName());
        System.out.println("BirthDate: " + this.getBirthDate());
        System.out.println("Geslacht: " + this.getGeslacht());
        System.out.println("-----------------------");
        System.out.println("");
    }   
    
    /* Een functie om het geslacht te setten, na een controle. */
    public void setBSN(int bsn)
    {
        this.bsn = bsn;
    }
    
    /* Een functie om de voornaam te setten. */
    public void setFirstName(String firstname)
    {
        this.firstname = firstname;
    }
    
    /* Een functie om de voornaam te setten. */
    public void setLastName(String lastname)
    {
        this.lastname = lastname;
    }
    
    /* Een functie om de geboortedatum te setten, na een aantal controles. */
    public void setBirthDate(int birthyear, int birthmonth, int birthday)
    {
        /* Eerst de variabele month de waarde geven van de parameter birthMonth. */
        this.month = birthmonth;
        
        /* Dan wordt er gecontroleerd of de maand die ingevoerd is gelijk is aan februari en het een schrikkeljaar is.
           Als dit zo is dan kan is monthday gelijk aan 29.
           Is een van de twee niet zo dan hangt het van de maand af die er is ingevoerd. */
        if(birthmonth == 2 && (birthyear % 100) == 0)
        {
            if((birthyear % 400) == 0)
            {
                this.monthday = 29;
            }
        }
        else if (birthmonth == 2 &&(birthyear % 4) == 0)
        {
            this.monthday = 29;            
        }
        else
        {
            switch(month)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    this.monthday = 31;
                break;
            
                case 4:
                case 6:
                case 9:
                case 11:
                    this.monthday =30;
                break;
                
                case 2:
                    this.monthday = 28;
                break;
            }
        }
            
        /* Als alle voorwaarden kloppen dan ken de waardes toe. anders zet alle waarden óp 0. */
        if(birthday >= 1 && birthday <= monthday && birthmonth >= 1 && birthmonth <= 12 && birthyear >= 1900 && birthyear <=2100)
        {
            this.birthyear = birthyear;
            this.birthmonth = birthmonth;
            this.birthday = birthday;
        }
        else
        {
            this.birthyear = 0;
            this.birthmonth = 0;
            this.birthday = 0;
        }
    }
    
    /* Een functie om het geslacht te setten, na een controle. */
    public void setGeslacht(char geslacht)
    {   
        if(geslacht == 'M')
        {
            this.geslacht = geslacht;
        }
        else if(geslacht == 'V')
        {
            this.geslacht = geslacht;
        }
        else
        {
            this.geslacht = 'O';
        }
    }
    
    /* Een getter functie, om het BugerServiceNummer op te halen. */
    public int getBSN()
    {
        return this.bsn;
    }
    
    /* Een getter functie, om de voornaam op te halen. */
    public String getFirstName()
    {
        return this.firstname;
    }
    
    
    /* Een getter functie, om de achternaam op te halen. */
    public String getLastName()
    {
        return this.lastname;
    }
    
    /* Een getter functie, om de geboortedatum op te halen. */
    public String getBirthDate()
    {
        if(this.birthyear == 0 && this.birthmonth == 0 && this.birthday == 0)
        {
            return "Onbekend";
        }
        else
        {
            return this.birthyear + "/" + this.birthmonth + "/" + this.birthday;
        }
    }
    
    /* Een getter functie waarbij het geslacht als String word gereturned. */
    public String getGeslacht()
    {
        this.onbekend = "Onbekend";
        this.man = "Man";
        this.vrouw = "Vrouw";
        
        if(this.geslacht == 'M')
        {
            return this.man;
        }
        else if(this.geslacht == 'V')
        {
            return this.vrouw;
        }     
        else
        {
            return this.onbekend;
        }
    }    
    
    /**
     * Methode om dienblad te koppelen aan een persoon
     * @param dienblad
     */
    public void pakDienblad(Dienblad dienblad)
    {
        if(this.dienblad == null)
        {
            this.dienblad = dienblad;            
        }
        else
        {
            System.out.println("Je moet niet zoveel eten.");
            System.out.println("Eén dienblad is genoeg.");
        }
    }
    
    /*
     * return het dienblad.
     */
    public Dienblad getDienblad()
    {
        return this.dienblad;
    }
}