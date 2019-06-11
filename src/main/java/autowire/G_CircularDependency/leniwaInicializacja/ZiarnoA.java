package autowire.G_CircularDependency.leniwaInicializacja;

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
