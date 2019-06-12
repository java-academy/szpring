package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz.api.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Kacper Staszek
 */
class NazwanyLogger implements Logger, InitializingBean, DisposableBean {
  private final String nazwa;

  NazwanyLogger(String nazwa) {
    this.nazwa = nazwa;
  }

  public void loguj(String wiadomość) {
    System.out.println("Log "+nazwa+" treść: "+wiadomość);
  }


  public void afterPropertiesSet() {
    System.out.println("InitializingBean z nazwany logger.");
  }

  public void destroy() {
    System.out.println("DisposableBean z nazwany logger. ");
  }
}
