package ru.job4j.condition;

public class ChessBoardSl {

    public static int way(int x1, int y1, int x2, int y2) {
        int result  = 0;
        if ((isValid(x1) && isValid(x2) && isValid(y1) && isValid(y2))
                && isDiagonalMove(x1, y1, x2, y2)) {
            result = Math.abs(x2 - x1);
        }

        return result;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean isDiagonalMove(int x1, int y1, int x2, int y2) {
        return Math.abs(x2 - x1) == Math.abs(y2 - y1);
    }
}
