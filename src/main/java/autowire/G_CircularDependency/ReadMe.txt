Okrężna Zależność występuje w moencie kiedy dwa albo więcej ziaren jest od siebie zależne i są inicializowane za pomocą konstruktora.
Spring to mądra bestia i potrafi sam wywnisokować w jakiej kolejności powinien tworzyć poszczególne ziarna ale w takim przypadku gubi się i wyrzuci
BeanCurrentlyInCreationException, gdyż Spring nie jest w stanie wstrzykąć Ziaren które nie dostały do końca zainicializowane.
Jest jednak kilka sposobów jak się ten problem rozwiązać. Każdy podpakiet wyjaśni ci krok po kroku co należy zrobić