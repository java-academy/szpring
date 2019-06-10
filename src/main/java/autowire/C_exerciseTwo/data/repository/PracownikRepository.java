package autowire.C_exerciseTwo.data.repository;

import static autowire.C_exerciseTwo.common.Color.GREEN;
import static autowire.C_exerciseTwo.common.Color.RESET;

import autowire.C_exerciseTwo.domain.Pracownik;

/**
 * @author Marcin Ogorzalek
 */
public class PracownikRepository {

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
