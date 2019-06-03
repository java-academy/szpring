package autowire.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 *
 * TODO:
 *  1: Odpowiedz na pytanie w którym momencie Spring wywołuje konstruktor do wstrzyknięcia zależności.
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
