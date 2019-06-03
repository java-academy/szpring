package autowire.exerciseTwo.data.repository;

import static autowire.exerciseTwo.common.Color.GREEN;
import static autowire.exerciseTwo.common.Color.RESET;

import autowire.exerciseTwo.domain.Klient;
import org.springframework.stereotype.Repository;

/**
 * @author Marcin Ogorzalek
 */
@Repository
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
