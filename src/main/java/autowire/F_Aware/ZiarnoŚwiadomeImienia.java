package autowire.F_Aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * Ziarno świadome swojego imienia w fabryce ziaren ({@link org.springframework.beans.factory.BeanFactory})
 * w której się znajduje poprzez implementację interfejsu {@link org.springframework.beans.factory.BeanNameAware}.
 *
 * @author Marcin Ogorzalek
 */
@Component
public class ZiarnoŚwiadomeImienia implements BeanNameAware {
  String nazwaZiarna;

  @Override
  public void setBeanName(String nazwaZiarna) {
    this.nazwaZiarna = nazwaZiarna;
  }
}
