package wrup.spring.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wrup.spring.example.entities.Car;


/**
 * @author Wiktor Rup
 */
class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
        Car car = context.getBean(Car.class);

        System.out.println(car.getEngine().start());


    }
}
