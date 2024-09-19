package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra ta ta");
    }

    public void sing() {
        System.out.println("I believe I can fly");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.music();
        student.sing();
    }
}
