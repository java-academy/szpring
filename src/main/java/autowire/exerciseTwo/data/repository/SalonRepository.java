package autowire.exerciseTwo.data.repository;

import static autowire.exerciseTwo.common.Color.GREEN;
import static autowire.exerciseTwo.common.Color.RESET;

import autowire.exerciseTwo.domain.Salon;
import autowire.exerciseTwo.domain.Samochód;
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
