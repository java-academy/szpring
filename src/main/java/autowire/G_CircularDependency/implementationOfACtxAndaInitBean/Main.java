package autowire.G_CircularDependency.implementationOfACtxAndaInitBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Ostatnią aletrnatywą jest zaimplementowanie intrfejsów
 * ApplicationContextAware: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContextAware.html
 * InitializingBean: https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html
 * Pierwszy daje nam dostęp do kontextu aplikacji
 * Drugi pozwala nam nadpisać metodę afterPropertiesSet() która pozwala z kontakstu utworzyc ziarno
 *
 * * @author Jakub Czajka
 */
@ComponentScan(basePackages = {"autowire.G_CircularDependency.implementationOfACtxAndaInitBean"})
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
