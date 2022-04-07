package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.a_wprowadzenie;

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
    System.out.println(this.getClass().getSimpleName() + ": Tworzę ziarno KonceptAImpl");
  }

  public void funkcjaA() {
    System.out.println(this.getClass().getSimpleName() + ": Siema z A!");
  }
}
