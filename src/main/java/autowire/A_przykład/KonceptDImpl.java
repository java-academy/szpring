package autowire.A_przykład;

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
