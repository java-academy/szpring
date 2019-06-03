package autowire.example;

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

    ConceptA bean = context.getBean(ConceptA.class);
    bean.functionA();

    ConceptB bean1 = context.getBean(ConceptB.class);
    bean1.functionB();

    ConceptC bean2 = context.getBean("conceptCImplTwo",ConceptC.class);
    bean2.functionC();
  }

}
