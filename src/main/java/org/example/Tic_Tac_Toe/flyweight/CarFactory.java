package org.example.Tic_Tac_Toe.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<String, Car> carMap = new HashMap<>();

    public static Car getCar(String engine) {
        carMap.putIfAbsent(engine, new Car(engine));
        return carMap.get(engine);
    }
}
