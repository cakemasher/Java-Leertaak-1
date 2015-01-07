/**
 * Write a description of class Kassa here.
 * 
 * @author Rick Wolthuis
 * @version 7-1-2015
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
	
	
	/* Methdoe om korting over het 'double totaal' te verekenen en dit te returnen. */
	private double totaalPrijsMetKorting (double totaal, double korting, boolean hasMax, double max)
	{	
		/* Niew totaal berekenen met de ingevulde korting eraf. */
		double newTotaal	= (totaal * ((100 - korting) / 100));
		
			/* Kijken of er een max korting aan vast zit. */
			if (hasMax)
			{
				/* Kijken of het verschil tussen het totaal, en totaal met korting eraf, hoger is dan het max korting wat gegeven mag worden. */
				if ((totaal - newTotaal) > max)
				{
					/* Het bleek dat er te veel korting is gegeven. Pak de totaal prijs, en haal hier het max af wat er gegeven mag worden. */
					newTotaal = totaal - max;
				}
			}
		
		/* Return het nieuwe totaal. */
		return newTotaal;
	}
	
	
	/* Methode rekenAf waarmee er word afgerekend met de eerste persoon uit de wachtrij van de kassa. */
	public void rekenAf() throws TeWeinigGeldException
	{
		/* De eerste persoon uit de wachtrij van de kassa ophalen. */
		Persoon klant = this.kassaRij.eerstePersoonInRij();
		
		/* De gegevens van de klant op het scherm weergeven. */
		System.out.print (klant.toString());
		
		/* Alle artikelen van de klant zijn of haar dienblad ophalen en in een stack plaatsen. */
		Stack<Artikel> artikelen	= klant.getDienblad();
		
		/* De totaalprijs berekenen en in een aparte variable zetten, aangezien deze nu twee keer word gebruikt. */
		Double totaalPrijs			= this.getTotaalPrijs(artikelen);
		Double oudeTotaalPrijs		= 0.0;
		
		/* De betaalwijze van de klant ophalen. */
		Betaalwijze betaalwijze		= klant.getBetaalwijze();
		
		/* Een boolean om te kijken of deze klant korting krijgt of niet. */
		double korting				= 0;
		
		
			/* Kijken of de geselecteerde klant een kortingskaarthouder is. */
			if (klant instanceof KortingskaartHouder)
			{
				/* Het oude totaalprijs opslaan voordat deze verekent word met de korting. */
				oudeTotaalPrijs = totaalPrijs;
				
				/* Kijken of de klant een docent of kantine mederwerker is, en pas de prijs aan. */
				if (klant instanceof Docent)
				{
					korting		= ((Docent) klant).geefKortingsPercentage();
					totaalPrijs	= this.totaalPrijsMetKorting (totaalPrijs, ((Docent) klant).geefKortingsPercentage(), ((Docent) klant).heeftMaximum(), ((Docent) klant).geefMaximum());
				}
				else
				{
					korting		= ((Kantinemedewerker) klant).geefKortingsPercentage();
					totaalPrijs	= this.totaalPrijsMetKorting (totaalPrijs, ((Kantinemedewerker) klant).geefKortingsPercentage(), ((Kantinemedewerker) klant).heeftMaximum(), ((Kantinemedewerker) klant).geefMaximum());
				}
			}
			
			
			try
			{
				betaalwijze.betaal (totaalPrijs);
				
				if (korting != 0)
					System.out.println ("\n## Betaald: €" + totaalPrijs + " (€" + oudeTotaalPrijs + " - %" + korting + " korting)");
				else
					System.out.println ("\n## Betaald: €" + totaalPrijs);
				
				/* Totalen van de kassa aanpassen, en alles bijelkaar optellen. */
				this.TotaalAantalProducten	= this.TotaalAantalProducten + this.getAantalArtikelen (artikelen);
				this.TotaalGeldInKassa		= this.TotaalGeldInKassa + totaalPrijs;
			}
			catch (TeWeinigGeldException err)
			{
				throw new TeWeinigGeldException (klant.getVoornaam() + " " + klant.getAchternaam() + " heeft onvoldoende saldo om zijn bestelling van €" + totaalPrijs + " te voldoen.");
				//System.out.println (err.getMessage());
			}
		
		
		/* Een tweetal lege regels printen, zodat het in het console wat overzichterlijker word. */
		System.out.println (" ");
		System.out.println (" ");
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