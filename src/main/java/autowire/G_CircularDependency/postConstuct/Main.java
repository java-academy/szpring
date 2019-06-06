package autowire.G_CircularDependency.postConstuct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Kolejną aletrnarnatywą jest wykozystanie addnotacji @PostConstruct, którą można zaadnotować jedną metodę która wykona się po konstrukcji obiektu
 * Przeczytaj  i odpowiedz jaka musi byc taka metoda :
 * https://docs.oracle.com/javaee/7/api/javax/annotation/PostConstruct.html
 *
 * @author Jakub Czajka
 */
@ComponentScan(basePackages = {"autowire.G_CircularDependency.postConstuct"})
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
