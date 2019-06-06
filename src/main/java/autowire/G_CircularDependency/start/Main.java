package autowire.G_CircularDependency.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Okrężna Zależność występuje w moencie kiedy dwa albo więcej ziaren jest od siebie zależne i są inicializowane za pomocą konstruktora.
 * Spring to mądra bestia i potrafi sam wywnisokować w jakiej kolejności powinien tworzyć poszczególne ziarna ale w takim przypadku gubi się i wyrzuci
 * BeanCurrentlyInCreationException, gdyż Spring nie jest w stanie wstrzykąć Ziaren które nie zostały do końca zainicializowane.
 * Jest jednak kilka sposobów jak się ten problem rozwiązuje. Każdy podpakiet wyjaśni ci krok po kroku co należy zrobić
 *
 * @author Jakub Czajka
 */
@ComponentScan(basePackages = {"autowire.G_CircularDependency.start"})
class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    ZiarnoA ziarnoA = context.getBean(ZiarnoA.class);
    ZiarnoB ziarnoB = context.getBean(ZiarnoB.class);
    ziarnoA.hello();
    ziarnoB.hello();

  }
}
