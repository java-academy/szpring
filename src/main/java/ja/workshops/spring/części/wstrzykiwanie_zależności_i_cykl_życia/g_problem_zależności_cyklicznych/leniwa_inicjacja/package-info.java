/**
 * Leniwa inicjacja.
 * <br><br>
 * <ol>
 * <li>Przeczytaj:
 * <a href = "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Lazy.html">dokumentację adnotacji Lazy</a>.<br>
 * Adnotacja {@code @Lazy} powoduje, że obiekt zostanie zainicjowany dopiero po odniesieniu się doń, a wcześniej w jego miejsce wstawiany jest pośrednik (ang. proxy).</li><br>
 * <li>Idź do {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.leniwa_inicjacja.Main}, odpal je - ten sam błąd co w poprzednich pakietach, prawda?</li>
 * <br>
 * <li>Czas na {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.leniwa_inicjacja.ZiarnoA ZiarnoA}, przeczytaj Javadoc, po dokonaniu zmian uruchom klasę {@code Main} i upewnij się, że wszystko działa.</li><br>
 * <li>Pamiętaj by odpowiedzieć na pytanie zadane tamże.</li><br>
 * <li>Leniwa inicjacja ma swoje problemy (może np. maskować problemy aplikacji): <ul>
 *     <li>prosząc o zasób czekamy też na inicjację - trwa to dłużej.</li>
 *     <li>pośrednik jest prostym obiektem - ale jest dostępny: brak definicji klasy właściwego obiektu poskutkuje {@code NoClassDefFoundError}.</li>
 *     <li>pośrednik potrzebuje małej ilości pamięci, prawdziwy obiekt niekoniecznie.</li> itp. itd. Skończywszy pracę tutaj, idź dalej.
 * </ul></li>
 * </ol>
 * @see ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.adnotacja_PostConstuct
 *
 * @author Jakub Czajka
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.leniwa_inicjacja;