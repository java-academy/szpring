package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Kacper Staszek
 */
@ComponentScan
class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
  }

}
