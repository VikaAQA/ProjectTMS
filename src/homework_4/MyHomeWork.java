package homework_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyHomeWork {
    public static void main(String[] args) {
        createArray();
        deleteNumFromArray();
        createArraysRandom();
        createDoubleArray();
    }

    /*ДЗ.1 Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
    Пусть число для поиска задается с консоли (класс Scanner)*/
    public static void createArray() {
        int[] numbers = {5, 12, 8, 3, 17, 9, 21, 6, 14, 10};

        // Создаем объект Scanner для ввода с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int targetNumber = scanner.nextInt();

        // Флаг для отслеживания найден ли элемент
        boolean isFound = false;

        for (int number : numbers) {
            if (number == targetNumber) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Число " + targetNumber + " содержится в массиве.");
        } else {
            System.out.println("Число " + targetNumber + " не содержится в массиве.");
        }
    }

    /*ДЗ.2 Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
          Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
          В результате должен быть новый массив без указанного числа.*/
    public static void deleteNumFromArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для удаления: ");
        int[] numbers = {5, 12, 8, 3, 17, 9, 21, 6, 14, 10};
        int targetNumber = scanner.nextInt();

        // Сначала считаем количество вхождений
        int count = 0;
        for (int num : numbers) {
            if (num == targetNumber) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Числа " + targetNumber + " нет в массиве");
            return;
        }

        // Создаем новый массив
        int[] newArray = new int[numbers.length - count];
        int index = 0;

        // Заполняем новый массив
        for (int num : numbers) {
            if (num != targetNumber) {
                newArray[index++] = num;
            }
        }

        System.out.println("Новый массив: " + Arrays.toString(newArray));
    }

    /*ДЗ.3 Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
    Для генерации случайного числа используйте метод Math.random ().
    Пусть будет возможность создавать массив произвольного размера.
    Пусть размер массива вводится с консоли.*/
    public static void createArraysRandom() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = scanner.nextInt();//вводим размерность массива
        double[] array = new double[arraySize];//создаем массив с введенной размерностью
        for (int i = 0; i < array.length; i++) {//заполняем массив случайными числами типа double
            array[i] = Math.random();
        }
        //  Находим минимальное, максимальное и среднее значения
        double min = array[0];
        double max = array[0];
        double sum = 0;

        for (double num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }

        double average = sum / arraySize;

        System.out.println("\nСгенерированный массив: " + Arrays.toString(array));
        System.out.printf("Минимальное значение: %.2f\n", min);
        System.out.printf("Максимальное значение: %.2f\n", max);
        System.out.printf("Среднее значение: %.2f\n", average);

    }

    /*ДЗ4  Создайте 2 массива из 5 чисел.Выведите массивы на консоль в двух отдельных строках.
      Посчитайте среднее арифметическое элементов каждого массива и сообщите,
      для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).*/
    public static void createDoubleArray() {
        int[] array1 = {1, 2, 6, 8, 4};//создание первого массива
        int[] array2 = {7, 88, 3, 44, 12};//создание второго массива
        System.out.println((Arrays.toString(array1)));//привидение первого массива к типу строка
        System.out.println((Arrays.toString(array2)));//привидение второго массива к типу строка

        int sum1 = 0;
        for (int j : array1) {//перебираем массив
            sum1 += j;//суммируем числа из первого масиива и складываем в переменную sum
        }
        int average1 = sum1 / array1.length; //получаем среднеарифметическое. Сумму чисел массива делим на длину массива
        System.out.println("Среднеарифметическое первого массива: " + average1);

        int sum2 = 0;
        for (int i : array2) {//перебираем массив
            sum2 += i;
        }//суммируем числа из второго масиива и складываем в переменную sum
        int average2 = sum2 / array2.length; //получаем среднеарифметическое.Сумму чисел массива делим на длину массива
        System.out.println("Среднеарифметическое второго массива: " + average2);

        if (average1 > average2) {//сравниваем среднее двух массивов и выводим результат
            System.out.println("Среднее первого массива больше");
        } else if (average2 > average1) {
            System.out.println("Среднее второго массива больше");
        } else {
            System.out.println("Средние арифметические равны");
        }
    }
}

