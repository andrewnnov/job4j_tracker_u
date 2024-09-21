package ru.job4j.condition;

public class MultipleSwitchWeek {

    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tu" -> 2;
            case "Среда", "Wen" -> 3;
            default -> -1;
        };
    }
}
