/**
 * Write a description of class Kantinemedewerker here.
 * 
 * @author Rick Wolthuis
 * @version 27-11-2014
 */

class Kantinemedewerker extends Persoon
{
	private int medewerkersNummer;
	private boolean cassiere;
	
	public Kantinemedewerker (int BSN, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht) {
		super (BSN, voornaam, achternaam, dag, maand, jaar, geslacht);
	}
	
	
	public String toString ()
	{
		return "## Type: Kantinemedewerker, nummer: " + this.medewerkersNummer + ", is cassiere: " + this.cassiere;
	}

	
	public void setMedewerkersNummer (int nummer)
	{
		this.medewerkersNummer = nummer;
	}
	
	
	public void setCassiere (boolean cassiere)
	{
		this.cassiere	= cassiere;
	}
	
	
	public int getMedewerkersNummer ()
	{
		return this.medewerkersNummer;
	}
	
	
	public boolean getCassiere ()
	{
		return this.cassiere;
	}	
}