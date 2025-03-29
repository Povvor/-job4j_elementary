package ru.job4j.condition;

public class Max {

    public  double maximum(double first, double second) {
        return (first > second ? first : second);
    }

    public  double maximum(double first, double second, double third) {
        return maximum(first, maximum(second, third));
    }

    public  double maximum(double first, double second, double third, double fourth) {
        return maximum(first, maximum(second, third, fourth));
    }
}