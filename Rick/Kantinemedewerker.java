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
	
	public Kantinemedewerker () {
		super (123456789, "Rick", "Wolthuis", 6, 1, 1992, 'M');
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