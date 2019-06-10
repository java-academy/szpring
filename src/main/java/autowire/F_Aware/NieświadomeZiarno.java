package autowire.F_Aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Po mimo tego, że klasa ta ma zadeklarowaną metodę o sygnaturze identycznej jak w {@link ŚwiadomeZiarnoIntaface}
 * nie jest one świadome ApplicationContext. Dlatego też jego użycie powoduje NPM.
 *
 * @author Marcin Ogorzalek
 */
@Component
public class NieświadomeZiarno {

  ApplicationContext applicationContext;

  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
    System.out.println("ŚwiadomeZiarnoIntaface setter");
  }
}
