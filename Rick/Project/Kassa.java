/**
 * Write a description of class Kassa here.
 * 
 * @author Rick Wolthuis
 * @version 18-11-2014
 */

/* Stack importeren zodat we deze kunnen gebruiken in onze class. */
import java.util.Stack;
 
public class Kassa
{
	/* Het kassarij object. */
	private KassaRij kassaRij;
	
	/* Totaal aantallen. */
	private double TotaalGeldInKassa;
	private int TotaalAantalProducten;
	
	/* Constructor voor de class Dienblad. */
	public Kassa(KassaRij kassarij)
	{
		this.kassaRij = kassarij;
	}
	
	
	/* Methode rekenAf waarmee er word afgerekend met de eerste persoon uit de wachtrij van de kassa. */
	public void rekenAf()
	{
		/* De eerste persoon uit de wachtrij van de kassa ophalen. */
		Persoon klant = this.kassaRij.eerstePersoonInRij();
		
		Stack<Artikel> artikelen	= klant.getDienblad();
		
		
		/* Totalen van de kassa aanpassen, en alles bijelkaar optellen. */
		this.TotaalAantalProducten	= this.TotaalAantalProducten + this.getAantalArtikelen (artikelen);
		this.TotaalGeldInKassa		= this.TotaalGeldInKassa + this.getTotaalPrijs(artikelen);
	}
	
	
	/* Functie om het aantal artikelen op het dienblad te tellen */
	public int getAantalArtikelen(Stack<Artikel> artikelen)
	{
		/* Het aantal elementen in de artikelen stack tellen, en returnen. */
		return artikelen.size();
	}
	
	
	/* Functie om totaal prijs van het dienblad te berekenen. */
	public double getTotaalPrijs(Stack<Artikel> artikelen)
	{
		/* Tijdelijke double aanmaken, en deze de waarde 0 geven. */
		double totaalPrijs	= 0;
		
			/* Elke item bij langs gaan in de ArrayList artikelen. Bij elke item word de prijs opgehaald van het object, en deze bij totaalPrijs opgeteld. */
			//for (Artikel artikel : this.artikelen)
				//totaalPrijs = totaalPrijs + artikel.getPrijs();
				
			/* Een while aanmaken waarbij alle items in de stack artikelen word bij langs gegaan. */
			while(!artikelen.empty())
			{
				/* Tijdelijke variabele aanmaken en daarin het eerst volgende artikel in zetten uit de Stack. Dit item word daar ook meteen uit verwijderd. */
				Artikel tijdelijkArtikel = artikelen.pop();
				
				/* De totaalprijs aanpassen en de prijs van het artikel bij het totaalprijs optellen. */
				totaalPrijs = totaalPrijs + tijdelijkArtikel.getPrijs();
			}
		
		/* De berekende totaal prijs terug geven. */
		return totaalPrijs;
	}
	
	
	/* Methode om het aantal artikelen dat in totaal langs de kassa is geweest, terug te geven. */
	public int aantalArtikelen()
	{
		return this.TotaalAantalProducten;
	}
	
	
	/* Methode om het geld bedrag wat totaal is betaald terug te geven. */
	public double hoeveelheidGeldInKassa()
	{
		return this.TotaalGeldInKassa;
	}
	
	
	/* Methode om zowel het aantal producten, als het totaal bedrag op 0 te zetten. */
	public void resetKassa()
	{
		this.TotaalGeldInKassa		= 0;
		this.TotaalAantalProducten	= 0;
	}
}