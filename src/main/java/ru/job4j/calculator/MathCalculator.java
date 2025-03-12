package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double allToMath(double first, double second) {
        return sumAndMultiply(first, second)
                + subtractAndDivide(first, second);
    }

    public static void main(String[] args) {
        double first = 10;
        double second = 20;
        System.out.println("Результат расчета 'Сумма и Произведение' равен: " + sumAndMultiply(first, second));
        System.out.println("Результат расчета 'Разность и Частное' равен: " + subtractAndDivide(first, second));
        System.out.println("Результат расчета 'Считаем Все!' равен: " + allToMath(first, second));

    }




}
