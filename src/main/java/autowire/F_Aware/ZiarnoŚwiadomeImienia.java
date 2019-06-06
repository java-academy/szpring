package autowire.F_Aware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
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
