package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena;

import org.springframework.beans.factory.annotation.Value;

/**
 * Prosty model samochodu
 *
 * @author Marcin Ogorzalek
 */
public class Samochód {

  @Value("Czarna Wołga")
  private String marka;

  @Override
  public String toString() {
    return marka;
  }
}
