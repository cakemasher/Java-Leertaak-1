/**
 * Write a description of class Pinpas here.
 * 
 * @author Rick Wolthuis
 * @version 7-1-2015
 */
 
public class TeWeinigGeldException extends Exception
{
	private String errorMessage;
	
	public TeWeinigGeldException ()
	{
		super ("Onbekende foutmelding");
	}
	
	
	public TeWeinigGeldException (Exception e)
	{
		super (e.getMessage ());
	}
	
	
	public TeWeinigGeldException (String message)
	{
		super (message);
	}
}