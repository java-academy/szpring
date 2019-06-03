package autowire.exerciseTwo.domain;

import org.springframework.stereotype.Component;

/**
 * @author Marcin Ogorzalek
 */
@Component
public class Pracownik {

  private String imię;
  private String nazwisko;

  public Pracownik() {
    imię = "Jakub";
    nazwisko = "Czajka";
  }

  @Override
  public String toString() {
    return String.format("%s %s", imię, nazwisko);
  }
}
