package autowire.exerciseOne.drinki;

/**
 * @author Jakub Czajka
 */
public class Drink {

  String nazwa;
  String przepis;

  public Drink(String nazwa, String przepis) {
    this.nazwa = nazwa;
    this.przepis = przepis;
  }

  public String przepis() {
    return przepis;
  }

  public String getNazwa() {
    return nazwa;
  }
}
