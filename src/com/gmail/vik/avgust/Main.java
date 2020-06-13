package com.gmail.vik.avgust;

import java.util.Arrays;
import java.util.Random;

public class Main {

    /*
    1. Создайте массив из 15 случайных целых чисел из отрезка [0;9].
    Выведите массив на экран.
    Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
    2. Создать метод, который будет сортировать указанный массив по возрастанию любым известным вам способом.
    */

    public static void main(String[] args) {

        int b = 0;

        int[] Mas = new int[15];

        for (int i = 0; i < Mas.length; i++) {

            Random rnd = new Random();

            Mas[i] = rnd.nextInt(10);

            System.out.print(Mas[i] + " ");

            if (Mas[i] > 0 & Mas[i] % 2 == 0) b++;
        }

        System.out.println(" - Массив 15 случайных чисел" + " ");
        System.out.print("\n");

        System.out.println("Всего в массиве " + b + " четных");
        System.out.print("\n");

        System.out.print("Сортировка массива по возрастанию - " + " ");

        Arrays.sort(Mas);
        for (int j = 0; j < Mas.length; j++) {

            System.out.print(Mas[j] + "  ");

        }
    }
}






