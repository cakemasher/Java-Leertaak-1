/**
 * Write a description of class Dienblad here.
 * 
 * @author Rick Wolthuis
 * @version 18-11-2014
 */
 
/* De ArrayList importeren. */
import java.util.ArrayList;


public class Dienblad
{
	private ArrayList<Artikel> artikelen;
	
	/* Constructor voor de class Dienblad */
	public Dienblad()
	{
		/* De ArrayList initialiseren voor 'artikelen' waar alleen Artikel objecten in kunnen staan. */
		this.artikelen = new ArrayList<Artikel>();
	}
	
	
	/* Functie om een artikel toe te voegen aan het dienblad. */
	public void voegToe(Artikel artikel)
	{
		/* Het opgegeven artikel toevoegen in de ArrayList. */
		this.artikelen.add(artikel);
	}
	
	
	/* Functie om het aantal artikelen op het dienblad te tellen */
	public int getAantalArtikelen()
	{
		/* Het aantal elementen in de ArrayList tellen, en returnen. */
		return this.artikelen.size();
	}
	
	
	/* Functie om totaal prijs van het dienblad te berekenen. */
	public double getTotaalPrijs()
	{
		/* Tijdelijke double aanmaken, en deze de waarde 0 geven. */
		double totaalPrijs	= 0;
		
			/* Elke item bij langs gaan in de ArrayList artikelen. Bij elke item word de prijs opgehaald van het object, en deze bij totaalPrijs opgeteld. */
			for (Artikel artikel : this.artikelen)
				totaalPrijs = totaalPrijs + artikel.getPrijs();
		
		/* De berekende totaal prijs terug geven. */
		return totaalPrijs;
	}
}