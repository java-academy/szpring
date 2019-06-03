package autowire.init_and_destroy.implementations;

import autowire.init_and_destroy.api.Logger;
import autowire.init_and_destroy.api.RepozytoriumUżytkowników;
import autowire.init_and_destroy.model.Użytkownik;
import org.springframework.stereotype.Repository;

/**
 * @author Kacper Staszek
 */
@Repository
class RepozytoriumUżytkownikówImp implements RepozytoriumUżytkowników {

  private Logger logger;

  public void zapisz(Użytkownik użytkownik) {
    logger.loguj("Dodaję użytkownika "+użytkownik);
  }

  public void setLogger(Logger logger) {
    this.logger=logger;
  }
}
