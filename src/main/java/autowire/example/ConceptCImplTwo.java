package autowire.example;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class ConceptCImplTwo implements ConceptC {

  public void functionC() {
    System.out.println("Hello from C two!");
  }
}
