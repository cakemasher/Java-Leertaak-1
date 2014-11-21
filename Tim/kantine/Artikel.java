
/**
 * Write a description of class Artikelen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Artikel
{
    // Hier worden de variabelen gedeclareerd
    private String nameartikel;
    private int priceartikel;
    
    public Artikel( String nameArtikel, int priceArtikel)
    {
        this.nameartikel = nameArtikel;
        this.priceartikel = priceArtikel;
    }
    
    public void setValues(String nameArtikel, int priceArtikel)
    {
        this.nameartikel = nameArtikel;
        this.priceartikel = priceArtikel;
    }
    
    public String getName()
    {
        return this.nameartikel;
    }
    
    public int getPrice()
    {
        return this.priceartikel;
    }
    
    public void drukAf()
    {
        System.out.println("Artikelgegevens");
        System.out.println("----------------------");
        System.out.println("Naamartikel: " + this.nameartikel);
        System.out.println("Prijsartikel: " + this.priceartikel + "cents");
        System.out.println("----------------------");
        System.out.println("");
    }
    
}
