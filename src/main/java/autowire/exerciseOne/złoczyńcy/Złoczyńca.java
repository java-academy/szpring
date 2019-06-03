package autowire.exerciseOne.złoczyńcy;

/**
 * @author Jakub Czajka
 */

public class Złoczyńca {

  String imię;
  String nazwisko;
  String pseudonium;

  public Złoczyńca(String imię, String nazwisko, String pseudonium) {
    this.imię = imię;
    this.nazwisko = nazwisko;
    this.pseudonium = pseudonium;
  }

  @Override
  public String toString() {
    return pseudonium + " czyli " + imię + " " + nazwisko;
  }
}
