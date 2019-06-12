package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Marcin Ogorzalek
 */
@Component
public class Klient {

  @Value("Marcin")
  private String imię;

  @Value("Ogorzałek")
  private String nazwisko;

  @Override
  public String toString() {
    return imię + " " + nazwisko;
  }
}
