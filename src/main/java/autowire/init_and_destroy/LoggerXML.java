package autowire.init_and_destroy.implementations;

import autowire.init_and_destroy.api.Logger;

/**
 * @author Kacper Staszek
 */
public class LoggerXML implements Logger {

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
