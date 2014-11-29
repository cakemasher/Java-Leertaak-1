
/**
 * Write a description of class Artikelen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Artikel
{
    // De onderstaande variables worden gedeclareerd.
    private String nameartikel;
    private double priceartikel;
    
    
    /* 
     * Constructer voor de class Artikel.
     */
    public Artikel( String nameartikel, double priceartikel)
    {
        setValues(nameartikel, priceartikel);
    }
    
    /*
     * Als opgegeven in de eerste opgave van week 2 een lege Constructor.
     */
    public Artikel()
    {
        
    }
    
    /*
     * Een functie om de naam en de prijs te setten.
     */
    public void setValues(String nameartikel, double priceartikel)
    {
        this.nameartikel = nameartikel;
        this.priceartikel = priceartikel;
    }
    
    /*
     * Een getter functie, om het artikelnaam op te halen.
     */
    public String getName()
    {
        return this.nameartikel;
    }
    
    /*
     * Een getter functie, om het artikelprijs op te halen.
     */
    public double getPrice()
    {
        return this.priceartikel;
    }
    
    /*
     * Een void functie waarmee de gegevens worden geprint.
     */
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
