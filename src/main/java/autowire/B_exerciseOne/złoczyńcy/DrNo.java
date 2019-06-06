package autowire.B_exerciseOne.złoczyńcy;

import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 */
@Component(value = "No")
class DrNo extends Złoczyńca {

  public DrNo() {
    super("Julius", "No", "DrNo");
  }
}
