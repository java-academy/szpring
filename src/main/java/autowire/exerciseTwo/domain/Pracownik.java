package autowire.exerciseTwo.domain;

/**
 * @author Marcin Ogorzalek
 */
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
