package autowire.F_Aware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Ziarno świadome kontekstu w którym się znajduje poprzez wstrzyknięcie go do pola klasy poprzez {@code @Autowired}.
 * Przypomnę tylko, że wstrzykiwanie zależności bezpośrednio do pola jest złą praktyką.
 *
 * @author Marcin Ogorzalek
 */
@Component
public class ŚwiadomeZiarnoAdnotacja {

  @Autowired
  ApplicationContext applicationContextAdnotacja;

  void użycieZiarna() {
    System.out.println("Metoda z ŚwiadomeZiarnoAdnotacja");
    applicationContextAdnotacja.getBean(Ziarno.class).metodaZiarenka();
  }
}
