/**
 * <p>Skoro <b>Cykliczna zależność</b> pojawia się przy inicjacji przez konstruktor... to pomocą będzie inicjacja przez metody!</p>
 * </p>Spring najpierw inicjuje wszystkie ziarna za pomocą konstruktorów, a dopiero później wstrzykuje zależności za pomocą metod
 * co pozwoli nam uniknąć problemu cyklicznej zależności.</p>
 *
 * <ol>
 *   <li>Otwórz i odpal
 *     {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.mutator_wstrzykiwanie.Main}.</li>
 *   <li>Sprawdź, że wyjątki są takie same jak w poprzednim pakiecie.</li>
 *   <li>Otwórz
 *     {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.mutator_wstrzykiwanie.ZiarnoA}.</li>
 *   <li>Pozbywamy się cyklicznej zależności: usuń inicjację z konstruktora.</li>
 *   <li>Utwórz i okabluj metodę, która wstrzyknie {@code ziarnoB}.</li>
 *   <li>Skończywszy pracę tutaj, idź dalej. Mutatory niweczą niezmienność klasy czy jej przydatność przy wielowątkowych operacjach.</li>
 * </ol>
 * @see ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.leniwa_inicjacja
 * @author Jakub Czajka
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.mutator_wstrzykiwanie;