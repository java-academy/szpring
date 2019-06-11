package autowire.B_exerciseOne.drinki;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * nazwa = Cuba Libre
 * przepis = "rum z lodem i colą
 *
 * @author Jakub Czajka
 */
@Component(value = "CubaLibre")
class CubaLibre extends Drink {

  public CubaLibre(@Value(" Cuba Libre") String nazwa,
      @Value("rum z lodem i colą") String przepis) {
    super(nazwa, przepis);
  }
}
