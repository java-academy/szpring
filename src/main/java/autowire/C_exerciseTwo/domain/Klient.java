package autowire.C_exerciseTwo.domain;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Marcin Ogorzalek
 */
public class Klient {

  @Value("Marcin")
  private String imię;

  @Value("Ogorzałek")
  private String nazwisko;

  @Override
  public String toString() {
    return String.format("%s %s", imię, nazwisko);
  }
}
