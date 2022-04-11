package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.api.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Do skonfigurowania programistycznie: kodem jawowym (podpowiedź: adnotacje się liczą).
 *
 * @author Kacper Staszek
 */
class LicznikLogger implements Logger {
  private int counter = 0;

  public void loguj(String wiadomość) {
    System.out.println("Log Id wiadomości: "+counter+" treść: "+wiadomość);
  }

  @PostConstruct
  void postConstruct(){
    System.out.println("@PostConstruct licznik logger");
  }

  @PreDestroy
  void preDestroy(){
    System.out.println("@PreDestroy licznik logger");
  }
}
