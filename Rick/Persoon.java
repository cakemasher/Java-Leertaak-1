/**
 * Write a description of class Persoon here.
 * 
 * @author Rick Wolthuis
 * @version 18-11-2014
 */

/* Stack importeren zodat we deze kunnen gebruiken in onze class. */
import java.util.Stack;
 
public class Persoon
{
	// instance variables - replace the example below with your own
	private int BSN;
	private String Voornaam;
	private String Achternaam;
	private char Geslacht;
	
	private int GeboorteDatumDag;
	private int GeboorteDatumMaand;
	private int GeboorteDatumJaar;
	
	private Dienblad dienblad;
	
	/* Constructer voor de class Persoon. */
	public Persoon(int BSN, String Voornaam, String Achternaam, int GeboorteDatumDag, int GeboorteDatumMaand, int GeboorteDatumJaar, char Geslacht)
	{
		/* De onderstaande gegevens in het object opslaan. */
		this.BSN		= BSN;
		this.Voornaam	= Voornaam;
		this.Achternaam	= Achternaam;
		
		/* De setters aanroepen om de controles uit te voeren. */
		this.setGeboorteDatum(GeboorteDatumDag, GeboorteDatumMaand, GeboorteDatumJaar);
		this.setGeslacht(Geslacht);
	}
	
	
	/* Een void functie waarmee de gegevens worden geprint. */
	public void drukAf()
	{
		/* Het begin van de functie markeren, gevolgd door een enter, zodat het duidelijk word dat onderstaande bij elkaar hoord. */
		System.out.println("########################");
		
		/* De voor en achternaam printen. */
		System.out.println("## Naam: " + this.getVoornaam () + " " + this.getAchternaam ());
		
		/* Het BSN nummer printen. */
		System.out.println("## BSN: " + this.getBSN ());
		
		/* Het geslacht printen. */
		System.out.println("## Geslacht: " + this.getGeslacht ());
		
		/* Het geboortedatum printen. */
		System.out.println("## Geboortedatum: " + this.getGeboorteDatum ());
		
		/* Het einde van de print functie markeren, zodat indien er meerdere personen worden geprint het makkelijker leesbaar is. */
		System.out.println("########################");
		System.out.println("");
	}
	
	
	/* Functie om een dienblad te koppelen aan een persoon. */
	public void pakDienblad(Dienblad dienblad)
	{
		/* Het dienblad in de object plaatsen. */
		this.dienblad = dienblad;
	}
	
	
	/* Functie waarbij de instantie 'dienblad' word terug gegeven. */
	public Stack<Artikel> getDienblad ()
	{
		return this.dienblad.getArtikelen();
	}
	
	
	/*
		Private functie (word alleen binnen de klass gebruikt) waarmee gechecked word of een datum geldig is.
		Returned een true bij geldigheid, en false bij ongeldigheid.
	*/
	private boolean checkDatum(int dag, int maand, int jaar)
	{
		/* Switch de maand. */
		switch(maand)
		{
			/* Bij maand 1, 3, 5, 7, 8, 10 en 12, voer het gedeelte onder 12 uit. */
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				/* Kijken of de dag gelijk of minder is dan 31. */
				if (dag <= 31)
					return true;
			break;
			
			/* Indien maand 2 geselecteerd word. */
			case 2:
				/* Kijken of we in een schikkeljaar zitten. */
				if (this.isSchikkelJaar(jaar))
				{
					/* We zitten in een schikkeljaar, dus het aantal dagen mag max. 29 zijn. */
					if (dag <= 29)
						return true;
				}
				else
				{
					/* We zitten buiten een schikkeljaar, dus het aantal dagen mag max. 28 zijn. */
					if (dag <= 28)
						return true;
				}
			break;
			
			/* Alle overige, niet boven genoemde maand nummers, komen hier uit. */
			default:
				/* Kijken of dag gelijk of minder is dan 30. */
				if (dag <= 30)
					return true;
			break;			
		}
		
		/* De datum is ongeldig, dus return een false. */
		return false;
	}
	
	
	/* private function om te controleren of het jaar een schikkeljaar is of niet. true = schikkeljaar, false = geen schikkeljaar */
	private boolean isSchikkelJaar(int jaar)
	{
		/* Is het jaar deelbaar door 100? */
		if ((jaar % 100) == 0)
		{
			/* Is het jaar deelbaar door 400? Zo ja, return true. */
			if ((jaar % 400) == 0)
				return true;
		}
		else
		{
			/* Is het jaar deelbaar door 4? Zo ja, return true. */
			if ((jaar % 4) == 0)
				return true;
		}
		
		/* Het jaar is niet deelbaar door 400 en ook niet door 4, dus geen schikkeljaar. */
		return false;
	}
	
	
	/* Een functie waarbij de dag, maand en jaar in cijfers word ingevoerd, gecontrolleerd en indien akkoord, word geset. */
	public void setGeboorteDatum(int dag, int maand, int jaar)
	{
		/* Controleren of de dag, maand en jaar geldig zijn, en of de datum een geldige datum is, zo nee, worden alle values naar 0 gezet. */
		if (dag < 1 || (maand < 1 || maand > 12) || (jaar < 1900 || jaar > 2100) || !this.checkDatum(dag, maand, jaar))
		{
			/* De boolean bleek true of de datum bleek ongeldig, waardoor alles op 0 word gezet. */
			dag		= 0;
			maand	= 0;
			jaar	= 0;
		}
		
		/* Het resultaat van alle checks in de object variables plaatsen. */
		this.GeboorteDatumDag	= dag;
		this.GeboorteDatumMaand	= maand;
		this.GeboorteDatumJaar	= jaar;
	}
	
	
	/* Een functie om het geslacht te setten, na een controle */
	public void setGeslacht(char geslacht)
	{
		char upperGeslacht = Character.toUpperCase(geslacht);
		
		if (upperGeslacht == 'M')
			this.Geslacht = upperGeslacht;
		else
		if (upperGeslacht == 'V')
			this.Geslacht = upperGeslacht;
		else
			this.Geslacht = 'O';
	}
	
	
	/* Een getter functie, om de geboortedatum op te halen. */
	public String getGeboorteDatum()
	{
		if (this.GeboorteDatumDag == 0 && this.GeboorteDatumMaand == 0 && this.GeboorteDatumJaar == 0)
			return "Onbekend";
		else
			return GeboorteDatumDag + "/" + GeboorteDatumMaand + "/" + GeboorteDatumJaar;
	}
	
	
	/* Een getter functie waarbij het geslacht als String word gereturned. */
	public String getGeslacht()
	{
		/* In onderstaande if statements, word bekeken welke string gereturned moet worden. Indien this.Geslacht de char M bevat, dan word Man gereturned, etc. */
		if (this.Geslacht == 'M')
			return "Man";
		else
		if (this.Geslacht == 'V')
			return "Vrouw";
		else
			return "Onbekend";
	}
	
	
	/* Getter functie om de voornaam op te halen. */
	public String getVoornaam()
	{
		return this.Voornaam;
	}
	
	
	/* Getter functie om de achternaam op te halen. */
	public String getAchternaam()
	{
		return this.Achternaam;
	}
	
	
	/* Getter fubctie om het BSN nummer op te halen. */
	public int getBSN()
	{
		return this.BSN;
	}
}