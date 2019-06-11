package autowire.G_CircularDependency.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 *
 */
@Component
class ZiarnoA {

  ZiarnoB ziarnoB;

  public ZiarnoA() {
    System.out.println("Tworzę Ziarono A");
  }

  @Autowired
  public void setZiarnoB(ZiarnoB ziarnoB) {
    this.ziarnoB = ziarnoB;
  }

  public ZiarnoB getZiarnoB() {
    return ziarnoB;
  }

  public void hello(){
    System.out.println("Witam jestem A");
  }
}
