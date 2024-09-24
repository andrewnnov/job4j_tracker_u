package ru.job4j.loop;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int result  = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                result = i;
            }
        }
        return result;
    }
}
