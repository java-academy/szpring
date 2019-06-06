package autowire.F_Aware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Marcin Ogorzalek
 */
@Component
class ŚwiadomeZiarnoAdnotacja {

  @Autowired
  ApplicationContext applicationContextAdnotacja;

  void użycieZiarna() {
    System.out.println("Metoda z ŚwiadomeZiarnoAdnotacja");
    applicationContextAdnotacja.getBean(Ziarno.class).metodaZiarenka();
  }
}
