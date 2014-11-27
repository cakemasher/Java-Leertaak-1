/**
 * Write a description of class Administratie here.
 * 
 * @author Rick Wolthuis
 * @version 27-11-2014
 */

public class Administratie
{
	static final int DAYS_IN_WEEK = 7;
	
	
	/* > PRIVATE < constructor */
	private Administratie ()
	{
		/*
			Een private constructor.
			Deze kan dus niet aangeroepen worden op het moment dat de class aangemaakt word.
			Een foutmelding zou het resultaat zijn van het maken van een Administratie instantie.
			De reden hiervoor, is vanwegen de static methodes die in deze class staan.
			We willen voorkomen dat er een object aangemaakt word van de class Administratie.
		*/
	}

 /**
 * Methode om dagomzet uit te rekenen
 * @param omzet
 * @return array (7 elementen) met dagomzetten
 */
	public static double[] berekenDagOmzet(double[] omzet)
	{
		/* Een nieuwe double array aanmaken, waar een double array in geplaatst word die max. 7 values mag hebben. */
		double[] temp = new double[DAYS_IN_WEEK];
	
			/* Een for loop die 7 keer loopt (elke dag van de week). */
			for(int i = 0; i < DAYS_IN_WEEK; i++)
			{
				/* Een tijdelijke int variabele aanmaken en deze een 0 mee geven. */
				int j = 0;
				
					/* Een while loop maken die net zo lang door gaat met loopen, totdat de value van de dag van de week erna, leeg is. */
					while(omzet[(i + (DAYS_IN_WEEK * j))] != -1)
					{
						/* Het omzet van een bepaalde dag op tellen bij bijvoorbeeld maandag (indien i een 0 is). */
						temp[i] += omzet[(i + (DAYS_IN_WEEK * j))];
						
						/* Een 1 bij j optellen, zodat de volgende week word gechecked. */
						j++;
					}
			}
		
		/* De double array returnen. */
		return temp;
	}
	
	
	
 /**
 * Deze methode berekent van de int array aantal de
 * gemiddelde waarde
 * @param aantal
 * @return het gemiddelde
 */
	public static double berekenGemiddeldAantal(int[] aantal)
	{
		/* Tijdelijke variabelen om het totaal in op te slaan. */
		double totaal	= 0;
		
			/* Elke item in het array aantal bij langs gaan. */
			for(int i = 0; i < aantal.length; i++)
			{
				/* Elk getal bij het totaal optellen. */
				totaal += aantal[i];
			}
		
		/* Het totaal gedeeldoor het aantal values in de array om het gemiddelde uit te rekenen. Het resultaat word gereturned. */
		return (totaal / aantal.length);
	}
	
	
	
 /**
 * Deze methode berekent van de double array omzet de
 * gemiddelde waarde
 * @param omzet
 * @return Het gemiddelde
 */
	public static double berekenGemiddeldeOmzet(double[] omzet)
	{
		/* Tijdelijke variabelen om het totaal in op te slaan. */
		double totaal	= 0;
		
			/* Elke item in het array aantal bij langs gaan. */
			for(int i = 0; i < omzet.length; i++)
			{
				/* Elk getal bij het totaal optellen. */
				totaal += omzet[i];
			}
		
		/* Het totaal gedeeldoor het aantal values in de array om het gemiddelde uit te rekenen. Het resultaat word gereturned. */
		return (totaal / omzet.length);
	}
}