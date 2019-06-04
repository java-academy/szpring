package autowire.C_exerciseTwo.data.repository;

import static autowire.C_exerciseTwo.common.Color.GREEN;
import static autowire.C_exerciseTwo.common.Color.RESET;

import autowire.C_exerciseTwo.domain.Klient;

/**
 * @author Marcin Ogorzalek
 */
public class KlientRepository {

  public void zapis(Klient klient) {
    System.out.println(
        new StringBuilder().append(GREEN)
            .append("Zapisuję obciążenie klienta")
            .append(RESET)
            .toString()
    );
  }
}
