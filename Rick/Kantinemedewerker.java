/**
 * Write a description of class Kantinemedewerker here.
 * 
 * @author Rick Wolthuis
 * @version 7-1-2015
 */

class Kantinemedewerker extends Persoon implements KortingskaartHouder
{
	private int medewerkersNummer;
	private boolean cassiere;
	
	public Kantinemedewerker (int BSN, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht) {
		super (BSN, voornaam, achternaam, dag, maand, jaar, geslacht);
	}
	
	
	public String toString ()
	{
		String vanPersoon = super.toString();
		
		return vanPersoon + "## Type: Kantinemedewerker, nummer: " + this.medewerkersNummer + ", is cassiere: " + this.cassiere;
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
	
		
	public double geefKortingsPercentage ()
	{
		return 35;
	}
	
	
	public boolean heeftMaximum ()
	{
		return false;
	}
	
	
	public double geefMaximum ()
	{
		return 0;
	}
}