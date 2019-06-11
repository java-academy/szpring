package autowire.A_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Imituje funkcjonalność
 *
 * @author Kacper Staszek
 */
@Component
class KonceptB {

  private KonceptA konceptA;

  KonceptB(){
    System.out.println("Tworzę ziarno KonceptB");
  }

  void funkcjaB() {
    System.out.println("Siema z B!");
  }

  @Autowired
  public void setKonceptA(KonceptA konceptA) {
    this.konceptA = konceptA;
    System.out.println("wywołuję setter (set konceptA na KoncpetB)");
  }
}
