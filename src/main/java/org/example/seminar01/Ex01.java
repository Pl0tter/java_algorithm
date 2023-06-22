package org.example.seminar01;

import java.util.Date;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
//        example01();
//        example02();
//        example03();
        example04();
    }

    /**
     * Необходимо написать алгоритм, считающий сумму всех чисел
     * * от 1 до N. Согласно свойствам линейной сложности,
     * * количество итераций цикла будет линейно изменяться
     * * относительно изменения размера N.
     */
    public static void example01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1;
        }
        System.out.println(sum);
        sc.close();
    }

    /**
     * Написать алгоритм поиска простых чисел (делятся только на себя и
     * на 1) в диапазоне от 1 до N. В алгоритме будет использоваться
     * вложенный for, что явно говорит о квадратичной сложности, на этом
     * стоит акцентировать внимание
     */
    public static void example02() {
        boolean flag;
        for (int i = 2; i < 1000; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Необходимо написать алгоритм поиска всех доступных комбинаций
     * (посчитать количество) для количества кубиков K с количеством граней N.
     */
    public static void example03() {
        int count = 4;
        int faces = 6;
        System.out.println(recursiveCount(1, count, faces));

    }

    public static int recursiveCount(int countNow, int maxCount, int faces) {
        int count = 0;
        for (int i = 0; i < faces; i++) {
            if (countNow == maxCount) {
                count++;
            } else {
                count += recursiveCount(countNow + 1, maxCount, faces);
            }
        }
        return count;
    }

    /**
     * Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
     * Считаем, что 1 и 2 значения последовательности равны 1
     */
    public static void example04() {
        int n = 46; // максимум для int - 46
        Date startDate = new Date();
        System.out.println(fb(n));
        Date endDate = new Date();
        System.out.print("Решение через рекурсию: ");
        System.out.println(endDate.getTime() - startDate.getTime());
        Date startDate2 = new Date();
        System.out.println(fb2(n));
        Date endDate2 = new Date();
        System.out.print("Решение линейное: ");
        System.out.println(endDate2.getTime() - startDate2.getTime());

    }

    public static long fb(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return fb(num - 1) + fb(num - 2);
        }
    }

    public static long fb2(int num) {
        if (num <= 2) {
            return 1;
        }
        long[] numbers = new long[num];
        numbers[0] = 1;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[num - 1];
    }
}
