/**
 * Write a description of class Dienblad here.
 * 
 * @author Rick Wolthuis
 * @version 18-11-2014
 */
 
/* Stack importeren zodat we deze kunnen gebruiken in onze class. */
import java.util.Stack;

public class Dienblad
{
	private Stack<Artikel> artikelen;
	
	/* Constructor voor de class Dienblad */
	public Dienblad()
	{
		/* De Stack initialiseren voor 'artikelen' waar alleen Artikel objecten in kunnen staan. */
		this.artikelen = new Stack<Artikel>();
	}
	
	
	/* Functie om een artikel toe te voegen aan het dienblad. */
	public void voegToe(Artikel artikel)
	{
		/* Het opgegeven artikel toevoegen in de ArrayList. */
		//this.artikelen.add(artikel);
		
		this.artikelen.push(artikel);
	}
	
	
	/* Functie waarbij de Stack artikelen word gereturned. */
	public Stack<Artikel> getArtikelen ()
	{
		return this.artikelen;
	}
}