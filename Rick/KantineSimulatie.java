/**
 * Write a description of class Artikel here.
 * 
 * @author Rick Wolthuis
 * @version 19-11-2014
 */
public class KantineSimulatie
{
	private Kantine kantine;
	private KantineAanbod kantineaanbod;

	/* Constructer waarmee de class. */
	public KantineSimulatie()
	{
		/* Een nieuw kantine object aanmaken en deze opslaan in deze class. */
		this.kantine = new Kantine();
	}
	
	
	/* Setter functie om het kantine aanbod object op te slaan. */
	public void setKantineAanbod (KantineAanbod aanbod)
	{
		this.kantineaanbod = aanbod;
	}
	
	
	/* Getter functie om het kantine aanbod object op te halen. */
	public KantineAanbod getKantineAanbod ()
	{
		return this.kantineaanbod;
	}
	
	
	/* Deze functie start de simulatie, waarbij het aantal dagen word meegegeven in de functie. */
	public void simuleer(int dagen)
	{
		/* Aangeven dat de simulatie gestart is. */
		System.out.println ("######## Start Simulatie ########");
		System.out.println ("");
		
		/* Kijken of de aantal ingevulde dagen niet 0 is. */
		if (dagen != 0)
		{
			/* Net zolang loopen totdat het aantal ingevulde dagen is berijkt. */
			for(int i = 0; i < dagen; i++)
			{
				/* Een loop maken die 10 keer + de dag loopt. */
				for(int j = 0; j < (10 + i); j++)
				{
					/* Een nieuwe klant aanmaken, die een dienblad geven waarop 2 producten worden geplaatst. */
					this.kantine.loopPakSluitAan();
				}
				
				/* De wachtrij verwerken, zodat alle klanten hebben afgerekend. */
				this.kantine.verwerkRijVoorKassa();
				
				/* De gegevens van de dag printen. */
				System.out.println ("Dag: " + (i + 1) + " / " + dagen);
				System.out.println ("Geld in kas: €" + this.kantine.getKassa().hoeveelheidGeldInKassa());
				System.out.println ("Aantal artikelen verkocht: " + this.kantine.getKassa().aantalArtikelen());
				System.out.println ("");
				
				/* De gegevens (totaal geld en aantal artikelen) resetten. */
				this.kantine.resetKassa();
			}
		}
		
		/* Aangeven dat de simulatie gestopt is. */
		System.out.println ("######## Einde Simulatie ########");
	}
}