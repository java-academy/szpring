package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Pomimo tego, że klasa ta ma zadeklarowaną metodę o sygnaturze identycznej jak w {@link ŚwiadomeZiarnoIntaface},
 * jest ona nieświadoma Springowego kontekstu aplikacji. Dlatego też jego użycie powoduje NPE.
 *
 * @author Marcin Ogorzalek
 */
@Component
class NieświadomeZiarno {

  ApplicationContext kontekstAplikacji;

  public void setKontekstAplikacji(ApplicationContext kontekstAplikacji) throws BeansException {
    this.kontekstAplikacji = kontekstAplikacji;
    System.out.println("ŚwiadomeZiarnoIntaface setter");
  }
}
