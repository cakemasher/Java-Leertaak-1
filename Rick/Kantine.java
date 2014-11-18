public class Kantine
{
	private Kassa kassa;
	private KassaRij kassarij;
	
	/* Constructor */
	public Kantine()
	{
		/* Nieuwe kassarij aanmaken en deze opslaan. */
		this.kassarij = new KassaRij();
		
		/* Nieuwe kassa aanmaken, de kassarij hierin mee geven, en de kassa opslaan. */
		this.kassa = new Kassa(kassarij);
	}

	/* Functie waarmee een klant aangemaakt word, deze een nieuw dienblad gegeven word en waarop twee artikelen worden geplaatst. Vervolgens sluit de klant achteraan de wachtrij. */
	public void loopPakSluitAan()
	{
		Persoon klant		= new Persoon (101010, "Rick", "Wolthuis", 6, 1, 1992, 'M');
		
		klant.pakDienblad (new Dienblad ());
		
		klant.pakArtikel (new Artikel ("Artikel Naam #1", 10.21));
		klant.pakArtikel (new Artikel ("Artikel Naam #2", 7.54));
		
		this.kassarij.sluitAchteraan (klant);
	}
 /**
 * Deze methode handelt de rij voor de kassa af.
 */
 public void verwerkRijVoorKassa() {
 while() {
 //omitted 
 }
 }
 /**
 * Deze methode telt het geld uit de kassa
 * @return hoeveelheid geld in kassa
 */
 public double hoeveelheidGeldInKassa() {
 //omitted
 }
Thema 1.2 I/TI Leertaak 1 Pagina 10 van 27 /**
 * Deze methode geeft het aantal gepasseerde artikelen.
 * @return het aantal gepasseerde artikelen
 */
 public int aantalArtikelen(){
 //omitted
 }
 
 /**
 * Deze methode reset de bijgehouden telling van 
 * het aantal artikelen
 * en "leegt" de inhoud van de kassa.
 */
 public void resetKassa() {
// omitted
 }
}