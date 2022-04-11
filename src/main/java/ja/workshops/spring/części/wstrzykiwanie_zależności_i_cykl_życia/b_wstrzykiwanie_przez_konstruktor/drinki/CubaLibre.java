package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.drinki;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * nazwa = Cuba Libre
 * przepis = rum z lodem i colą
 *
 * @author Jakub Czajka
 */
@Component("CubaLibre")
class CubaLibre extends Drink {

  public CubaLibre(@Value("Cuba Libre")String nazwa, @Value("rum z lodem i colą")String przepis) {
    super(nazwa, przepis);
  }
}
