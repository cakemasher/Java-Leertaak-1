/**
 * Write a description of class Docent here.
 * 
 * @author Rick Wolthuis
 * @version 27-11-2014
 */
 
class Docent extends Persoon
{
	private String afkorting;
	private String afdeling;
	
	
	public Docent (int BSN, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht) {
		super (BSN, voornaam, achternaam, dag, maand, jaar, geslacht);
	}
	
	
	public String toString ()
	{
		return "## Type: Docent, afkorting: " + this.afkorting + ", afdeling: " + this.afdeling;
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
}