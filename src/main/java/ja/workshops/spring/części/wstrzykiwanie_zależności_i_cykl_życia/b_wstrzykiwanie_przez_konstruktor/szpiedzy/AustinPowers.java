package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.szpiedzy;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.drinki.Drink;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.złoczyńcy.Złoczyńca;
import org.springframework.stereotype.Component;

/**
 * imie = Austin
 * nazwisko = Powers
 * złoczyńca = DrEvil
 * drink = CubaLibre
 *
 * @author Jakub Czajka
 */
@Component
public class AustinPowers extends Szpieg {

  public AustinPowers(Złoczyńca złoczyńca, Drink drink, String imię, String nazwisko) {
    super(złoczyńca, drink, imię, nazwisko);
  }
}
