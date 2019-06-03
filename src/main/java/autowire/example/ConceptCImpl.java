package autowire.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class ConceptCImpl implements ConceptC {

  private ConceptA conceptA;

  @Autowired
  ConceptCImpl(ConceptA conceptA) {
    this.conceptA = conceptA;
  }

  public void functionC() {
    System.out.println("Hello from C first!");
    conceptA.functionA();
  }
}
