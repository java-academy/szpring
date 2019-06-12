package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.wspólny;

/**
 * @author Marcin Ogorzalek
 */
public enum Kolor {
  RESETUJ("\033[0m"),
  ZIELONY("\033[1;32m"),
  NIEBIESKI("\033[0;34m");

  private final String kod;

  Kolor(String kod) {
    this.kod = kod;
  }

  @Override
  public String toString() {
    return kod;
  }
}
