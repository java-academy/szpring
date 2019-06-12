package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.adnotacja_PostConstruct;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 */
@Component
class ZiarnoA {

  @Autowired
  ZiarnoB ziarnoB;

  @PostConstruct
  public void init(){
    System.out.println("Działam po konstrukcji");
    ziarnoB.setZiarnoA(this);
  }

  public ZiarnoA() {
    System.out.println("Tworzę ziarno A");
      }

  public void hello(){
    System.out.println("Witam jestem A");
  }
}
