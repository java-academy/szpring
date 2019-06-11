package autowire.B_exerciseOne.szpiedzy;

import autowire.B_exerciseOne.drinki.Drink;
import autowire.B_exerciseOne.złoczyńcy.Złoczyńca;
import org.springframework.stereotype.Component;

/**
 * imie = James
 * nazwisko = Bond
 * złoczyńca = DrNo
 * drink = Martini
 *
 * @author Jakub Czajka
 */
@Component
public class JamesBond extends Szpieg {


  public JamesBond(Złoczyńca złoczyńca, Drink drink) {
    super(złoczyńca, drink, "James", "Bond");
  }
}
