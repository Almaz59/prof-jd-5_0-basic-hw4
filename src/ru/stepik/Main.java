package ru.stepik;

public class Main {

    public static void main(String[] args) {
        // Задача 1:
        int a = 0;
        while (a < 10) {
            System.out.print(++a + " ");
        }
        System.out.println("");

        for (; a > 0; a--) {
            System.out.print(a + " ");
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

        // Задача 4:
        for (int j = 1; j <= 30; j++) {
            if (j % 3 == 0 && j % 5 == 0) {
                System.out.println(j + ": ping pong");
            } else if (j % 3 == 0) {
                System.out.println(j + ": ping");
            } else if (j % 5 == 0) {
                System.out.println(j + ": pong");
            } else
                System.out.println(j + ":");
        }

        // Задача 5:
        int a1 = 0;
        int b1 = 1;
        System.out.print(a1 + " " + b1 + " ");
        for (int i = 2; i < 10; i++) {
            int c = a1 + b1;
            a1 = b1;
            b1 = c;
            System.out.print(c + " ");
        }
    }
}


