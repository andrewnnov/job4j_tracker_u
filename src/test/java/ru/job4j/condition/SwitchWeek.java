package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1 : name = "Понедельник";
            break;
            case 2: name = "Вторник";
            break;
            default: name = "Нет такого дня";
            break;
        }
        return name;
    }
}


