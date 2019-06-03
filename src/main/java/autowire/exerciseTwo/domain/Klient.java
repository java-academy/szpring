package autowire.exerciseTwo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Marcin Ogorzalek
 */
@Component
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
