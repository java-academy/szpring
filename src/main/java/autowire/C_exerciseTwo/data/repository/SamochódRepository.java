package autowire.C_exerciseTwo.data.repository;

import static autowire.C_exerciseTwo.common.Color.GREEN;
import static autowire.C_exerciseTwo.common.Color.RESET;

import autowire.C_exerciseTwo.domain.Samochód;
import java.time.LocalDate;

/**
 * @author Marcin Ogorzalek
 */
public class SamochódRepository {

  public void zapis(Samochód smaochód, LocalDate dataWypożyczenia) {
    System.out.println(
        new StringBuilder()
            .append(GREEN)
            .append("Zapisuję datę wypożyczenia")
            .append(RESET)
            .toString()
    );
  }

}
