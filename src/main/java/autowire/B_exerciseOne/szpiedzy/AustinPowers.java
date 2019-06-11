package autowire.B_exerciseOne.szpiedzy;

import autowire.B_exerciseOne.drinki.Drink;
import autowire.B_exerciseOne.złoczyńcy.Złoczyńca;
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
