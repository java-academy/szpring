package autowire.exerciseTwo.data.repository;

import static autowire.exerciseTwo.common.Color.GREEN;
import static autowire.exerciseTwo.common.Color.RESET;

import autowire.exerciseTwo.domain.Pracownik;

/**
 * @author Marcin Ogorzalek
 */
public class PraconikRepository {

  public void zapisz(Pracownik pracownik) {
    System.out.println(
        new StringBuilder()
            .append(GREEN)
            .append("Zapisuję informacje o premii dla pracownika")
            .append(RESET)
            .toString()
    );
  }
}
