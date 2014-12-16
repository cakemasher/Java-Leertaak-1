/**
 * Klasse om een artikel aan te maken.
 * 
 * @author (Tim Zijlstra) 
 * @version ()
 */
public class Artikel
{
    // De naam van het artikel
    private String nameartikel;
    
    // De prijs van het artikel
    private double priceartikel;    
    
    /**
     * Constructer
    */
    public Artikel( String nameartikel, double priceartikel)
    {
        setValues(nameartikel, priceartikel);
    }
    
    /**
     * Methode om de naam en de prijs te setten.
     * @param nameartikel   De naam van het artikel.
     * @param priceartikel  De prijs van het artikel.
    */
    public void setValues(String nameartikel, double priceartikel)
    {
        this.nameartikel = nameartikel;
        this.priceartikel = priceartikel;
    }
    
    /**
     * methode om het artikelnaam op te halen.
    */
    public String getName()
    {
        return this.nameartikel;
    }
    
    /**
     * Methode om het artikelprijs op te halen.
    */
    public double getPrice()
    {
        return this.priceartikel;
    }
    
    /**
     * Methode waarmee de gegevens worden geprint.
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
