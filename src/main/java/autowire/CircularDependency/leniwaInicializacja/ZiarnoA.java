package autowire.CircularDependency.leniwaInicializacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author Jakub Czajka
 * W konstruktorze dopisz adnotacje @Lazy
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
