package autowire.exerciseTwo.data.repository;

import static autowire.exerciseTwo.common.Color.GREEN;
import static autowire.exerciseTwo.common.Color.RESET;

import autowire.exerciseTwo.domain.Samochód;
import java.time.LocalDate;
import org.springframework.stereotype.Repository;

/**
 * @author Marcin Ogorzalek
 */
@Repository
public class SamochódRepository {

  public void zapis(Samochód smaochód, LocalDate dataWypożyczenia) {
    System.out.println(GREEN+"Zapisuję datę wypożyczenia"+RESET);
  }

}
