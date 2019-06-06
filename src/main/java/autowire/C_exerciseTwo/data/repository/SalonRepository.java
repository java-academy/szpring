package autowire.C_exerciseTwo.data.repository;

import static autowire.C_exerciseTwo.common.Color.GREEN;
import static autowire.C_exerciseTwo.common.Color.RESET;

import autowire.C_exerciseTwo.domain.Salon;
import autowire.C_exerciseTwo.domain.Samochód;
import org.springframework.stereotype.Repository;

/**
 * @author Marcin Ogorzalek
 */
@Repository
public class SalonRepository {

  public void zapisz(Salon salon, Samochód samochód) {
    System.out.println(GREEN+"Zapisuję wypożyczenie samochodu z salonu"+RESET);
  }
}
