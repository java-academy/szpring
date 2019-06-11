/**
 *  Po przejściu tego pakietu dowiesz się na czym polega leniwa inicjalizacja, czym jest kwalifikator ziaren
 *  oraz w jakim momencie Spring wstrzykuje zależności przez konstruktory
 *  i settery.
 *  <br>
 *  <br>
 *  Postępuj zgodnie z poniższymi instrukcjami:
 *
 * <ol>
 *   <li>{@link autowire.A_example.Main Main}
 *     <ul>
 *  <li>Zastanów się czy możesz uzyskać z kontekstu instancję {@link autowire.A_example.KonceptC KonceptC}
 *    w inny sposób niż przez wywołanie {@code getBean(String name, Class<T> requiredType)}
 *    Dowiedz się więcej z: <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/BeanFactory.html">BeanFactory</a></li>
 *  <li>Uruchom program, zauważ w jakiej kolejności wywoływane są konstruktory, settery i metody samych ziaren.
 *    przypomnij sobie kolejność działań podejmowanych przez Springa przy tworzeniu ziaren.
 *    Dowiedz się więcej z: <a href="https://stackoverflow.com/questions/29743320/how-exactly-does-the-spring-beanpostprocessor-work">Cykl życia ziarna</a></li>
 *  <li> Zauważ, że zarówno KonceptDImpl, jak i KonceptAImpl mają adnotację {@code @Lazy}. Przeczytaj
 *    co ona oznacza i dlaczego w tym przykładzie działa w różny sposób.
 *    Dowiedz się więcej z: <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Lazy.html">{@code @Lazy}</a>
 *    oraz z: <a href="https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-lazy-init">Leniwa inicjalizacja</a></li>
 *   <li>Za pomocą debuggera, podczas działania programu przyglądnij się utworzonej instancji {@link org.springframework.context.ApplicationContext ApplicationContext}. Znajdź pole {@link org.springframework.context.annotation.AnnotationConfigApplicationContext#beanFactory beanFactory},
 *      następnie w nim pole {@link org.springframework.beans.factory.support.DefaultListableBeanFactory#registeredSingletons registeredSingletons}. Zauważ zmianę przed wywołaniem {@code kontekst.getBean(KonceptD.class)} i po nim.</li>
 *    </ul>
 *   </li>
 *   <li>{@link autowire.A_example.KonceptAImpl KonceptAImpl}
 *     <ul>
 *       <li>
 *         Odpowiedz na pytanie - dlaczego wstrzykiwanie przez pole jest niezalecaną praktyką?
 *       </li>
 *       <li>
 *         Odpowiedz na pytanie - w którym momencie Spring wstrzykuje zależności przez pola? (np przed setterami?).
 *       </li>
 *       <li>
 *        Zastanów się czy można usunąć annotację {@code @Qualifier}? Dowiedz się jak działa. W tym celu zapoznaj się z:
 *        <a href="https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-autowired-annotation-qualifiers">Użycie {@code @Qualifier} z {@code @Autowired}</a>
 *        oraz z:
 *        <a href="https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Qualifier.html">{@code @Qualifier}</a>
 *       </li>
 *     </ul>
 *   </li>
 *   <li>{@link autowire.A_example.KonceptB KonceptB}
 *     <ul>
 *       <li>
 *        Odpowiedz na pytanie, w której kolejności Spring wywoła setter wstrzykujący zależność
 *        do pola {@link KonceptB#konceptA konceptA}.
 *       </li>
 *       <li>Odpowiedz na pytanie czy wstrzykiwanie przez settery jest dobrą praktyką?</li>
 *     </ul>
 *   </li>
 *   <li>{@link autowire.A_example.KonceptCImpl KonceptCImpl}</li>
 *   <ul>
 *     <li>Odpowiedz na pytanie w którym momencie Spring wywołuje konstruktor do wstrzyknięcia zależności.</li>
 *   </ul>
 * </ol>

 * @author Kacper Staszek
 */
package autowire.A_example;