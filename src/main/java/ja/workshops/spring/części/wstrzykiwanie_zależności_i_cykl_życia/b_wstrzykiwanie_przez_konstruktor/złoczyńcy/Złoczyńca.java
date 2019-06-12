package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.złoczyńcy;

/**
 * @author Jakub Czajka
 */
 public class Złoczyńca {

  private String imię;
  private String nazwisko;
  private String pseudonium;

   Złoczyńca(String imię, String nazwisko, String pseudonium) {
    this.imię = imię;
    this.nazwisko = nazwisko;
    this.pseudonium = pseudonium;
  }

  @Override
  public String toString() {
    return pseudonium + " czyli " + imię + " " + nazwisko;
  }
}
