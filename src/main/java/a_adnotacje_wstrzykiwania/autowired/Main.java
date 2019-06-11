package a_adnotacje_wstrzykiwania.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Tworzenie kontekstu aplikacji springowej. {@link ApplicationContext}
 *
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("AutowiredBeans.xml");

        Komputer komputer = (Komputer) context.getBean("komputer");
        komputer.mojeKomponenty();

    }
}
