package autowire.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Imitacja implementacji KonceptA
 * Wstrzykiwanie przez pole. PRZYPOMINAMY - NIEZALECANE.
 *
 * TODO:
 *  1.Odpowiedz na pytanie - dlaczego wstrzykiwanie przez pole jest niezalecaną praktyką.
 *  2.Odpowiedz na pytanie, w którym momencie Spring wstrzykuje zależności przez pola? (np przed setterami?).
 *  3.Zastanów się czy można usunąć annotację Qualifier? Dowiedz się jak działa.
 *  - https://www.mkyong.com/spring/spring-autowiring-qualifier-example/
 *  - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Qualifier.html
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
