package autowire.CircularDependency.leniwaInicializacja;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jakub Czajka
 * Przejdź do @{ZiaronoA.class}, po dokonaniu zmian uruchom klasę main i upewnij sie ze wszystko działa
 */
@Configuration
@ComponentScan(basePackages = {"autowire.CircularDependency.leniwaInicializacja"})
class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
        Main.class);
    ZiarnoA ziarnoA = context.getBean(
        ZiarnoA.class);
    ZiarnoB ziarnoB = context.getBean(
        ZiarnoB.class);
    ziarnoA.hello();
    ziarnoB.hello();

  }
}
