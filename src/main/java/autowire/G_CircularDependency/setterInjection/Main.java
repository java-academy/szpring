package autowire.G_CircularDependency.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Incializacja za pomocą setterów.
 * Spring najpier inicializuje wszystkie ziarna za pomocą konstruktorów a dopiero później wstrzykuje zalezności za pomocą setterów
 * co pozwoli nam unikąć tego problemu
 *
 * @author Jakub Czajka
 */

@ComponentScan(basePackages = {"autowire.G_CircularDependency.setterInjection"})
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
