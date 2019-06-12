package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.złoczyńcy;

import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 */
@Component(value = "Zło")
class DrEvil extends Złoczyńca {


  public DrEvil() {
    super("Douglas", "Powers", "Dr Zło");
  }
}
