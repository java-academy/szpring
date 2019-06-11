package autowire.B_exerciseOne.drinki;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * nazwa = Martini
 * przepis = wstrzasniete nie mieszane
 *
 * @author Jakub Czajka
 */
@Component("Martini")
class Martini extends Drink {

  public Martini(@Value("Martini") String nazwa,
      @Value("wstrząśnięte nie zmieszane") String przepis) {
    super(nazwa, przepis);

  }

}
