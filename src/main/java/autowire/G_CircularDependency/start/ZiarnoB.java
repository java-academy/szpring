package autowire.G_CircularDependency.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 */
@Component
class ZiarnoB {

ZiarnoA ziarnoA;

@Autowired
  public ZiarnoB(ZiarnoA ziarnoA) {
    System.out.println("Tworzę ziarno B");
    this.ziarnoA = ziarnoA;
  }

  public void hello(){
    System.out.println("Witam jestem B");
  }
}
