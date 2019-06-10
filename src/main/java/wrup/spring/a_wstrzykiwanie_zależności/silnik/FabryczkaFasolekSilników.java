package wrup.spring.a_wstrzykiwanie_zależności.silnik;

/**
 * @author Wiktor Rup
 */
class FabryczkaFasolekSilników {

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
