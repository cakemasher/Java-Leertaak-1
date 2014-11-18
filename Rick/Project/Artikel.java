/**
 * Write a description of class Artikel here.
 * 
 * @author Rick Wolthuis
 * @version 18-11-2014
 */
public class Artikel
{
    // De onderstaande variables worden gedeclareerd.
    private String naam;
    private double prijs;
    
    /* De constructer van de class, waarbij de naam en prijs van het artikel mee gegeven word. */
    public Artikel (String naam, double prijs)
    {
        // De onderstaande variables worden geinitialiseerd op het moment dat de class aangemaakt word.
        this.naam   = naam;
        this.prijs  = prijs;
    }
	
	
	/* Een void functie waarmee de gegevens worden geprint. */
	public void drukAf ()
	{
		/* Het begin van de functie markeren, gevolgd door een enter, zodat het duidelijk word dat onderstaande bij elkaar hoord. */
		System.out.println ("########################");
		
		/* De naam van het artikel printen. */
		System.out.println ("## Naam: " + this.getNaam ());
		
		/* De prijs van het artikel printen. */
		System.out.println ("## Prijs: " + this.getPrijs ());
		
		/* Het einde van de print functie markeren, zodat indien er meerdere artikelen worden geprint het makkelijker leesbaar is. */
		System.out.println ("########################");
		System.out.println ("");
	}
    
	
    /* Een void functie om de naam van het artikel te wijzigen. */
    public void setNaam (String newNaam)
    {
        this.naam = newNaam;
    }
	
    
    /* Een functie die een String returned waarmee de naam opgehaald kan worden. */
    public String getNaam ()
    {
        return this.naam;
    }
    
	
    /* Een void functie om de prijs aan te passen. Hier word een double gebruikt i.v.m. getallen achter de komma. */
    public void setPrijs (double newPrijs)
    {
        this.prijs = newPrijs;
    }
    
	
    /* Een functie die een double returned met de prijs van het artikel erin. */
    public double getPrijs ()
    {
        return this.prijs;
    }
}
