package autowire.B_exerciseOne.szpiedzy;

import autowire.B_exerciseOne.drinki.Drink;
import autowire.B_exerciseOne.złoczyńcy.Złoczyńca;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 * imie = Austin
 * nazwisko = Powers
 * złoczyńca = DrEvil
 * drink = CubaLibre
 */
@Component
public class AustinPowers extends Szpieg {

  public AustinPowers(@Qualifier("Zło") Złoczyńca złoczyńca,
      @Qualifier("CubaLibre") Drink drink,
      @Value("Austin") String imię,
      @Value("Powers") String nazwisko) {
    super(złoczyńca, drink, imię, nazwisko);
  }
}
