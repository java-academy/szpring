package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz;

/**
 * Element modelu, wykorzystywany w zadaniu, ale nic poza tym.
 *
 * @author Kacper Staszek
 */
public class Użytkownik {
  private final String name;

  Użytkownik(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
