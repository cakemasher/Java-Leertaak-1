/**
 * Write a description of class KassaRij here.
 * 
 * @author Rick Wolthuis
 * @version 18-11-2014
 */

/* De ArrayList importeren. */
//import java.util.ArrayList;
import java.util.LinkedList;


public class KassaRij
{
	/* De ArrayList met de naam wachtrij, waar de personen in opgeslagen worden. */
	//private ArrayList<Persoon> wachtrij;
	private LinkedList<Persoon> wachtrij;
	
	
	/* Constructor voor de class Dienblad. */
	public KassaRij()
	{
		/* De ArrayList initialiseren voor 'wachtrij' waar alleen Persoon objecten in kunnen staan. */
		//this.wachtrij = new ArrayList<Persoon>();
		this.wachtrij = new LinkedList<Persoon>();
	}
	
	
	/* Functie om een persoon achteraan de wachtrij te plaatsen. */
	public void sluitAchteraan(Persoon persoon)
	{
		/* De persoon toevoegen aan de wachtrij. */
		this.wachtrij.add(persoon);
	}
	
	
	/* Functie om de eerste persoon uit de wachtrij verwijdere en retourneren. Indien die niet bestaat, null retourneren. */
	public Persoon eerstePersoonInRij()
	{
		/* Kijken of er minimaal één persoon in de wachtrij staat. */
		if (this.erIsEenRij ())
		{
			/* De eerste persoon in de ArrayList ophalen. */
			Persoon eerstePersoon = this.wachtrij.get(0);
			
			/* De eerste persoon, die hierboven is opgehaald, verwijderen uit de ArrayList. */
			this.wachtrij.remove(0);
			
			/* De persoon die eerder opgehaald was, daarna verwijderd was, returnen. */
			return eerstePersoon;
		}
		
		/* De wachtrij bleek leeg te zijn, dus een null returnen. */
		return null;
	}
	
	
	/* Functie om te controleren of er een Persoon in de wachtrij staat. */
	public boolean erIsEenRij()
	{
		/* Kijken of het aantal entries in de ArrayList niet 0 is, indien dit niet het geval is, return true. */
		if (this.wachtrij.size() != 0)
			return true;
		
		/* De wachtrij is leeg, en return een false. */
		return false;
	}
}
