package autowire;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Kacper Staszek
 */
class ConceptBImpl implements ConceptB {

  private ConceptA konceptA;

  public void functionB() {
    System.out.println("Hello from B!");
  }

  @Autowired
  public void setKonceptA(ConceptA konceptA) {
    this.konceptA = konceptA;
  }
}
