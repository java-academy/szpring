/**
 * Praca z tym pakietem pokaże Ci, jak działa {@code BeanPostProcessor}, odświeży kolejność wykonywania operacji
 * przy tworzeniu ziaren oraz refleksję.
 *
 * <br>
 * <p>
 * Postępuj zgodnie z poniższymi instrukcjami:
 * <ol>
 *  <li>Odwiedź {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna.Main Main}
 *  <ul>
 *    <li>
 *      Uruchom program, zobacz wydruk na konsoli.<br><br>
 *    </li>
 *    <li>
 *      Zakomentuj wskazaną linię w klasie DrugiSuperTypImpl, po czym uruchom program jeszcze raz.
 *      Następnie odkomentuj linię i tak ją zostaw.
 *      Odpowiedz dlaczego jest różnica w działaniu programu.<br><br>
 *    </li>
 *  </ul>
 *  <li>Twoje zadanie
 *  <ul>
 *    <li>
 *      Twoim zadaniem jest uzyskać następujący wydruk na konsoli po uruchomieniu programu:<br><br>
 *      <pre>
 * Zmienione!
 * Niezmienione
 * Zmienione również tutaj!
 *      </pre>
 *    </li>
 *    <li>
 *        NIE możesz zmieniać istniejącego kodu. Ani linijka kodu nie może zostać zmieniona. <b>Zmiany robisz refleksją.</b>
 *    </li><br>
 *    <li>
 *      Żeby to osiągnąć musisz napisać własny {@code BeanPostProcessor}, w którym nadpisz odpowiednią
 *      metodę.
 *      Post-procesory ziaren mogą przetworzyć każde tworzone ziarno przed i po ustawieniu wszystkich właściwości.
+ *      W nadpisanej metodzie <b>za pomocą refleksji</b> zmień wartość pola myString na "Zmienione!" dla jednego ziarna i "Zmienione również tutaj!" dla drugiego.<br><br>
 *    </li>
 *  </ul>
 *  </li>
 *       <li>Materiały:<br>
 *  <ul>
 *       <li> <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/config/BeanPostProcessor.html">BeanPostProcessor</a></li>
 *       <li><a href="https://www.tutorialspoint.com/spring/spring_bean_post_processors.htm">Tutorial BeanPostProcessor</a></li>
 *  </ul>
 * </li>
 * </ol>
 *
 * @implNote Uważaj na różnice w wywołaniach metod {@code getField} oraz {@code getDeclaredField}. Nie możesz zmieniać kodu, pamiętasz?
 * @author Kacper Staszek
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna;