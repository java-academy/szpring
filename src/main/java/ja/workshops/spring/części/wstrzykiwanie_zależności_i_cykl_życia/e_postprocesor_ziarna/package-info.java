/**
 * Praca z tym pakietem pokaże Ci jak działa BeanPostProcessor, odświeży kolejność wykonywania operacji
 * przy tworzeniu ziaren, oraz refleksję.
 *
 * <br>
 *
 * Postępuj zgodnie z poniższymi instrukcjami:
 * <ol>
 *  <li>{@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna.Main Main}
 *  <ul>
 *    <li>
 *      Uruchom program, zobaczy wydruk na konsoli.<br><br>
 *    </li>
 *    <li>
 *      Zakomentuj wskazaną linię w klasie DrugiSuperTypImpl, po czym uruchom program jeszcze raz.
 *      następnie odkomentuj linię.
 *      Odpowiedz dlaczego jest różnica w działaniu programu.<br><br>
 *    </li>
 *    <li>
 *      Twoim zadaniem jest uzyskać następujący wydruk na konsoli po uruchomieniu programu:<br><br>
 *      Niezmienione <br>
 *      Niezmienione <br>
 *      Zmienione!  <br><br>
 *    </li>
 *    <li>
 *      Żeby to osiągnąć musisz napisać własny BeanPostProcessor, w którym nadpisz odpowiednią
 *      metodę.
 *      BeanPostProcessory mogą przetwożyć każde tworzone ziarno przed ustawieniem wszystkich właściwości
 *      i po nim.
 *      W nadpisanej metodzie za pomocą refleksji zmień wartość pola myString na "Zmienione!".<br><br>
 *       Materiały:<br>
 *       <li> <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanPostProcessor.html"> BeanPostProcessor</a></li>
 *       <li><a href="https://www.tutorialspoint.com/spring/spring_bean_post_processors.htm"> Tutorial BeanPostProcessor</a></li>
 *    </li>
 *  </ul>
 *  </ul>
 *  </li>
 *
 * </ol>
 *
 * @author Kacper Staszek
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna;