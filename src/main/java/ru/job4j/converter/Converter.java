package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        // Assuming the conversion rate is 1 Euro = 70 Rubles
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        // Assuming the conversion rate is 1 Dollar = 75 Rubles
        return value / 60;
    }
}
