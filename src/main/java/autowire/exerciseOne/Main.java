package autowire.exerciseOne;

import autowire.exerciseOne.szpiedzy.AustinPowers;
import autowire.exerciseOne.szpiedzy.JamesBond;
import autowire.exerciseOne.szpiedzy.Szpieg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Jakub Czajka <<<<<<< HEAD ======= Zapoznaj sie z adnotacjami:
 * @ Component @ComponentScan @Value @Qualifier  @Autowierd i ich metodami, następnie wstaw
 * adnotację w wybrane klasy tak aby kod zaczął działać Możesz używać tylko i wyłącznie adnotacji,
 * nie możesz zmieniać kodu, w dokumentacji znajdują się brakujace wartości >>>>>>>
 * exerciseOneRozwiazanie
 */

class Main {

  public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
    Szpieg szpieg1 = applicationContext.getBean(JamesBond.class);
    Szpieg szpieg2 = applicationContext.getBean(AustinPowers.class);
    szpieg1.przedstawSię();
    szpieg1.mójWróg();
    szpieg1.zamówDrinka();

    szpieg2.przedstawSię();
    szpieg2.mójWróg();
    szpieg2.zamówDrinka();

  }

}
