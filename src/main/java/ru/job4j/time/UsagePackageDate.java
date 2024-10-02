package ru.job4j.time;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date is: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time is: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущине дата и время после форматиования: " + currentDateTimeFormat);
        System.out.println("Текущие дата и время: " + currentDateTime);
    }
}
