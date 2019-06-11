/**
 * <p>
 * W tym pakiecie dowiesz się czym jest problem Okrężnej Zależności, oraz jak możesz go rozwiązać.
 * </p>
 * <br>
 * <p>Okrężna Zależność występuje w momencie kiedy dwa albo więcej ziaren jest od siebie zależne i są inicializowane za pomocą konstruktora.
 * Spring to mądra bestia i potrafi sam wywnisokować w jakiej kolejności powinien tworzyć poszczególne ziarna ale w takim przypadku gubi się i wyrzuci
 * BeanCurrentlyInCreationException, gdyż Spring nie jest w stanie wstrzyknąć Ziaren które nie dostały do końca zainicializowane.
 * Jest jednak kilka sposobów jak ten problem rozwiązać. Każdy podpakiet wyjaśni Ci krok po kroku co należy zrobić.
 * </p>
 * @author Jakub Czajka
 */
package autowire.G_CircularDependency;