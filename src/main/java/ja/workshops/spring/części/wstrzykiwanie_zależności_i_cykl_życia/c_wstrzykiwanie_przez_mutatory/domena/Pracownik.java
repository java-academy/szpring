package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena;

/**
 * Prosty model pracownika salonu
 *
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
