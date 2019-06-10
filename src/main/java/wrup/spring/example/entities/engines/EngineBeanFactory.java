package wrup.spring.example.entities.engines;

/**
 * @author Wiktor Rup
 */
class EngineBeanFactory {

    public Engine getEngine(int number) {
        switch (number) {
            case 1:
                return new Diesel();
            case 2:
                return new Fuel();
            default:
                throw new IllegalArgumentException("Uknown parameter " + number);

        }
    }
}
