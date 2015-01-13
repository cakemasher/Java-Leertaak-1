
/**
 * Write a description of class PersoonsVergelijker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersoonsVergelijker
{    
    public static void main(String[] args)
    {
        Persoon persoon1 = new Persoon(1234, "Tim", "Zijlstra", 1995, 12, 11, 'M');
        Persoon persoon2 = new Persoon(1234, "Tim", "Zijlstra", 1995, 12, 11, 'M');
        
        if(persoon1.toString() == persoon2.toString())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        
        if(persoon1.equals(persoon2) == true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
