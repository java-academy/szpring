package autowire.C_exerciseTwo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Marcin Ogorzalek
 */
@Component
public class Salon {

  @Value("Czerwone Maki 1")
  private String adres;

  @Value("Kraków")
  private String miasto;

  @Override
  public String toString() {
    return adres+", "+miasto;
  }
}
