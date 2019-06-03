package autowire.exerciseOne.szpiedzy;

import autowire.exerciseOne.drinki.Drink;
import autowire.exerciseOne.złoczyńcy.Złoczyńca;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 * złoczyńca = DrNo
 * drink = Martini
 */
@Component
public class JamesBond extends Szpieg {


  public JamesBond(@Qualifier("No") Złoczyńca złoczyńca,
      @Qualifier("Martini") Drink drink) {
    super(złoczyńca, drink, "James", "Bond");
  }
}
