package autowire.G_CircularDependency.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Instrukcje w package-info.
 *
 * @author Jakub Czajka
 *
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
