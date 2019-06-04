# README
KonfiguracjaSpringaAdnotacjami

Część o adnotacjach z pakietu org.springframework.web zakłada użycie silnika serwletów Jetty.

Użyj komendy `mvn jetty:run` aby uruchomić aplikacjię.
Jeśli domyślny port (8080) jest zajęty, użyj `mvn -Djetty.port=8888 jetty:run` aby uruchomić Jetty na podanym porcie.

#### ( Praca w toku) 
Repozytorium do testowania konfiguracji springa opartej na adnotacjach. Na bazie poznanych i przetestowanych tutaj rozwiązań powstaną warsztaty podejmujące tematykę:

- Podstawy konfiguracji adnotacjami - Hello World!
- Podstawowe adnotacjie - @Required, @Autowired itp.
- Co gdy 2 fasolki pasują przy moim Autowired? - @Qualifier
- Tworzenie specjalistycznych fasolek - Controller, Service i Repository
- Cykliczne zależności
- Dobre praktyki

Lista będzie ulegać zmianom wraz ze zgłębieniem tematu.