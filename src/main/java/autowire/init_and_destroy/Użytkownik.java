package autowire.init_and_destroy;

/**
 * @author Kacper Staszek
 */
class Użytkownik {
  private final String name;

  Użytkownik(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
