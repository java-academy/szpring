package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.a_wprowadzenie;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class KonceptCImplDwa implements KonceptC {

  public KonceptCImplDwa(){
    System.out.println("Tworzę ziarno KonceptCImplDwa.");
  }
  public void funkcjaC() {
    System.out.println("Siema z drugiej implementacji C!");
  }
}
