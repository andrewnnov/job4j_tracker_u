package ru.job4j.convert;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
    }
}
