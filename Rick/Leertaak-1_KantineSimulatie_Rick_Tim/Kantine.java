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
	private KantineAanbod kantineAanbod;
	
	/* Constructor */
	public Kantine()
	{
		/* Nieuwe kassarij aanmaken en deze opslaan. */
		this.kassarij = new KassaRij();
		
		/* Nieuwe kassa aanmaken, de kassarij hierin mee geven, en de kassa opslaan. */
		this.kassa = new Kassa(kassarij);
	}
	
	
	/* Functie waarmee een kantine aanbod object geset kan worden. */
	public void setKantineAanbod(KantineAanbod aanbod)
	{
		/* Het daadwerkelijk setten van het kantine aanbod. */
		this.kantineAanbod = aanbod;
	}
	
	
	/* Functie waarmee een klant aangemaakt word, deze een nieuw dienblad gegeven word en waarop twee artikelen worden geplaatst. Vervolgens sluit de klant achteraan de wachtrij. */
	public void loopPakSluitAan(Persoon klant, String[] artikelnamen)
	{
		if (artikelnamen.length != 0)
		{
			for (int i = 0; i < artikelnamen.length; i++)
			{
				klant.pakArtikel (this.kantineAanbod.getArtikel(artikelnamen[i]));
			}
		}
		
		/* De klant achterin de kassarij laten aansluiten. */
		this.kassarij.sluitAchteraan(klant);
	}
	
	
	/* Functie waarmee de wachtrij word verwerkt van de kassa. */
	public void verwerkRijVoorKassa() throws TeWeinigGeldException
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
	
	
	/* Getter functie waarmee de variable 'kassa' terug word gegeven. */
	public Kassa getKassa()
	{
		return this.kassa;
	}
	
	
	/* Functie om het aantal artikelen en het geld bedrag in de kassa te resetten. */
	public void resetKassa()
	{
		this.kassa.resetKassa();
	}
}