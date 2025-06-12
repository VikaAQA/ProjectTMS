package homework_3;

import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args) {
        showSeasonOnMonthSwitchCase();
        showSeasonOnMonthIfElse();
        checkEvenNumber();
        checkTemperature();
        checkColor();
        checkOddNumber();
        useDecrement();
        showPlusNum();
        showSubsequence();
        showSubsequenceMinus();
        squareNum();
    }

    // ДЗ.1 Написать программу для вывода названия поры года по номеру месяца. При решении использовать оператор switch-case
    public static void showSeasonOnMonthSwitchCase() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число месяца от 1 до 12 - ");
        int numMonth = in.nextInt();

        switch (numMonth) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Вы ввели неверное число месяца");
        }
    }

    // ДЗ.2 Написать программу для вывода названия поры года по номеру месяца. При решении использовать оператор if-else-if
    public static void showSeasonOnMonthIfElse() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число месяца от 1 до 12 - ");
        int numberMonth = in.nextInt();

        if (numberMonth == 12 || numberMonth < 3) {
            System.out.println("Зима");
        }
        if (numberMonth >= 3 && numberMonth <= 5) {
            System.out.println("Весна");
        }
        if (numberMonth >= 6 && numberMonth <= 8) {
            System.out.println("Лето");
        }
        if (numberMonth >= 9 && numberMonth <= 11) {
            System.out.println("Осень");
        } else if (numberMonth > 12) {
            System.out.println("Вы ввели неверное число месяца");
        }
    }

    //ДЗ.3 Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
    // Для определения честности числа используйте операцию получения остатка от деления-операция выглядит так:'%2'
    public static void checkEvenNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }

    //ДЗ.4 Для введенного числа t(температура на улице)вывести
    //Если t>-5, то вывести Тепло.Если -5>=t>-20 Нормально.Если -20>=t Холодно
    public static void checkTemperature() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите температуру воздуха ");
        int temperature = in.nextInt();

        if (temperature > -5) {
            System.out.println("Тепло");
        } else if (temperature > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }

    //ДЗ 5.По введенному номеру определить цвет радуги:1-красный,4-зеленый и т.д
    public static void checkColor() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер радуги от 1 до 7 ");
        int numColor = in.nextInt();
        switch (numColor) {
            case 1 -> System.out.println("Красный");
            case 2 -> System.out.println("Оранжевый");
            case 3 -> System.out.println("Жёлтый");
            case 4 -> System.out.println("Зелёный");
            case 5 -> System.out.println("Голубой");
            case 6 -> System.out.println("Синий");
            case 7 -> System.out.println("Фиолетовый");
            default -> System.out.println("Ошибка! Введите число от 1 до 7.");
        }
    }

    //ДЗ 6.При помощи цикла for вывести на экран нечетные числа от 1 до 99 .При решении используйте операцию инкремента(++)
    public static void checkOddNumber() {
        for (int oddNumber = 1; oddNumber <= 99; oddNumber += 2) {
            System.out.println(oddNumber + " ");
        }
    }

    //ДЗ 7.Необходимо вывести на экран числа от 5 до 1.При решении используйте операцию декремента(--)
    public static void useDecrement() {
         for (int number = 5; number > 0; number--) {
            System.out.println(number + " ");
        }
    }

    //ДЗ 8.Напишите программу, где пользователь вводит любое целое положительное число.
    // А програма суммирует все числа от 1 до введенного пользователем чсила. Для ввода числа воспользуйтесь классом Scanner
    public static void showPlusNum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число ");
        int num = in.nextInt();
        int sum = 0;
        for (int n = 1; n <= num;n++ )
        { sum += n;}
        System.out.println("Cумма чисел "+sum );
     }

    //ДЗ 9.Необходимо, чтоб программа выводила на экран вот такую последовательность
    // 7 14 21 28 35 42 49 56 63 70 77 84 91 98 .В решении использовать цикл while
    public static void showSubsequence() {
    int n  =7;
    while(n<= 98){System.out.println(n);
        n += 7;}
    }

    //ДЗ 10 Вывести 10 первых чисел последовательности 0, -5,-10, -15
     public static void showSubsequenceMinus() {
    int n  =0;
    int count = 0;
    while(count<10 ){System.out.println(n);
        n -=5;
    count++;
    }
    }

    //ДЗ 11 Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
    public static void squareNum() {
        for (int i = 10; i <= 20; i++) {
            int square = i * i;
            System.out.println(i + "\t" + square);
        }
    }
}







