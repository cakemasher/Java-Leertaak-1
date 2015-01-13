import java.util.*;

/**
 * Klasse om een persoon aantemaken.
 * 
 * @author (Tim Zijlstra) 
 * @version ()
 */
public class Persoon
{
    // Het bsn nummer
    private int bsn;
    
    // De voornaam
    private String firstname;
    
    // De achternaam
    private String lastname;
    
    // Het geboortejaar
    private int birthyear;
    
    // De geboortemaand
    private int birthmonth;
    
    // De geboortedag
    private int birthday;
    
    // Het geslacht
    private char geslacht;
    
    // Welke maand de persoon geboren is.
    private int month;
    
    // De hoeveelheid dagen die de maand heeft.
    private int monthday;
    
    // De waarde voor het geslacht als onbekend.
    private String onbekend;
    
    // De waarde voor het geslacht als man.
    private String man;
    
    // De waarde voor het geslacht als vrouw.
    private String vrouw;
    
    // Een object dienblad.
    private Dienblad dienblad;
        
    public Persoon()
    {
        
    }
    
    /**
     * Constructer
     * @param bsn           Het bsn nummer van de persoon.
     * @param firstname     De voornaam van de persoon.
     * @param lastname      De achternaam van de persoon.
     * @param birthyear     Het geboortejaar van de persoon.
     * @param birthmonth    De geboortemaand van de persoon.
     * @param birthday      De geboorteday van de persoon.
     * @param geslacht      Het geslacht van de persoon.
    */
    public Persoon(int bsn, String firstname, String lastname, int birthyear, int birthmonth, int birthday, char geslacht)
    {
        /* De setters aanroepen om de controles uit te voeren.*/
        setBSN(bsn);
        setFirstName(firstname);
        setLastName(lastname);
        setBirthDate(birthyear, birthmonth, birthday);
        setGeslacht(geslacht);    
        
    }
    
    /**
     * Methode waarmee de gegevens van de persoon worden geprint.
    */
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
    
    public String toString()
    {
        String printResult = "";
        printResult += this.getBSN() + " - ";
        printResult += this.getFirstName() + " - ";
        printResult += this.getLastName() + " - ";
        printResult += this.getBirthDate() + " - ";
        printResult += this.getGeslacht();
        
        return printResult.toString();
    }
    
    public boolean equals(Object obj)
    {
        if(this.toString().equals(obj.toString()))
        {
            return true;
        }
        
        return false;
    }
    
    /**
     * Methode om het bsn nuummer te setten.
     * @param bsn   Het bsn nummer van de persoon.
    */
    public void setBSN(int bsn)
    {
        this.bsn = bsn;
    }
    
    /**
     * Methode om de voornaam te setten.
     * @param firstname     De voornaam van het persoon.
    */
    public void setFirstName(String firstname)
    {
        this.firstname = firstname;
    }
    
    /**
     * Methode om de voornaam te setten.
     * @param lastname  De achternaam van de persoon.
    */
    public void setLastName(String lastname)
    {
        this.lastname = lastname;
    }
    
    /**
     * Methode om de geboortedatum te setten.
     * @param birthyear     De geboorte jaar van de persoon.
     * @param birthmonth    De geboorte maand van de persoon.
     * @param birthday      De geboorte dag van de persoon.
    */
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
    
    /**
     * Methode om het BugerServiceNummer op te halen.
     * @return bsn  Het burger service nummer van de persoon.
    */
    public int getBSN()
    {
        return this.bsn;
    }
    
    /**
     * Methode om de voornaam op te halen.
     * @return firstname    De voornaam van de persoon.
    */
    public String getFirstName()
    {
        return this.firstname;
    }
    
    
    /**
     * Methode om de achternaam op te halen.
     * @return lastname     De achternaam van de persoon.
    */
    public String getLastName()
    {
        return this.lastname;
    }
    
    /**
     * Methode om de geboortedatum op te halen.
     * @return  geboortedatum   De geboortedatum van de persoon.
    */
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
    
    /**
     * Methode waarbij het geslacht als String word gereturned.
     * @return geslacht     Het geslacht van de persoon.
    */
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
     * @param dienblad  Een dienblad voor de persoon.
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
    
    /**
     * Methode om het dienblad te returnen.
     * @return dienblad     Het dienblad.
     */
    public Dienblad getDienblad()
    {
        return this.dienblad;
    }      
}