/**
 * Write a description of class Docent here.
 * 
 * @author Rick Wolthuis
 * @version 7-1-2015
 */
 
class Docent extends Persoon implements KortingskaartHouder
{
	private String afkorting;
	private String afdeling;
	
	
	public Docent (int BSN, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht) {
		super (BSN, voornaam, achternaam, dag, maand, jaar, geslacht);
	}
	
	
	public String toString ()
	{
		String vanPersoon = super.toString();
		
		return vanPersoon + "## Type: Docent, afkorting: " + this.afkorting + ", afdeling: " + this.afdeling;
	}
	
	
	public void test ()
	{
		System.out.println ("Test method :D");
	}
	
	
	public void setAfkorting (String afkorting)
	{
		this.afkorting = afkorting;
	}
	
	
	public void setAfdeling (String afdeling)
	{
		this.afdeling	= afdeling;
	}
	
	
	public String getAfkorting ()
	{
		return this.afkorting;
	}
	
	
	public String getAfdeling ()
	{
		return this.afdeling;
	}
	
	
	public double geefKortingsPercentage ()
	{
		return 25;
	}
	
	
	public boolean heeftMaximum ()
	{
		return true;
	}
	
	
	public double geefMaximum ()
	{
		return 1.00;
	}
}