/**
 * <p>
 * Pakiet demonstruje problem Cyklicznej Zależności.
 * </p><br>
 * <ol><li><b>Cykliczna Zależność</b> występuje w momencie kiedy dwa albo więcej ziaren jest od siebie zależne i są inicjowane za pomocą konstruktora.</li><br>
 * <ul>
 * <li>Spring to mądra bestia i potrafi sam wywnioskować w jakiej kolejności powinien tworzyć poszczególne ziarna, ale w takim przypadku gubi się i wyrzuci
 * {@link org.springframework.beans.factory.BeanCurrentlyInCreationException}, gdyż nie jest w stanie wstrzyknąć ziaren, które nie zostały do końca zainicjowane.
 * <li>Oglądnij oba ziarna oraz klasę główną. NIE ZMIENIAJ KODU, CZYTAJ GO, odpal go, czytaj wyjątki a zwłaszcza obie sekcje <i>Caused by</i>.</li>
 * </li><br>
 * <li>Spróbuj rozwiązać problem ręcznie. Zerknij na {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.start.ZiarnoA}.</li><br>
 * </ul>
 * <li>Ręczne rozcięcie zależności NIE zawsze jest możliwe. Od tego momentu zakładamy, że ziarna FAKTYCZNIE się wzajem potrzebują (nawet jeśli ich kod na to nie wskazuje): rozcięcie zależności NIE jest rozwiązaniem. Jest na szczęście kilka dalszych sposobów jak ten problem rozwiązać. Każdy podpakiet wyjaśni Ci krok po kroku co należy zrobić. Skończywszy pracę tutaj, idź dalej.</li>
 * </ol>
 * @see ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.mutator_wstrzykiwanie
 * @author Jakub Czajka
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.start;