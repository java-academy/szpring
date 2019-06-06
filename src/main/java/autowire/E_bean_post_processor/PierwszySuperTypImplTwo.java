package autowire.E_bean_post_processor;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class PierwszySuperTypImplTwo implements PierwszySuperTyp {

  private String myString = "Niezmienione";

  public void doStuff() {
    System.out.println(myString);
  }
}
