package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class DrugiSuperTypImpl implements DrugiSuperTyp {

  private String myString = "Tego nie powinieneś w ogóle na oczy zobaczyć poza kodem. Jak wydruk to zawiera, to coś jest nie halo! No chyba, że zgodnie z instrukcją zakomentowałeś linię. To teraz ją odkomentuj i zostaw.";

  public void doStuff() {
    System.out.println(myString);
  }

  @Override
  public void afterPropertiesSet() {
    //FIXME: Zakomentuj, sprawdź działanie, następnie ODKOMENTUJ I ZOSTAW!
    myString = "Po ustawieniu własności ziaren";
  }
}
