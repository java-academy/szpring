package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjalizuj_i_zniszcz.api.Logger;

/**
 * @author Kacper Staszek
 */
class LoggerXML implements Logger {

  public void loguj(String wiadomość) {
    System.out.println("Logger skonfikurowany w XML loguje: "+wiadomość);
  }

  void init(){
    System.out.println("metoda init logger XML");
  }

  void destroy(){
    System.out.println("metoda destroy logger XML");
  }
}
