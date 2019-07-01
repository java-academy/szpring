package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.a_wprowadzenie;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
@Lazy
class KonceptDImpl implements KonceptD {

  KonceptDImpl() {
    System.out.println("Tworzę ziarno KonceptDImpl");
  }

  public void funkcjaD() {
    System.out.println("Siema z D!");
  }
}
