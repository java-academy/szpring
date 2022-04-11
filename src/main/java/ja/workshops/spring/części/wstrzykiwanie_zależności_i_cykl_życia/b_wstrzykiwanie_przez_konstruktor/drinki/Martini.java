package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.drinki;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * nazwa = Martini
 * przepis = wstrząśnięte, nie zmieszane
 *
 * @author Jakub Czajka
 */
@Component("Martini")
class Martini extends Drink {

  public Martini(@Value("Martini")String nazwa, @Value("wstrząśnięte, nie zmieszane")String przepis) {
    super(nazwa, przepis);
  }
}
