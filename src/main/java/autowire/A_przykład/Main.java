package autowire.A_przykład;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Dzień dobry,
 * Zapraszamy na warsztat z podstaw wstrzykiwania zależności w Spring.
 *
 * @author Kacper Staszek
 *
 * TODO: Przeglądnij klasy zawarte w pakiecie A_przykład, jeżeli mają - wykonaj ich sekcję TODO.
 *  1.Zastanów się czy możesz wyciągnąć ziarnoC bez przekazania parametru name do getBean().
 *  - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html
 *  2.Uruchom program, zauważ w jakiej kolejności wywoływane są konstruktory, settery i metody samych ziaren.
 *    przypomnij sobie kolejność działań podejmowanych przez Springa przy tworzeniu ziaren.
 *  - https://stackoverflow.com/questions/29743320/how-exactly-does-the-spring-beanpostprocessor-work
 *  3.Zauważ, że zarówno KonceptDImpl, jak i KonceptAImpl mają adnotację @Lazy. Przeczytaj
 *  co ona oznacza i dlaczego w tym przykładzie działa w różny sposób.
 *  - https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Lazy.html
 *  - https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-lazy-init
 *  4. Za pomocą debuggera, podczas działania programu przyglądnij się utworzonej instancji kontekst. Znajdź pole beanFactory,
 *    następnie w nim pole registeredSingletones. Zauważ zmianę przed wywołaniem kontekst.getBean(KonceptD.class) i po nim.
 *
 */
@ComponentScan(basePackages = "autowire.A_przykład")
class Main {

  public static void main(String[] args) throws InterruptedException {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(Main.class);

    KonceptA ziarnoA = kontekst.getBean(KonceptA.class);
    ziarnoA.funckcjaA();

    KonceptB ziarnoB = kontekst.getBean(KonceptB.class);
    ziarnoB.funkcjaB();

    KonceptC ziarnoC = kontekst.getBean("konceptCImplDwa", KonceptC.class);
    ziarnoC.funkcjaC();

    Thread.sleep(2000);
    KonceptD ziarnoD = kontekst.getBean(KonceptD.class);
    ziarnoD.funkcjaD();
  }

}
