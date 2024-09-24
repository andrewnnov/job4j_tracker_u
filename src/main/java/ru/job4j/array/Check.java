package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean isTheSame = data[0];
        for (int i = 1; i < data.length - 1; i++) {
            if (isTheSame != data[i]) {
                result = false;
            }
        }
        return result;
    }
}
