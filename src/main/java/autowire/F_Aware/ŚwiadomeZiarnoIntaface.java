package autowire.F_Aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Ziarno świadome kontekstu w którym się znajdujepoprzez wimplementację interfejsu {@code ApplicationContextAware}.
 *
 * @author Marcin Ogorzalek
 */
@Component
public class ŚwiadomeZiarnoIntaface implements ApplicationContextAware {

  ApplicationContext applicationContextInterface;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContextInterface = applicationContext;
    System.out.println("ŚwiadomeZiarnoIntaface setter");
  }

  void użycieZiarna() {
    System.out.println("Metoda z ŚwiadomeZiarnoIntaface");
    applicationContextInterface.getBean(Ziarno.class).metodaZiarenka();
  }
}
