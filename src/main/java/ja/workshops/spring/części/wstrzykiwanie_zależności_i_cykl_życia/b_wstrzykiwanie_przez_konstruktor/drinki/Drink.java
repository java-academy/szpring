package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.b_wstrzykiwanie_przez_konstruktor.drinki;

/**
 * @author Jakub Czajka
 */
public class Drink {

  private String nazwa;
  private String przepis;

  Drink(String nazwa, String przepis) {
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
