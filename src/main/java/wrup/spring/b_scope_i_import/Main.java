package wrup.spring.b_scope_i_import;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("b/b_samochod_konfiguracja.xml");

        for (int i = 0; i < 10; i++) {
            Samochód samochód = context.getBean(Samochód.class);
            System.out.println(samochód.getSilnik().start());
        }
    }
}
