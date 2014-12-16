import java.util.Stack;
import java.util.Iterator;

/**
 * Klasse voor een dienblad in de kantine.
 * 
 * @author (Tim Zijlstra) 
 * @version ()
 */
public class Dienblad
{
    // Stapel met artikelen
    private Stack<Artikel> artikelen;
    
    // Íterator van artikelen
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
    
    /**
     * Methode om artikelen ArrayList naar een Iterator teveranderen.
     */
    public Iterator<Artikel> getIterator()
    {
        this.artikelenIt = this.artikelen.iterator();
        return artikelenIt;        
    }
}
