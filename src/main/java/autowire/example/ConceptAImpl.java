package autowire.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class ConceptAImpl implements ConceptA {

  @Autowired
  @Qualifier("conceptCImpl")
  private ConceptC conceptC;

  public void functionA() {
    System.out.println("Hello from A!");
  }
}
