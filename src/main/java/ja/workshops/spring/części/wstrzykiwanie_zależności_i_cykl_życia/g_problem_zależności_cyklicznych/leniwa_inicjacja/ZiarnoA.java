package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.leniwa_inicjacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Proste i miłe ziarno, potrafi się przywitać.
 *
 * @implNote Gdzieś tutaj dopisz adnotację {@code @Lazy}. Czy ważne jest miejsce, gdzie ją umieścimy? Dlaczego?
 *
 * @see org.springframework.context.annotation.Lazy
 * @author Jakub Czajka
 */
@Component
class ZiarnoA {
    ZiarnoB ziarnoB;

    @Autowired
    public ZiarnoA(@Lazy ZiarnoB ziarnoB) { // najlepsze, bo najbardziej precyzyjne umieszczenie, choć na k-torze też zadziała (ale dla k-tora, nie dla parametru)
        this.ziarnoB = ziarnoB;
    }

    public void siemano() {
        System.out.println("Witam jestem A");
    }
}
