package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.leniwa_inicjalizacja;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 */
@Component
class ZiarnoA {

  ZiarnoB ziarnoB;


  public ZiarnoA(@Lazy ZiarnoB ziarnoB) {
    System.out.println("Tworzę ziarno A");
    this.ziarnoB = ziarnoB;
  }


  public void hello(){
    System.out.println("Witam jestem A");
  }
}
