
/**
 * Write a description of class Artikelen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Artikel
{
    // Hier worden de variabelen gedeclareerd
    private String name;
    private int price;
    
    public void setValues(String Name, int Price)
    {
        this.name = Name;
        this.price = Price;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getPrice()
    {
        return this.price;
    }
    
    
    
}
