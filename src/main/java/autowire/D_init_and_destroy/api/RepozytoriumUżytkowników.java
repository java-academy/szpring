package autowire.D_init_and_destroy.api;

import autowire.D_init_and_destroy.Użytkownik;

/**
 * Imitacja repozytorium, które potrafi zapisywać użytkowników
 * zmieniać logger.
 *
 * @author Kacper Staszek
 */
public interface RepozytoriumUżytkowników {
  void zapisz(Użytkownik użytkownik);
  void setLogger(Logger logger);

}
