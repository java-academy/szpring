package autowire.init_and_destroy;

import autowire.init_and_destroy.api.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Kacper Staszek
 */

public class LicznikLogger implements Logger {
  private int counter = 0;

  public void loguj(String wiadomość) {
    System.out.println("Log Id wiadomości: "+counter+" treść: "+wiadomość);
  }

  void postConstruct(){
    System.out.println("@PostConstruct licznik logger");
  }

  void preDestroy(){
    System.out.println("@PreDestroy licznik logger");
  }
}
