package autowire.A_przykład;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Imitacja implementacji KonceptA
 * Wstrzykiwanie przez pole. PRZYPOMINAMY - NIEZALECANE.
 *
 * @author Kacper Staszek
 */
@Component
@Lazy
class KonceptAImpl implements KonceptA {

  @Autowired
  @Qualifier("konceptCImpl")
  private KonceptC konceptC;

  public KonceptAImpl(){
    System.out.println("Tworzę ziarno KonceptAImpl");
  }

  public void funckcjaA() {
    System.out.println("Siema z A!");
  }
}
