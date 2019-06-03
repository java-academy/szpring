package autowire.exerciseOne.drinki;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 * nazwa = Martini
 * przepis = wstrzasniete nie mieszane
 */

class Martini extends Drink {

  public Martini(@Value("Martini") String nazwa,
      @Value("wstrząsnięte nie mieszane") String przepis) {
    super(nazwa, przepis);

  }

}
