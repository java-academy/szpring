package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.ekstra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * B polega na A.
 *
 * <li>W jakiej kolejności działa tu Spring?</li>
 * <li>Co zmieni {@code @DependsOn}?</li>
 * <li>Odkomentuj linię oznaczoną poniżej jak będziesz gotowy - czas się sprawdzić!</li>
 *
 * @see DependsOn
 * @author sytolk z SO
 */
@Component("ziarnkoB")
//FIXME: odkomentuj
//@DependsOn("a")
class ZiarnoB {

    @Autowired
    private ZiarnoA a;

    void f() {
        System.out.println(this);
    }

    @PostConstruct
    void post() {
        System.out.println("B skonstruowane: " + this);
    }

    @Override
    public String toString() {
        return "ZiarnoB ma pole a=" + (a == null ? null : a.getClass().getSimpleName());
    }
}
