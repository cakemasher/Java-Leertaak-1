
import java.util.Stack;
import java.util.Iterator;

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
    private Iterator<Artikel> artikelenIt;
    
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
    
    /*
     * verander de artikelen ArrayList naar een Iterator.
     */
    public Iterator<Artikel> getIterator()
    {
        this.artikelenIt = this.artikelen.iterator();
        return artikelenIt;        
    }
}
