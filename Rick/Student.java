/**
 * Write a description of class Student here.
 * 
 * @author Rick Wolthuis
 * @version 27-11-2014
 */

class Student extends Persoon
{
	private int studentnummer;
	private String studierichting;
	
	
	public Student (int BSN, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht) {
		super (BSN, voornaam, achternaam, dag, maand, jaar, geslacht);
	}
	
	
	public String toString ()
	{
		return "## Type: Student, nummer: " + this.studentnummer + ", richting: " + this.studierichting;
	}
	
	
	public void setStudentnummer (int nummer)
	{
		this.studentnummer = nummer;
	}
	
	
	public void setStudierichting (String richting)
	{
		this.studierichting	= richting;
	}
	
	
	public int getStudentnummer ()
	{
		return this.studentnummer;
	}
	
	
	public String getStudierichting ()
	{
		return this.studierichting;
	}	
}