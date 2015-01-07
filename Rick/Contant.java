/**
 * Write a description of class Contant here.
 * 
 * @author Rick Wolthuis
 * @version 7-1-2015
 */

public class Contant extends Betaalwijze
{
	private boolean bodemVanPortomonee()
	{
		/* Uiteraard word de bodem nooit berijkt. */
		return false;
	}
	
	
	public void betaal(double tebetalen) throws TeWeinigGeldException
	{
		if (this.bodemVanPortomonee ())
		{
			throw new TeWeinigGeldException ("De bodem van zijn of haar portomonee is berijkt :(");
		}
	}
}