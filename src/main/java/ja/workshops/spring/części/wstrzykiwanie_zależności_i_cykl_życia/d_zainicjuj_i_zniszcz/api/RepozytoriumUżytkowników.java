package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.api;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.d_zainicjuj_i_zniszcz.Użytkownik;

/**
 * Imitacja repozytorium, które potrafi zapisywać użytkowników i zmieniać logger.
 *
 * @author Kacper Staszek
 */
public interface RepozytoriumUżytkowników {
  void zapisz(Użytkownik użytkownik);
  void setLogger(Logger logger);

}
