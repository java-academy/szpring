package autowire.exerciseOne;

import autowire.exerciseOne.szpiedzy.AustinPowers;
import autowire.exerciseOne.szpiedzy.JamesBond;
import autowire.exerciseOne.szpiedzy.Szpieg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jakub Czajka
 */
@ComponentScan(basePackages = {"autowire.exerciseOne"})
class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
    Szpieg szpieg1= applicationContext.getBean(JamesBond.class);
    Szpieg szpieg2 = applicationContext.getBean(AustinPowers.class);
   szpieg1.przedstawSię();
   szpieg1.mójWróg();
   szpieg1.zamówDrinka();

   szpieg2.przedstawSię();
   szpieg2.mójWróg();
   szpieg2.zamówDrinka();

  }

}
