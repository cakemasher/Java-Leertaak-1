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
	
	
	public Docent () {
		super (123456789, "Rick", "Wolthuis", 6, 1, 1992, 'M');
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