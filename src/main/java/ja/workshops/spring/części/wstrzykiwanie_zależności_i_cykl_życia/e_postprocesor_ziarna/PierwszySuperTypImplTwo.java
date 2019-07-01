package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class PierwszySuperTypImplTwo implements PierwszySuperTyp {

  private String myString = "Niezmienione";

  public void doStuff() {
    System.out.println(myString);
  }
}
