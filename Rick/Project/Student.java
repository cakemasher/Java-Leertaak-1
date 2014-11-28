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
	
	
	public Student () {
		super (123456789, "Rick", "Wolthuis", 6, 1, 1992, 'M');
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