package autowire.G_CircularDependency.leniwaInicializacja;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Leniwa inicializacja
 * Przeczytaj :
 * https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Lazy.html
 * Adnotacja @Lazy powoduje że obiekt zostanie zainicializowana dopiero kiedy się do niej odniesiemy, a wcześnie w jej miejsce zostanie wstawione proxy.
 * Udaj się do klasy Main i podąrzaj za wskazówakami.
 *
 * @author Jakub Czajka
 * Przejdź do @{ZiaronoA.class}, po dokonaniu zmian uruchom klasę start i upewnij sie ze wszystko działa
 */
@Configuration
@ComponentScan(basePackages = {"autowire.G_CircularDependency.leniwaInicializacja"})
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
