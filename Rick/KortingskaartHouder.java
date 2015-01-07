/**
 * Write a description of class Pinpas here.
 * 
 * @author Rick Wolthuis
 * @version 7-1-2015
 */
 
public interface KortingskaartHouder
{

	// methode om kortingspercentage op te vragen
	public double geefKortingsPercentage();
	
	
	// methode om op te vragen of er maximum per keer aan de korting zit
	public boolean heeftMaximum();
	
	
	// methode om het maximum kortingsbedrag op te vragen
	public double geefMaximum();
}