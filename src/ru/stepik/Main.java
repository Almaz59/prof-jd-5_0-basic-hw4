package ru.stepik;

public class Main {

    public static void main(String[] args) {
        // Задача 1:
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println("");

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // Задача 2:
        int friday = 5;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница " + friday + "-е число");
        }

        // Задача 3:
        int pastYear = 1822;
        int futureYear = 2122;
        for (int i = 0; i < futureYear; i += 79) {
            if (i >= pastYear)
                System.out.println(i + " ");
        }
    }
}
