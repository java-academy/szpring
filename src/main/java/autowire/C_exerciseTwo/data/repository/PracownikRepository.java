package autowire.C_exerciseTwo.data.repository;

import static autowire.C_exerciseTwo.common.Color.GREEN;
import static autowire.C_exerciseTwo.common.Color.RESET;

import autowire.C_exerciseTwo.domain.Pracownik;
import org.springframework.stereotype.Repository;

/**
 * @author Marcin Ogorzalek
 */
@Repository
public class PracownikRepository {

  public void zapisz(Pracownik pracownik) {
    System.out.println(GREEN+"Zapisuję informacje o premii dla pracownika"+RESET);
  }
}
