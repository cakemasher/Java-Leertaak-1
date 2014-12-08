import java.util.*;

public class KantineAanbod {
    // interne opslag voorraad
    private HashMap<String, ArrayList<Artikel>> aanbod;
    
    private int bestelniveau = 1000;
    private static final int vulniveau = 20000;
   
    
    /**
     * Constructor. Het eerste argument is een lijst met artikelnamen,
     * het tweede argument is een lijst met prijzen en het derde argument
     * is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
     * moeten wel gelijk zijn!
     */
    public KantineAanbod(String[] artikelnaam, double[] prijs, int[] hoeveelheid) {
        aanbod=new HashMap<String, ArrayList<Artikel>>();
        for(int i=0;i<artikelnaam.length;i++) 
        {
            ArrayList<Artikel> artikelen=new ArrayList<Artikel>();
            for(int j=0;j<hoeveelheid[i];j++) 
            {
                artikelen.add(new Artikel(artikelnaam[i], prijs[i]));
            }
            aanbod.put(artikelnaam[i], artikelen);
        }
    }

    /*
     * Private methode om de lijst van artikelen te krijgen op basis van de    
     * naam van het artikel. Retourneert null als artikel niet bestaat.
     */
    private ArrayList<Artikel> getArrayList(String productnaam) {
         return aanbod.get(productnaam); 
    }

    /**
     * Private methode om een Artikel van de stapel artikelen af te pakken. 
     * Retourneert null als de stapel leeg is.
     */
    private Artikel getArtikel(ArrayList<Artikel> stapel) {
        if (stapel==null) { 
            return null;
        }
        if (stapel.size()==0)
        {
           return null;
        }
        else 
        {
            Artikel a=stapel.get(0);
            stapel.remove(0);
            return a;
        }
    }
    
    /*
     * Controleer of de voorraad grootte kleiner is als het bestelniveau.
     * Als dit zo is bestel nieuwe artikelen.
     * @param de naam die het artikel heeft.
     */    
    public void controleerVoorraad(String artikelNaam)
    {
        ArrayList<Artikel> voorraad = this.getArrayList(artikelNaam);
        
        if(voorraad.size() < this.bestelniveau)
        {
            this.vulVoorraad(artikelNaam, voorraad.size(), voorraad.get(0).getPrice());
        }                
    }
    
    /*
     * Verwijder de artikelnaam uit de ArrayList zodat deze opnieuw toegevoegd kan worden.
     * Maak een nieuwe artikel ArrayList met de naam voorraad.
     * Een for loop zodat het artikel zo vaak wordt toegevoegd aan de voorraad.
     * @param de naam van de artikel.
     * @param het aantal artikelen dat er nog waren in de voorraad.
     * @param de prijs die het artikel heeft.
     */
    public void vulVoorraad(String artikelNaam, int size, double prijs)
    {
        this.aanbod.remove(artikelNaam);
        
        ArrayList<Artikel> voorraad = new ArrayList<Artikel>();
        
        for(int i = 0; i < (this.vulniveau + size); i++)
        {
            voorraad.add(new Artikel(artikelNaam, prijs));
        }
        
        this.aanbod.put(artikelNaam, voorraad);
    }

    /**
     * Publieke methode om een artikel via naam van de stapel te pakken.
     * Retouneert null als artikel niet bestaat of niet op voorraad is.
     * @param naam (van artikel)
     * @return artikel (of null)
     */
    public Artikel getArtikel(String naam) {
        this.controleerVoorraad(naam);
        return getArtikel(getArrayList(naam));
    }
}
