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
    System.out.println(this.getClass().getSimpleName() + ": Tworzę ziarno KonceptDImpl");
  }

  public void funkcjaD() {
    System.out.println(this.getClass().getSimpleName() + ": Siema z D!");
  }
}
