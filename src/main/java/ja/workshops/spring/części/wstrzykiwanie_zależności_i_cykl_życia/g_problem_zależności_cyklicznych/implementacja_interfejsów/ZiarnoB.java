package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.implementacja_interfejsów;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Miłe i sympatyczne ziarno, potrafi się przywitać.
 *
 * @implSpec NIC NIE ZMIENIAJ (może poza punktem gwiazdką)
 * @author Jakub Czajka
 * @author Tomasz Borek
 */
@Component
class ZiarnoB {
    ZiarnoA ziarnoA;
    /**
     *   Identyfikuje ziarno, jeśli potrzebujemy.
     *   Można rozważyć dostęp pakietowy, by móc wywołać BEZ pośrednictwa toString.
     */
    private static final int ID=2;

    @Autowired
    public ZiarnoB(ZiarnoA ziarnoA) {
        System.out.println("Tworzę ziarno B");
        this.ziarnoA = ziarnoA;
    }

    public void siemano() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ZiarnoB(id:" +ID + "){ziarnoA=" + ziarnoA + '}'; // tu już mógłby być String.format
    }

}