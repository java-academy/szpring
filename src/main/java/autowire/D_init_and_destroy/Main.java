package autowire.D_init_and_destroy;

import autowire.D_init_and_destroy.api.Logger;
import autowire.D_init_and_destroy.api.RepozytoriumUżytkowników;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kacper Staszek
 *
 * TODO:
 *  1. Stwórz konfigurację do podanego szkieletu klas. Połącz wszytkie trzy typy konfiguracji.
 *  (repozytorium przez annotacje, dwa loggery z konfiguracji java, jeden z XML)
 *  2. Na 3 różne sposoby zaimplementuj metody init i destroy.
 *  - https://www.mkyong.com/spring/spring-init-method-and-destroy-method-example/
 *  - https://www.mkyong.com/spring/spring-postconstruct-and-predestroy-example/
 *  - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html
 *  - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/DisposableBean.html
 *  Na potrzeby konfiguracji w XML stwórz plik konfiguracyjny, który osiągnie cel. (nazwij go konfiguracja.xml).
 */
@ComponentScan(basePackages = "autowire.D_init_and_destroy")
class Main {

  public static void main(String[] args) {
    AbstractApplicationContext contextXML =
        new ClassPathXmlApplicationContext("konfiguracja.xml");
    contextXML.registerShutdownHook();

    Logger loggerXML = contextXML.getBean("logger", Logger.class);

    AbstractApplicationContext contextJava =
        new AnnotationConfigApplicationContext(AppConfiguration.class, Main.class);
    contextJava.registerShutdownHook();

    RepozytoriumUżytkowników repozytorium = contextJava.getBean(RepozytoriumUżytkowników.class);

    Logger nazwanyLogger = contextJava.getBean("getNazwanyLogger", Logger.class);

    Logger licznikLogger = contextJava.getBean("getLicznikLogger", Logger.class);

    repozytorium.setLogger(loggerXML);

    repozytorium.zapisz(new Użytkownik("Kacper"));

    repozytorium.setLogger(nazwanyLogger);

    repozytorium.zapisz(new Użytkownik("Znowu Kacper"));

    repozytorium.setLogger(licznikLogger);

    repozytorium.zapisz(new Użytkownik("Bez niespodzianek - Kacper"));

  }
}
