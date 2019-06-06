package autowire.B_exerciseOne.złoczyńcy;

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
