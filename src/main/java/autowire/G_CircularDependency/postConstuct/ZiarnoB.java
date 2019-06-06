package autowire.G_CircularDependency.postConstuct;

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
