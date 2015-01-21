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
	
	private static final int MIN_VOORRAAD_ARTIKEL	= 10;
	private static final int VUL_VOORRAAD_AAN_TOT	= 10000;
	
	/**
	* Constructor. Het eerste argument is een lijst met artikelnamen,
	* het tweede argument is een lijst met prijzen en het derde argument
	* is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
	* moeten wel gelijk zijn!
	*/
	public KantineAanbod()
	{
		/* Class initialiseren, en aanbod een nieuwe HashMap geven waarin als index key een String word gebruikt, en als value een ArrayList waarin Artikelen komen te staan. */
		aanbod		= new HashMap<String, ArrayList<Artikel>>();
	}
	
	
	/* Methode om een artikel toe te voegen aan het KantineAanbod. */
	public void voegProductToe (String naam, double prijs, int aantal)
	{
		System.out.println ("KantineAanbod: Adding '" + naam + "', Price: '" + prijs + "', Amount: '" + aantal + "'.");
		/* Een ArrayList maken. */
		ArrayList<Artikel> artikelen = new ArrayList<Artikel>();
		
			/* Een for maken die de ArrayList vult met alle artikelen. */
			for (int i = 0; i < aantal; i++)
			{
				artikelen.add (new Artikel (naam, prijs));
				System.out.println ("Added " + i + " / " + aantal + ".");
			}
			
		/* Artikelen in het aanbod plaatsen. */
		this.aanbod.put(naam, artikelen);
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
	
	
	/* Functie waarmee gecontrolleerd word of een artikel nog op voorraad is. */
	private void controleerVoorraad (String artikelNaam)
	{
		/* Het aantal producten ophalen van het artikel dat is geselecteerd. */
		ArrayList<Artikel> voorraad	= this.getArrayList(artikelNaam);
		
			/* Kijken of het voorraad van het product lager is dan het minimaale. */
			if (voorraad.size() < this.MIN_VOORRAAD_ARTIKEL)
			{
				/* Voorraad van het artikel aanpassen. Hierbij word de artikel naam, overige voorraad grootte en de prijs van het artikel word doorgegeven. */
				this.voegVoorraadToe (artikelNaam, voorraad.size(), voorraad.get(0).getPrijs());
			}
	}
	
	
	/* Functie om de voorraad van een artikel aan te vullen. */
	private void voegVoorraadToe (String artikelNaam, int size, double prijs)
	{	
		/* Het artikel verwijderen uit de artikel lijst. */
		aanbod.remove(artikelNaam);
	
		/* Een nieuwe ArrayList aanmaken om de nieuwe voorraad in op te slaan. */
		ArrayList<Artikel> voorraad	= new ArrayList<Artikel>();
		
			/* Een for loop die het overige aantal producten wat in het voorraad was optelt bij het nieuwe aantal. Dit is het eind resultaat hoevaak de loop word gelooped. */
			for(int i = 0; i < (this.VUL_VOORRAAD_AAN_TOT + size); i++) 
			{
				/* Het artikel met de prijs in de ArrayList opslaan. */
				voorraad.add(new Artikel(artikelNaam, prijs));
			}
		
		this.aanbod.put(artikelNaam, voorraad);
	}
	
	
	
	/**
	* Publieke methode om een artikel via naam van de stapel te pakken.
	* Retouneert null als artikel niet bestaat of niet op voorraad is.
	* @param naam (van artikel)
	* @return artikel (of null)
	*/
	public Artikel getArtikel(String naam)
	{
		this.controleerVoorraad (naam);
		/* De gegevens van het Artikel ophalen met de naam 'naam'. */
		return getArtikel(getArrayList(naam));
	}
}
