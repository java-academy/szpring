package autowire.exerciseTwo.data.repository;

import static autowire.exerciseTwo.common.Color.GREEN;
import static autowire.exerciseTwo.common.Color.RESET;

import autowire.exerciseTwo.domain.Salon;
import autowire.exerciseTwo.domain.Samochód;

/**
 * @author Marcin Ogorzalek
 */
public class SalonRepository {

  public void zapisz(Salon salon, Samochód samochód) {
    System.out.println(
        new StringBuilder()
            .append(GREEN)
            .append("Zapisuję wypożyczenie samochodu z salonu")
            .append(RESET)
            .toString()
    );
  }
}
