package wrup.spring.example.entities;

import wrup.spring.example.entities.engines.Engine;

/**
 * @author Wiktor Rup
 */
public class Car {

    private Engine engine;

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
