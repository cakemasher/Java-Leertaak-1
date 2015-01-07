/**
 * Write a description of class Betaalwijze here.
 * 
 * @author Rick Wolthuis
 * @version 7-1-2015
 */

public abstract class Betaalwijze
{
	protected double saldo;
	
	public void setSaldo (double saldo)
	{
		this.saldo = saldo;
	}
	
	public abstract void betaal (double tebetalen) throws TeWeinigGeldException;
}