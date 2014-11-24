
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private int bsn;
    private String firstname;
    private String lastname;
    private int birthyear;
    private int birthmonth;
    private int birthday;
    private char geslacht;
    private int month;
    private int monthday;
    private String mv;
    private String man;
    private String vrouw;
    
    /* Constructer voor de class Persoon. */
    public Person(int BSN, String firsName, String lastName, int birthYear, int birthMonth, int birthDay, char Geslacht)
    {
        /* De setters aanroepen om de controles uit te voeren.*/
        setBSN(BSN);
        setFirstName(firsName);
        setLastName(lastName);
        setBirthDate(birthYear, birthMonth, birthDay);
        setGeslacht(Geslacht);
        
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
    public void setBSN(int BSN)
    {
        this.bsn = BSN;
    }
    
    /* Een functie om de voornaam te setten. */
    public void setFirstName(String firstName)
    {
        this.firstname = firstName;
    }
    
    /* Een functie om de voornaam te setten. */
    public void setLastName(String lastName)
    {
        this.lastname = lastName;
    }
    
    /* Een functie om de geboortedatum te setten, na een aantal controles. */
    public void setBirthDate(int birthYear, int birthMonth, int birthDay)
    {
        /* Eerst de variabele month de waarde geven van de parameter birthMonth. */
        this.month = birthMonth;
        
        /* Dan wordt er gecontroleerd of de maand die ingevoerd is gelijk is aan februari en het een schrikkeljaar is.
           Als dit zo is dan kan is monthday gelijk aan 29.
           Is een van de twee niet zo dan hangt het van de maand af die er is ingevoerd. */
        if(birthMonth == 2 && (birthYear % 100) == 0)
        {
            if((birthYear % 400) == 0)
            {
                this.monthday = 29;
            }
        }
        else if (birthMonth == 2 &&(birthYear % 4) == 0)
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
            if(birthDay >= 1 && birthDay <= monthday && birthMonth >= 1 && birthMonth <= 12 && birthYear >= 1900 && birthYear <=2100)
            {
                this.birthyear = birthYear;
                this.birthmonth = birthMonth;
                this.birthday = birthDay;
            }
            else
            {
                this.birthyear = 0;
                this.birthmonth = 0;
                this.birthday = 0;
            }
    }
    
    /* Een functie om het geslacht te setten, na een controle. */
    public void setGeslacht(char Geslacht)
    {   
        if(Geslacht == 'M')
        {
            this.geslacht = Geslacht;
        }
        else if(Geslacht == 'V')
        {
            this.geslacht = Geslacht;
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
        this.mv = "Manwijf";
        this.man = "Man";
        this.vrouw = "Vrouw";
        
        if(this.geslacht == 'M')
        {
            return man;
        }
        else if(this.geslacht == 'V')
        {
            return vrouw;
        }     
        else
        {
            return this.mv;
        }
    }    
}