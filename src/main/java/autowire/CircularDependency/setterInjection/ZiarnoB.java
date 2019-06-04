package autowire.CircularDependency.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 * Usuń z konstuktora adnotacje @Autowired i usuń z niego przypisanie do zmiennej zachowując wiadoość, stwórz setter i zdodaj do niego addnotację @Autowired
 */
@Component
class ZiarnoB {
ZiarnoA ziarnoA;

  public ZiarnoB() {
    System.out.println("Tworzę ziarno B");
  }

  @Autowired
  public void setZiarnoA(ZiarnoA ziarnoA) {
    this.ziarnoA = ziarnoA;
  }

  public ZiarnoA getZiarnoA() {
    return ziarnoA;
  }

  public void hello(){
    System.out.println("Witam jestem B");
  }
}
