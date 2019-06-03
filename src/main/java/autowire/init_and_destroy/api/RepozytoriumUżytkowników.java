package autowire.init_and_destroy;

/**
 * @author Kacper Staszek
 */
interface RepozytoriumUżytkowników {
  void zapisz(Użytkownik użytkownik);
  void setLogger(Logger logger);

}
