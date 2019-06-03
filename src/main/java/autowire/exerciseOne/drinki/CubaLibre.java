package autowire.exerciseOne.drinki;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 * nazwa = Cuba Libre
 * przepis = "rum z lodem i colą
 */
@Component(value = "CubaLibre")
class CubaLibre extends Drink {

  public CubaLibre(@Value(" Cuba Libre") String nazwa,
      @Value("rum z lodem i colą") String przepis) {
    super(nazwa, przepis);
  }
}
