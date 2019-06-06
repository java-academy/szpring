package autowire.C_exerciseTwo.data.repository;

import static autowire.C_exerciseTwo.common.Color.GREEN;
import static autowire.C_exerciseTwo.common.Color.RESET;

import autowire.C_exerciseTwo.domain.Klient;
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
