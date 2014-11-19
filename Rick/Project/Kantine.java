/**
 * Write a description of class Artikel here.
 * 
 * @author Rick Wolthuis
 * @version 19-11-2014
 */
public class Kantine
{
	private Kassa kassa;
	private KassaRij kassarij;
	
	/* Constructor */
	public Kantine()
	{
		/* Nieuwe kassarij aanmaken en deze opslaan. */
		this.kassarij = new KassaRij();
		
		/* Nieuwe kassa aanmaken, de kassarij hierin mee geven, en de kassa opslaan. */
		this.kassa = new Kassa(kassarij);
	}
	
	
	/* Functie waarmee een klant aangemaakt word, deze een nieuw dienblad gegeven word en waarop twee artikelen worden geplaatst. Vervolgens sluit de klant achteraan de wachtrij. */
	public void loopPakSluitAan()
	{
		/* Een nieuwe klant aanmaken, en in de constructer de benodigde variables plaatsen. */
		Persoon klant		= new Persoon(101010, "Rick", "Wolthuis", 6, 1, 1992, 'M');
		
		/* De klant een nieuwe dienblad (object) mee geven. */
		klant.pakDienblad(new Dienblad());
		
		/* De klant 2 nieuwe artikelen (objecten) op zijn dienblad laten plaatsen. */
		klant.pakArtikel(new Artikel("Artikel Naam #1", 10.21));
		klant.pakArtikel(new Artikel("Artikel Naam #2", 7.54));
		
		/* De klant achterin de kassarij laten aansluiten. */
		this.kassarij.sluitAchteraan(klant);
	}
	
	
	/* Functie waarmee de wachtrij word verwerkt van de kassa. */
	public void verwerkRijVoorKassa()
	{
		/*
			Een while word hier gebruikt omdat er tijdens de simulatie eventueel klanten zouden kunnen aansluiten.
			De while loopt net zo lang door, totdat alle klanten zijn verwerkt. Indien er dus één of meerdere bij komen, worden deze ook nog verwerkt.
			Indien hier gebruik zou worden gemaakt van een for loop, zou het aantal loops al van te voren worden berekend, en worden daarbij eventuele nieuwe klanten
			niet mee genomen in de loop.
		*/
		
		/* Net zolang loopen totdat er niemand meer in de kassarij staat. */
		while(this.kassarij.erIsEenRij())
		{
			/* De artikelen van de eerst volgende persoon afrekenen */
			this.kassa.rekenAf();
		}
	}
	
	
	/* Functie waarmee het totaal bedrag van de kassa word gereturned. */
	public double hoeveelheidGeldInKassa()
	{
		return this.kassa.hoeveelheidGeldInKassa();
	}
	
	
	/* Functie waarmee het aantal artikelen, die verkocht zijn aan deze kassa, zijn verkocht. */
	public int aantalArtikelen()
	{
		return this.kassa.aantalArtikelen();
	}
	
	
	/* Functie om het aantal artikelen en het geld bedrag in de kassa te resetten. */
	public void resetKassa()
	{
		this.kassa.resetKassa();
	}
}