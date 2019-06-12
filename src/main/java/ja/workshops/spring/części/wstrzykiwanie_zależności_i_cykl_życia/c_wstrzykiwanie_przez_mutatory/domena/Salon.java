package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Marcin Ogorzalek
 */
public class Salon {

  @Value("Czerwone maki 1")
  private String adres;

  @Value("Kraków")
  private String miasto;

  @Override
  public String toString() {
    return String.format("%s, %s", adres, miasto);
  }
}
