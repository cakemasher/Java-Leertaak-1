
import java.util.Stack;

/**
 * Write a description of class Dienblad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Dienblad
{
    private Stack<Artikel> artikelen;
    private double total;
    
    /**
     * Constructor
     */
    public Dienblad()
    {
        this.artikelen = new Stack<Artikel>();
    }
    
    /**
     * Methode om artikel aan dienblad toe te voegen
     * @param artikel
     */
    public void voegToe(Artikel artikel)
    {
        this.artikelen.add(artikel); 
    }
    
    /**
     * Methode om aantal artikelen op dienblad te tellen
     * @return Het aantal artikelen
     */
    public int getAantalArtikelen()
    {
        return artikelen.size();
    }
    
    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     * @return De totaalprijs
     */
    public double getTotaalPrijs()
    {
        this.total = 0;
        for(Artikel artikel : artikelen)
        {
            this.total = this.total + (artikel.getPrice());
        }
        
        return total;
    }
}
