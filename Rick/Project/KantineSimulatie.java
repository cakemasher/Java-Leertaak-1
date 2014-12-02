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
	
	private double[] dagBedragTotalen;
	private int[] dagAantalTotalen;
	
	private String[] dagen								= new String[] {"Maandag", "Disndag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag", "Zondag"};
	
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
	
	
	
	/* Functie waarmee een int array word aangemaakt met als lengte 'int lengte', waarin random getallen tussen 'int min' en 'int max' worden geplaatst. */
	private int[] getRandomArray(int lengte, int min, int max)
	{
		/* Maak nieuwe tijdelijke array aan en initialiseer deze met het aantal uit 'int lengte' */
		int[] temp	= new int[lengte];
		
			/* Maak een loop die alle items bij langs gaat. */
			for(int i = 0; i < lengte; i++)
			{
				/* Geef het desbetreffence element een random getal. */
				temp[i]	= getRandomValue(min, max);
			}
		
		/* Return de tijdelijke array. */
		return temp;
	}
	
	
	
	/* Functie om een random (int) getal terug te krijgen tussen min en max. */
	private int getRandomValue(int min, int max)
	{
		/* Return het random getal. */
		return random.nextInt(max - min + 1) + min;
	}
	
	
	
	/* Functie om een int array, waarin random getallen staan, om te zetten naar een String array met namen van producten. */
	private String[] geefArtikelNamen(int[] indexen)
	{
		/* Nieuwe String array aanmaken met dezelfde lengte als de int array. */
		String[] artikelen = new String[indexen.length];
		
			/* For loop maken die net zo vaak loopt als de lengte van de array. */
			for(int i = 0; i < indexen.length; i++)
			{
				/* Het desbetreffence element de naam geven die bij het getal hoort uit de int array. */
				artikelen[i] = artikelnamen[indexen[i]];
			}
		
		/* De String array returnen. */
		return artikelen;
	}
	
	
	
	/* Setter functie om het kantine aanbod object op te slaan. */
	private void setKantineAanbod (KantineAanbod aanbod)
	{
		this.kantineaanbod = aanbod;
	}
	
	
	
	/* Getter functie om het kantine aanbod object op te halen. */
	private KantineAanbod getKantineAanbod ()
	{
		return this.kantineaanbod;
	}
	
	
	
	/* Functie om een nieuwe Persoon (Student, Docent of Kantinemedewerker) object te vullen met een dienblad en artikelen. */
	private void nieuweKlant (Persoon klant)
	{
		/* Nieuwe dieblad aanmaken en koppelen aan de nieuwe klant. */
		klant.pakDienblad(new Dienblad());
						
		/* Random aantal artikelen berekenen. */
		int aantalartikelen	= this.getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);
						
		/* Een int array aanmaken met het zelfde aantal values als aantalartikelen */
		int[] tepakken		= getRandomArray(aantalartikelen, 0, AANTAL_ARTIKELEN - 1);
						
		/* De ints in de array tepakken koppelen met product namen. */
		String[] artikelen	= geefArtikelNamen(tepakken);
						
		/* Een nieuwe klant aanmaken, die een dienblad geven waarop 2 producten worden geplaatst. */
		this.kantine.loopPakSluitAan(klant, artikelen);
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
			this.dagBedragTotalen	= new double[dagen];
			this.dagAantalTotalen	= new int[dagen];
			
			/* Net zolang loopen totdat het aantal ingevulde dagen is berijkt. */
			for(int i = 0; i < dagen; i++)
			{
				/* Een random value pakken tussen het min en max aantal personen per dag. */
				int aantalPersonen	= this.getRandomValue (this.MIN_PERSONEN_PER_DAG, this.MAX_PERSONEN_PER_DAG);
					
					/* Dat aantal gebruiken om het aantal loops te defineren. */
					for (int j = 0; j < aantalPersonen; j++)
					{
						/* Een random getal tussen de 1 en de 100 pakken. */
						int random	= this.getRandomValue (1, 100);
							
							/* Indien lager dan 89, maak student. Indien tussen 89 en 99 maak docent. Anders, maak kantinemedewerker. */
							if (random < 89)
								this.nieuweKlant (new Student (1337, "Rick", "Wolthuis", 6, 1, 1992, 'M'));
							else
							if (random >= 89 && random <= 99)
								this.nieuweKlant (new Docent (1337, "Rick", "Wolthuis", 6, 1, 1992, 'M'));
							else
								this.nieuweKlant (new Kantinemedewerker (1337, "Rick", "Wolthuis", 6, 1, 1992, 'M'));
					}
				
				
				/* De wachtrij verwerken, zodat alle klanten hebben afgerekend. */
				this.kantine.verwerkRijVoorKassa();
				
				/*
					Er word afgerond op twee decimalen. In andere woorden, eerst word het getal x 100 gedaan, dus het getal 100,5050 word bijv. 10050,50
					Dit getal word afgerond, wat uitkomt op 10051. Vervolgens word het getal weer gedeeld door 100, wat op het volgende uitkomt: 100,51.
					De reden hiervoor, is omdat Math.round geen doubles af kan ronden (het delen door 100 word gedaan in de println functie).
				*/
				double geldInKassa = Math.round ((this.kantine.getKassa().hoeveelheidGeldInKassa() * 100));
				
				
				this.dagBedragTotalen[i]	= (geldInKassa / 100);
				this.dagAantalTotalen[i]	= this.kantine.getKassa().aantalArtikelen();
				
				
				/* De gegevens van de dag printen. */
				System.out.println ("Dag: " + (i + 1) + " / " + dagen);
				System.out.println ("Klanten: 100");
				System.out.println ("Geld in kas: €" + (geldInKassa / 100));
				System.out.println ("Aantal artikelen verkocht: " + this.kantine.getKassa().aantalArtikelen());
				System.out.println ("");
				
				/* De gegevens (totaal geld en aantal artikelen) resetten. */
				this.kantine.resetKassa();
			}
			
			
			System.out.println ("Dag omzet: ");
			
			double[] temp = Administratie.berekenDagOmzet (this.dagBedragTotalen);
			
				for (int i = 0; i < temp.length; i++)
					System.out.println ("  " + this.dagen[i] + ": €" + temp[i]);
			
			System.out.println ("Gemiggelde aantal producten: " + Administratie.berekenGemiddeldAantal (this.dagAantalTotalen));
			System.out.println ("Gemiddelde omzet: €" + Administratie.berekenGemiddeldeOmzet (this.dagBedragTotalen));
			
		}
		
		/* Aangeven dat de simulatie gestopt is. */
		System.out.println ("######## Einde Simulatie ########");
	}
}