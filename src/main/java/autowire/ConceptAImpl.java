package autowire;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Kacper Staszek
 */
class ConceptAImpl implements ConceptA {

  @Autowired
  private ConceptB konceptB;
  @Autowired
  private ConceptC conceptC;

  public void functionA() {
    System.out.println("Hello from A!");
  }
}
