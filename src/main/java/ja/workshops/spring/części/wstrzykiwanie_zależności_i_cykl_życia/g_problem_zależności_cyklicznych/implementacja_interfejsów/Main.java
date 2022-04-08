package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.implementacja_interfejsów;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Instrukcje w package-info. Wyświetl JavaDoc pakietu (w IntelliJu Ctrl+q).
 *
 * @author Jakub Czajka
 */
@Configuration
@ComponentScan(basePackages = {"ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.implementacja_interfejsów"})
class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        ZiarnoA ziarnoA = context.getBean(ZiarnoA.class);
        ZiarnoB ziarnoB = context.getBean(ZiarnoB.class);
        ziarnoA.siemano();
        ziarnoB.siemano();
    }
}
