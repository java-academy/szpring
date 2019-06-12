package ja.workshop.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.silnik;

/**
 * Fabryka ziaren. Pozwala na wstrzyknięcie konkretnego ziarna do interesującej nas klasy {@link ja.workshop.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.Samochód Samochód}.
 *
 * @author Wiktor Rup
 */
public class FabryczkaZiarenSilników {

    public Silnik wybierzSilnik(int numerWyboru) {
        switch (numerWyboru) {
            case 1:
                return new OlejNapędowy();
            case 2:
                return new Benzyna();
            default:
                throw new IllegalArgumentException("Ni ma silnika z numerem " + numerWyboru);

        }
    }
}
