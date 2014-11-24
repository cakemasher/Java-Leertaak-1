/**
 * Write a description of class Artikel here.
 * 
 * @author Rick Wolthuis
 * @version 19-11-2014
 */
 
import java.util.*;
 
public class KantineSimulatie
{
	private Kantine kantine;
	private KantineAanbod kantineaanbod;
	private Random random;
	
	private static final int AANTAL_ARTIKELEN			= 4;
	
	private static final String[] artikelnamen			= new String[] {"Koffie", "Broodje pindakaas", "Broodje kaas", "Appelsap"};
	private static double[] artikelprijzen				= new double[] {1.50, 2.10, 1.65, 1.65};
	
	private static final int MIN_ARTIKELEN_PER_SOORT	= 10000;
	private static final int MAX_ARTIKELEN_PER_SOORT	= 20000;
	
	private static final int MIN_PERSONEN_PER_DAG		= 50;
	private static final int MAX_PERSONEN_PER_DAG		= 100;
	
	private static final int MIN_ARTIKELEN_PER_PERSOON	= 1;
	private static final int MAX_ARTIKELEN_PER_PERSOON	= 4;
	
	
	/* Constructer waarmee de class. */
	public KantineSimulatie()
	{
		/* Een nieuw kantine object aanmaken en deze opslaan in deze class. */
		this.kantine		= new Kantine();
		
		this.random			= new Random();
		
		int[] hoeveelheden	= getRandomArray(this.AANTAL_ARTIKELEN, this.MIN_ARTIKELEN_PER_SOORT, this.MAX_ARTIKELEN_PER_SOORT);
		
		this.kantineaanbod	= new KantineAanbod(this.artikelnamen, this.artikelprijzen, hoeveelheden);
		
		this.kantine.setKantineAanbod(this.kantineaanbod);
	}
	
	
	/* swag 1 */
	private int[] getRandomArray(int lengte, int min, int max)
	{
		int[] temp	= new int[lengte];
		
			for(int i = 0; i < lengte; i++)
			{
				temp[i]	= getRandomValue(min, max);
			}
		
		return temp;
	}
	
	
	/* swag 2 */
	private int getRandomValue(int min, int max)
	{
		return random.nextInt(max - min + 1) + min;
	}
	
	
	/* swag 3 */
	private String[] geefArtikelNamen(int[] indexen)
	{
		String[] artikelen=new String[indexen.length];
		
			for(int i = 0; i < indexen.length; i++)
			{
				artikelen[i] = artikelnamen[indexen[i]];
			}
		
		return artikelen;
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
				int aantalPersonen	= this.getRandomValue (this.MIN_PERSONEN_PER_DAG, this.MAX_PERSONEN_PER_DAG);
				
					/* Een loop maken die 10 keer + de dag loopt. */
					for(int j = 0; j < aantalPersonen; j++)
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
	
	/*
 public void simuleer(int dagen) {
 // for lus voor dagen
	for(int i=0;i<dagen;i++) {
 // bedenk hoeveel personen vandaag binnen lopen
		int aantalpersonen=...
 // laat de personen maar komen...
			for(int j=0;j<aantalpersonen;j++) {
 // maak persoon en dienblad aan, koppel ze
 // bedenk hoeveel artikelen worden gepakt
				int aantalartikelen=...
 // genereer de “artikelnummers”, dit zijn indexen
 // van de artikelnamen array
				int[] tepakken=getRandomArray(aantalartikelen, 0,AANTAL_ARTIKELEN-1);
 // vind de artikelnamen op basis van
 // de indexen hierboven
				String[] artikelen=geefArtikelNamen(tepakken);

 // loop de kantine binnen, pak de gewenste
 // artikelen, sluit aan
 }
 // verwerk rij voor de kassa
 // druk de dagtotalen af en hoeveel personen binnen
 // zijn gekomen
 // reset de kassa voor de volgende dag
 }
 */
}