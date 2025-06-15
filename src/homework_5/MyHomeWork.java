package homework_5;

import java.util.Random;
import java.util.Scanner;


public class MyHomeWork {
    public static void main(String[] args) {
        createMultiArray();
        chessBoard();
    }

    /* ДЗ 1 Создать трехмерный массив из целых чисел.
    С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
    Пусть число, на которое будет увеличиваться каждый элемент,задается из консоли */

    public static void createMultiArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt(); // На какое число увеличивать значение в массиве

        int[][][] array = new int[2][5][4]; // 2 слоя, 5 строк, 4 столбца
        Random random = new Random();

        System.out.println("Исходный массив:");
        // Заполнение и вывод исходного массива
        for (int i = 0; i < 2; i++) {
            System.out.println("Слой " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 4; k++) {
                    array[i][j][k] = random.nextInt(100);
                    System.out.printf("%4d", array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        // Увеличение элементов и вывод измененного массива
        System.out.println("Массив после увеличения на " + number + ":");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Слой " + (i + 1) + ":");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                    System.out.printf("%4d", array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    //ДЗ 2  Шахматная доска.Создать программу для раскраски шахматной доски с помощью цикла.
    // Создать двухмерный массив String 8*8.С помощью циклов задать элементам цикла значения B(black или W(White))/*
    public static void chessBoard() {
        String[][] array = new String[8][8];//Создаем массив с размерностью 8 на 8
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++)
                array[i][k] = (i % 2 == k % 2) ? "W" : "B";// Заполняем массив, если строка нечетная - W,если четный столбец - B (Ternary Operator)
        }

        // Вывод доски
        for (String[] strings : array) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}



