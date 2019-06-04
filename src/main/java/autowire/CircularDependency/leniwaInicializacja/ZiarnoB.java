package autowire.CircularDependency.leniwaInicializacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 */
@Component
class ZiarnoB {
ZiarnoA ziarnoA;

@Autowired
  public ZiarnoB(@Lazy ZiarnoA ziarnoA) {
    System.out.println("Tworzę ziarno B");
    this.ziarnoA = ziarnoA;
  }

  public void hello(){
    System.out.println("Witam jestem B");
  }
}
