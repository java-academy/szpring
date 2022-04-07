package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.a_wprowadzenie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class KonceptCImpl implements KonceptC {

  private KonceptA conceptA;

  @Autowired
  KonceptCImpl(KonceptA conceptA) {
    this.conceptA = conceptA;
    System.out.println("Tworzę ziarno KonceptCImpl");
  }

  public void funkcjaC() {
    System.out.println("Siema z pierwszej implementacji C!");
    conceptA.funckcjaA();
  }
}
