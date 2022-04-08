package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu;

import org.springframework.stereotype.Component;

/**
 * Proste ziarno z jedną metodą.
 *
 * @author Marcin Ogorzalek
 */
@Component
class Ziarno {

  void metodaZiarenka() {
    System.out.println("Ziarno");
  }
}
