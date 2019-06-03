package autowire.init_and_destroy;

import autowire.init_and_destroy.api.Logger;

/**
 * @author Kacper Staszek
 */

class LicznikLogger implements Logger {
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
