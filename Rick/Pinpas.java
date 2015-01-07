/**
 * Write a description of class Pinpas here.
 * 
 * @author Rick Wolthuis
 * @version 7-1-2015
 */

public class Pinpas extends Betaalwijze
{
	private double kredietlimiet	= 1000000.0;
	
	
	public void setKredietLimiet(double kredietlimiet)
	{
		this.kredietlimiet = kredietlimiet;
	}
	
	
	public void betaal(double tebetalen) throws TeWeinigGeldException
	{
		if (tebetalen > this.kredietlimiet)
			throw new TeWeinigGeldException ("De bodem van zijn of haar portomonee is berijkt :(");
	}
}