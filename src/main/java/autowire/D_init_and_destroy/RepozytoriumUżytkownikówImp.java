package autowire.D_init_and_destroy;

import autowire.D_init_and_destroy.api.Logger;
import autowire.D_init_and_destroy.api.RepozytoriumUżytkowników;

/**
 * @author Kacper Staszek
 */
class RepozytoriumUżytkownikówImp implements RepozytoriumUżytkowników {

  private Logger logger;

  public void zapisz(Użytkownik użytkownik) {
    logger.loguj("Dodaję użytkownika "+użytkownik);
  }

  public void setLogger(Logger logger) {
    this.logger=logger;
  }
}
