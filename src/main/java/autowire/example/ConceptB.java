package autowire.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class ConceptB {

  private ConceptA konceptA;

  void functionB() {
    System.out.println("Hello from B!");
  }

  @Autowired
  public void setKonceptA(ConceptA konceptA) {
    this.konceptA = konceptA;
  }
}
