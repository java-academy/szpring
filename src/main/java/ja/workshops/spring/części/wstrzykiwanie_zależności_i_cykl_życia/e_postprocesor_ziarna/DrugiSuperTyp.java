package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna;

import org.springframework.beans.factory.InitializingBean;

/**
 * Na potrzeby ćwiczeń - dummy interfejs
 *
 * @author Kacper Staszek
 */
public interface DrugiSuperTyp extends InitializingBean {
  void doStuff();
}
