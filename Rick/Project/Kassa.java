/**
 * Write a description of class Kassa here.
 * 
 * @author Rick Wolthuis
 * @version 18-11-2014
 */
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
		
		/* Totalen van de kassa aanpassen, en alles bijelkaar optellen. */
		this.TotaalGeldInKassa		= this.TotaalGeldInKassa + klant.getTotaalPrijs();
		this.TotaalAantalProducten	= this.TotaalAantalProducten + klant.getAantalArtikelen();
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