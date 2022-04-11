package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.api.Logger;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.api.RepozytoriumUżytkowników;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Do skonfigurowania adnotacjami.
 *
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
