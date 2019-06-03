package autowire.exerciseTwo.data.repository;

import static autowire.exerciseTwo.common.Color.GREEN;
import static autowire.exerciseTwo.common.Color.RESET;

import autowire.exerciseTwo.domain.Pracownik;
import org.springframework.stereotype.Repository;

/**
 * @author Marcin Ogorzalek
 */
@Repository
public class PraconikRepository {
  public void zapisz(Pracownik pracownik) {
    System.out.println(GREEN+"Zapisuję informacje o premii dla pracownika"+RESET);
  }
}
