import java.util.*;

public class KantineSimulatie {
  // kantine
  private Kantine kantine;

  // kantineaanbod
  private KantineAanbod kantineaanbod;

  // random generator
  private Random random;

  // aantal artikelen
  private static final int AANTAL_ARTIKELEN=4;

  // artikelen
  private static final String[] artikelnamen=
    new String[] {"Koffie","Broodje hamburger", "Broodje kaas", "Melk"};

  // prijzen
  private static double[] artikelprijzen=
    new double[]{1.50, 2.10, 1.65, 1.65};   

  // minimum en maximum aantal artikelen per soort
  private static final int MIN_ARTIKELEN_PER_SOORT=10000;
  private static final int MAX_ARTIKELEN_PER_SOORT=20000;

  // minimum en maximum aantal personen per dag
  private static final int MIN_PERSONEN_PER_DAG=50;
  private static final int MAX_PERSONEN_PER_DAG=100;

  // minimum en maximum artikelen per persoon
  private static final int MIN_ARTIKELEN_PER_PERSOON=1;
  private static final int MAX_ARTIKELEN_PER_PERSOON=4;

  /**
   * Constructor
   */
  public KantineSimulatie(){
    kantine=new Kantine();
    random=new Random();
    int[] hoeveelheden=getRandomArray(
        AANTAL_ARTIKELEN,MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
    kantineaanbod=new KantineAanbod(artikelnamen, artikelprijzen, 
        hoeveelheden); 
    kantine.setKantineAanbod(kantineaanbod);
  }

  /**
   * Methode om een array van random getallen liggend tussen min en max 
   * van de gegeven lengte te genereren
   * @param lengte
   * @param min
   * @param max
   * @return De array met random getallen
   */
  private int[] getRandomArray(int lengte, int min, int max) {
    int[] temp=new int[lengte];
    for(int i=0;i<lengte;i++) {
      temp[i]=getRandomValue(min, max);
    }
    return temp;
  }

  /**
   * Methode om een random getal tussen min(incl) en 
   * max(incl) te genereren.
   * @param min
   * @param max
   * @return Een random getal
   */
  private int getRandomValue(int min, int max) {
    return random.nextInt(max-min+1)+min;
  }

  /**
   * Methode om op basis van een array van indexen voor de array 
   * artikelnamen de bijhorende array van artikelnamen te maken
   * @param indexen
   * @return De array met artikelnamen
   */
  private String[] geefArtikelNamen(int[] indexen) {
    String[] artikelen=new String[indexen.length];
    for(int i=0;i<indexen.length;i++) { 
      artikelen[i]=artikelnamen[indexen[i]];
    }
    return artikelen;
  }

  /**
   * Deze methode simuleert een aantal dagen in het 
   * verloop van de kantine
   * @param dagen
   */
  public void simuleer(int dagen) {
    // for lus voor het aantal dagen
    for(int i = 0; i < dagen; i++) {
      // Random hoeveelheid personen vastgelegd aan de waarden min en max personen per dag.
      int aantalpersonen= getRandomValue(MIN_PERSONEN_PER_DAG, MIN_PERSONEN_PER_DAG);

        // for lus aan de hand van het aantalpersoen.
        for(int j = 0; j < aantalpersonen; j++) {
          // Voor elke persoon worden gegevens ingevoerd en gelinkt aan een nieuw dienblad.
          // randam aantal artikelen dat later wordt gepakt.
          Persoon persoon = new Persoon(123456, "Tim", "Zijlstra", 1995, 12, 11, 'M');
          
          int aantalartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);
          
          //Gegenereerde "artikelnummers", wat zal worden gebruikt als index voor de artikelen.  
          int[] tepakken = getRandomArray(aantalartikelen, 0, AANTAL_ARTIKELEN-1);
          
          // De artikelnamen worden gevonden aan de hand van de index nummers.
          String[] artikelen = geefArtikelNamen(tepakken);

          // Loop de kantine binnen pak gewenste artikelen en sluit aan in de rij.
          this.kantine.loopPakSluitAan(persoon, artikelen);
        }

      // verwerk rij voor de kassa
      // druk de dagtotalen af en hoeveel personen binnen 
      // zijn gekomen
      // reset de kassa voor de volgende dag
      this.kantine.verwerkRijVoorKassa();
      
      
      double geldinkassa = Math.round(this.kantine.getKassa().hoeveelheidGeldInKassa() * 100);
      
      System.out.println("");
      System.out.println("Dag " + (i+1));
      System.out.println("---------------------");
      System.out.println("Aantal artikelen: " + this.kantine.getKassa().aantalArtikelen());
      System.out.println("Geld winst: " + (geldinkassa / 100));
      System.out.println("---------------------");
      
      this.kantine.getKassa().resetKassa();
      
    }
  }
}
