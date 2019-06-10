package wrup.spring.a_wstrzykiwanie_zależności.silnik;

/**
 * Fabryka ziaren. Pozwala na wstrzyknięcie konkretnego ziarna do interesującej nas klasy Samochód. {@link wrup.spring.a_wstrzykiwanie_zależności.Samochód}
 *
 * @author Wiktor Rup
 */
public class FabryczkaZiarenSilników {

    public Silnik wybierzSilnik(int number) {
        switch (number) {
            case 1:
                return new OlejNapędowy();
            case 2:
                return new Benzyna();
            default:
                throw new IllegalArgumentException("Ni ma silnika z numerem " + number);

        }
    }
}
