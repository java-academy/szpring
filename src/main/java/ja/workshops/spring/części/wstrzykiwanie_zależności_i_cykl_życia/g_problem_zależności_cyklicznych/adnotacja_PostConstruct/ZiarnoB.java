package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.adnotacja_PostConstruct;

import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 */
@Component
class ZiarnoB {
ZiarnoA ziarnoA;


  public ZiarnoB() {
    System.out.println("Tworzę ziarno B");
  }

  public void setZiarnoA(ZiarnoA ziarnoA) {
    this.ziarnoA = ziarnoA;
  }

  public void hello(){
    System.out.println("Witam jestem B");
  }
}
