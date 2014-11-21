
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    private String bsn;
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
    
    public Person(String BSN, String firsName, String lastName, int birthYear, int birthMonth, int birthDay, char Geslacht)
    {
        
        
        setBSN(BSN);
        setFirstName(firsName);
        setLastName(lastName);
        setBirthDate(birthYear, birthMonth, birthDay);
        setGeslacht(Geslacht);
        
    }
        
    public void setBSN(String BSN)
    {
        this.bsn = BSN;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstname = firstName;
    }
    
    public void setLastName(String lastName)
    {
        this.lastname = lastName;
    }
    
    public void setBirthDate(int birthYear, int birthMonth, int birthDay)
    {
        this.month = birthMonth;
        
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
                this.birthyear = 0;
            }
    }
    
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
    
    public String getBSN()
    {
        return this.bsn;
    }
    
    public String getFirstName()
    {
        return this.firstname;
    }
    
    public String getLastName()
    {
        return this.lastname;
    }
    
    public String getBirthDate()
    {
        return this.birthyear + "/" + this.birthmonth + "/" + this.birthday;
    }
    
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
    
    public void drukAf()
    {   
        this.mv = "Manwijf";
        this.man = "Man";
        this.vrouw = "Vrouw";
        String geSlacht;
        
        if(this.geslacht == 'M')
        {
            geSlacht = man;
        }
        else if(this.geslacht == 'V')
        {
            geSlacht = vrouw;
        }     
        else
        {
            geSlacht = this.mv;
        }
        
        System.out.println("Persoonsgegevens");
        System.out.println("-----------------------");
        System.out.println("BugerServiceNummer: " + this.bsn);
        System.out.println("Firstname: " + this.firstname);
        System.out.println("Lastname: " + this.lastname);
        System.out.println("BirthDate: " + this.birthyear + "/" + this.birthmonth + "/" + this.birthday);
        System.out.println("Geslacht: " + geSlacht);
        System.out.println("-----------------------");
        System.out.println("");
    }       
}