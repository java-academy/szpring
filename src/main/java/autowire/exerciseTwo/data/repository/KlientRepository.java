package autowire.exerciseTwo.data.repository;

import static autowire.exerciseTwo.common.Color.GREEN;
import static autowire.exerciseTwo.common.Color.RESET;

import autowire.exerciseTwo.domain.Klient;
import autowire.exerciseTwo.domain.Samochód;
import org.springframework.stereotype.Repository;

/**
 * @author Marcin Ogorzalek
 */
@Repository
public class KlientRepository {

  public void zapis(Klient klient) {
    System.out.println(GREEN+"Zapisuję obciążenie klienta"+RESET);
  }
}
