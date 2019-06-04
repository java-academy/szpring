package autowire.C_exerciseTwo.data.repository;

import static autowire.C_exerciseTwo.common.Color.GREEN;
import static autowire.C_exerciseTwo.common.Color.RESET;

import autowire.C_exerciseTwo.domain.Salon;
import autowire.C_exerciseTwo.domain.Samochód;

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
