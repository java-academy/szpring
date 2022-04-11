package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Prosty model salonu wypożyczającego samochody
 *
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
    return String.format("%s, %s", adres, miasto);
  }
}
