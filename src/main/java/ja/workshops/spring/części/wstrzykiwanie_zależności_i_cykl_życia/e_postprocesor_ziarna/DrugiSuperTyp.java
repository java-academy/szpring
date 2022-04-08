package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna;

import org.springframework.beans.factory.InitializingBean;

/**
 * Durny interfejs na potrzeby ćwiczeń.
 *
 * @author Kacper Staszek
 */
public interface DrugiSuperTyp extends InitializingBean {
  void doStuff();
}
