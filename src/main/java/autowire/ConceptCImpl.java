package autowire;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Kacper Staszek
 */
class ConceptCImpl implements ConceptC {

  private ConceptA conceptA;

  @Autowired
  public ConceptCImpl(ConceptA conceptA) {
    this.conceptA = conceptA;
  }

  public void functionC() {
    System.out.println("Hello from C first!");
  }
}
