import java.util.*;

public class Administratie {
  private Administratie()
  {
      
  }
    
  /**
   * Deze methode berekent van de int array aantal de 
   * gemiddelde waarde
   * @param aantal
   * @return het gemiddelde
   */
  public static double berekenGemiddeldAantal(int[] aantal) {
      double gemiddeldeaatal;
      int totaalaantal = 0;
      
      double lengteaantal = aantal.length;
      for(int Aantal : aantal)
      {
          totaalaantal = totaalaantal + Aantal;
      }
      gemiddeldeaatal = totaalaantal / lengteaantal;
      
      return gemiddeldeaatal;
  }

  /**
   * Deze methode berekent van de double array omzet de 
   * gemiddelde waarde
   * @param omzet
   * @return Het gemiddelde
   */
  public static double berekenGemiddeldeOmzet(double[] omzet) {
      double gemiddeldeomzet;
      double totaalomzet = 0;
      
      double lengteomzet = omzet.length;
      for(double Omzet : omzet)
      {
          totaalomzet = totaalomzet + Omzet;
      }
      gemiddeldeomzet = totaalomzet / lengteomzet;
      
      return gemiddeldeomzet;
  }
  
  /**
   * Methode om de dagomzet uit te rekenen
   * @param omzet
   * @return array(7 elementen) met dagomzetten
   */
  public static double[] berekenDagOmzet(double[] omzet)
  {
      double[] temp = new double[7];
      for(int i = 0; i < 7; i++)
      {
          int j = 0;
          while(j < omzet.length)
          {
              temp[i] += omzet[i + 7 * j];
              j++;
          }
      }
      return temp;
  }
}
