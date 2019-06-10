package wrup.spring.a_wstrzykiwanie_zależności;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wrup.spring.c_mvc.Samochód;


/**
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("a/a_konfiguracja.xml");
        Samochód samochód = context.getBean(Samochód.class);

        System.out.println(samochód.getSilnik().start());


    }
}
