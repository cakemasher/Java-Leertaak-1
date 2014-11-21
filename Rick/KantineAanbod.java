/**
 * Write a description of class KantineAanbod here.
 * 
 * @author Hanzehogeschool Groningen
 *    @bron http://blackboard.hanze.nl -> Courses -> 2.1 -> Leertaken -> Kantine.zip
 * @editor Rick Wolthuis
 * @version 21-11-2014
 */

import java.util.*;

public class KantineAanbod
{
	// interne opslag voorraad
	private HashMap<String, ArrayList<Artikel>> aanbod;
	
	/**
	* Constructor. Het eerste argument is een lijst met artikelnamen,
	* het tweede argument is een lijst met prijzen en het derde argument
	* is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
	* moeten wel gelijk zijn!
	*/
	public KantineAanbod(String[] artikelnaam, double[] prijs, int[] hoeveelheid)
	{
		/* Class initialiseren, en aanbod een nieuwe HashMap geven waarin als index key een String word gebruikt, en als value een ArrayList waarin Artikelen komen te staan. */
		aanbod = new HashMap<String, ArrayList<Artikel>>();
			
			/* Een for loop, die het zelfde aantal keer loopt als de array artikelnaam values heeft. */
			for(int i = 0; i < artikelnaam.length; i++) 
			{
				/* Een nieuwe variabele initaliseren als ArrayList. */
				ArrayList<Artikel> artikelen = new ArrayList<Artikel>();
				
					/* Een for loop maken, die net zo vaak loopt als de hoeveelheid aangeeft. */
					for(int j = 0; j < hoeveelheid[i]; j++) 
					{
						/* Het artikel met de prijs in de ArrayList opslaan. */
						artikelen.add(new Artikel(artikelnaam[i], prijs[i]));
					}
				
				/* De ArrayList opslaan in de HashMap waarbij de index key de naam van het artikel mee krijgt. */
				aanbod.put(artikelnaam[i], artikelen);
			}
	}
	
	
	/*
	* Private methode om de lijst van artikelen te krijgen op basis van de    
	* naam van het artikel. Retourneert null als artikel niet bestaat.
	*/
    private ArrayList<Artikel> getArrayList(String productnaam)
	{
		/* De ArrayList die bij 'productnaam' hoort terug geven. */
		return aanbod.get(productnaam); 
	}
	
	
	/**
	* Private methode om een Artikel van de stapel artikelen af te pakken. 
	* Retourneert null als de stapel leeg is.
	*/
	private Artikel getArtikel(ArrayList<Artikel> stapel)
	{
		/* Als stapel null is, dan word een null gereturned. */
		if (stapel == null)
			return null;
		
		/* Kijken of de ArrayList minimaal wel één value bevat. */
		if (stapel.size() == 0)
			return null;
		else 
		{
			/* De eerste value uit de ArrayList pakken. */
			Artikel a = stapel.get(0);
			
			/* De eerste value uit de ArrayList verwijderen. */
			stapel.remove(0);
			
			/* Het opgehaalde artikel returnen. */
			return a;
		}
	}
	
	
	/**
	* Publieke methode om een artikel via naam van de stapel te pakken.
	* Retouneert null als artikel niet bestaat of niet op voorraad is.
	* @param naam (van artikel)
	* @return artikel (of null)
	*/
	public Artikel getArtikel(String naam)
	{
		/* De gegevens van het Artikel ophalen met de naam 'naam'. */
		return getArtikel(getArrayList(naam));
	}
}
