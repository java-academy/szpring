package autowire.bean_post_processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Ćwiczenie pokaże Ci jak działa BeanPostProcessor, odświeży kolejność wykonywania operacji
 * przy tworzeniu ziaren, oraz refleksję.
 *
 *  TODO: Uruchom program, zobaczy wydruk na konsoli.
 *
 *  TODO: Zakomentuj wskazaną linię w klasie DrugiSuperTypImpl, po czym uruchom program jeszcze raz.
 *    następnie odkomentuj linię.
 *    Odpowiedz dlaczego jest różnica w działaniu programu.
 *
 *  TODO: Twoim zadaniem jest uzyskać następujący wydruk na konsoli po uruchomieniu programu:
 *    Niezmienione
 *    Niezmienione
 *    Zmienione!
 *
 *  TODO:
 *    Żeby to osiągnąć musisz napisać własny BeanPostProcessor, w którym nadpisz odpowiednią
 *    metodę.
 *    BeanPostProcessory mogą przetwożyć każde tworzone ziarno przed ustawieniem wszystkich właściwości
 *    i po nim.
 *    W nadpisanej metodzie za pomocą refleksji zmień wartość pola myString na "Zmienione!".
 *
 *    - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanPostProcessor.html
 *    - https://www.tutorialspoint.com/spring/spring_bean_post_processors.htm
 *
 * @author Kacper Staszek
 */
@ComponentScan(basePackages = "autowire.bean_post_processor")
class Main {

  public static void main(String[] args) {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(Main.class);

    PierwszySuperTyp pierwszySuperTypImplOne = kontekst
        .getBean("pierwszySuperTypImplOne", PierwszySuperTyp.class);

    PierwszySuperTyp pierwszySuperTypImplTwo = kontekst
        .getBean("pierwszySuperTypImplTwo", PierwszySuperTyp.class);

    DrugiSuperTyp drugiSuperTyp = kontekst.getBean(DrugiSuperTyp.class);

    pierwszySuperTypImplOne.doStuff();
    pierwszySuperTypImplTwo.doStuff();
    drugiSuperTyp.doStuff();
  }
}
