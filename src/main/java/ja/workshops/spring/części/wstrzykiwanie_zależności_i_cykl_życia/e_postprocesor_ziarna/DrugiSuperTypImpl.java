package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class DrugiSuperTypImpl implements DrugiSuperTyp {

  private String myString = "Niezmienione";

  public void doStuff() {
    System.out.println(myString);
  }

  @Override
  public void afterPropertiesSet() {
    //FIXME: Zakomentuj, sprawdź działanie, następnie ODKOMENTUJ!
    myString = "Po propertiesSet";
  }
}
