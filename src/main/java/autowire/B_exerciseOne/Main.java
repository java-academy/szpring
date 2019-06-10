package autowire.B_exerciseOne;

import autowire.B_exerciseOne.szpiedzy.AustinPowers;
import autowire.B_exerciseOne.szpiedzy.JamesBond;
import autowire.B_exerciseOne.szpiedzy.Szpieg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jakub Czajka
 *
 * TODO Zapoznaj sie z adnotacjami:
 *  @Component @ComponentScan @Value @Qualifier  @Autowired i ich metodami, następnie wstaw adnotację w wybrane klasy tak aby kod zaczął działać
 *  Możesz używać tylko i wyłącznie adnotacji, nie możesz zmieniać kodu, w dokumentacji znajdują się brakujace wartości
 */
@ComponentScan(basePackages = {"autowire.B_exerciseOne"})
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
