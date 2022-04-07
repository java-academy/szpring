/**
 * Incializacja za pomocą setterów.
 * Spring najpierw inicializuje wszystkie ziarna za pomocą konstruktorów, a dopiero później wstrzykuje zalezności za pomocą setterów
 * co pozwoli nam unikąć tego problemu
 *
 *
 * <ol>
 *   <li>
 *     {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.mutator_wstrzykiwanie.ZiarnoA} Usuń z konstuktora adnotacje {@code @Autowired} i usuń z niego przypisanie do
 *      zmiennej zachowując wiadomość, stwórz setter i dodaj do niego adnotację {@code @Autowired}
 *   </li>
 * </ol>
 *
 * @author Jakub Czajka
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.mutator_wstrzykiwanie;