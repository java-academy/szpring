package autowire.exerciseOne.złoczyńcy;

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
