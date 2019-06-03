package autowire.init_and_destroy;

/**
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
