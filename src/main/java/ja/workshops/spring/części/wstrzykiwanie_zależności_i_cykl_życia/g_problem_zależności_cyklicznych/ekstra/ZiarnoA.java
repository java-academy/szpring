package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.ekstra;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <li>W jakiej kolejności działa tu Spring?</li>
 * <li>Co zmieni {@code @Autowired}?</li>
 * <li>Odkomentuj linię oznaczoną poniżej jak będziesz gotowy - czas się sprawdzić!</li>
 *
 * @author sytolk z SO
 */
@Component("ziarenkoA")
class ZiarnoA {

    // FIXME: odkomentuj
//     @Autowired
    private ZiarnoB b;

    void f() {
        System.out.println(this);
    }

    @PostConstruct
    void post() {
        System.out.println("A skonstruowane: " + this);
    }

    @Override
    public String toString() {
        return "ZiarnoA ma pole b=" + (b == null ? null : b.getClass().getSimpleName());
    }
}
