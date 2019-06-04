package autowire.F_Aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * W Springu możliwe jest zadeklarowanie ziarna świadomego kontekstu aplikacji w którym  istnieje
 * https://docs.spring.io/spring/docs/5.1.7.RELEASE/spring-framework-reference/core.html#beans-factory-aware.
 * Dzięki temu możliwe jest programowe odwołanie się do metod z ApplicationContext,
 * np. otrzymanie innych ziaren zadeklarowanych w danym kontekście.
 *
 * Jesteśmy w stanie zeralizować to na dwa sposoby.
 * Możemy zaimplementować interface ApplicationContextAware
 * albo poprzez adnotację @Autowired.
 *
 * ApplicationContextAware jest jedym z podinterfejsów Aware. Inne iterfejsy z niego dziedziczace
 * są wymienione w poniższej dokumentacji:
 * https://docs.spring.io/spring/docs/5.1.7.RELEASE/spring-framework-reference/core.html#aware-list
 *
 * Generalnie niezalecane jest używanie Awarnes i podintefaców ponieważ uzależnia
 * (nie zależnie jak realizowane) to kod os Spring API
 * oraz łąmię zasadę odwrócenia kontroli (Inversion of Control).
 *
 * TODO: zapoznaj się z informacjami tu zawartymi.
 *
 * @author Marcin Ogorzalek
 */
@ComponentScan(basePackages = {"autowire.F_Aware"})
public class ZiarnaŚwiadomeKontekstuApp {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(ZiarnaŚwiadomeKontekstuApp.class);
    context.getBean(ŚwiadomeZiarnoAdnotacja.class).użycieZiarna();
    context.getBean(ŚwiadomeZiarnoIntaface.class).użycieZiarna();
// odkomentowanie poniższego wywołania spowoduje NPM.
//    context.getBean(NieświadomeZiarno.class).applicationContextAdnotacja.getBean(Ziarno.class).metodaZiarenka();
// możliwe jest uzyskanie dowolnego ziarna obecnego w danym kontekście;
    context
        .getBean(ŚwiadomeZiarnoIntaface.class)
        .applicationContextInterface
        .getBean(ŚwiadomeZiarnoAdnotacja.class)
        .użycieZiarna();
  }
}
