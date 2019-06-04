package adnotacje.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Klasa rozruchowa aplikacji. Tworzony jest kontekst aplikacji springowej. {@link ApplicationContext}
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("AutowireBeans.xml");

        Klawiatura klawiatura = (Klawiatura) context.getBean("klawiatura");

        klawiatura.kliknięcie();
        klawiatura.mignięcie();
        klawiatura.rozłożenieNóżek();
    }
}
