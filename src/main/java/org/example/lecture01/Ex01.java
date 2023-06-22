package org.example.lecture01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Ex01 {
    public static void main(String[] args) {
//        List<Integer> availableDivider = findAvailableDivider(12);
//        List<Integer> availableDivider = findSimpleNumbers(100);
//        for (Integer integer : availableDivider) {
//            System.out.println(integer);
//        }
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fib(11, counter);
        System.out.println("Fib number: " + fib);
        System.out.println("Counter: " + counter.get());
        System.out.println("Вероятность выпадения " + 9 + ": " + findSum(9));
    }

    /**
     * Пример алгоритма с линейной сложностью - O(n). Поиск делителей числа.
     *
     * @param number
     * @return
     */
    public static List<Integer> findAvailableDivider(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Пример алгоритма квадратичной сложности (два цикла) - O(n^2). Поиск простых чисел.
     *
     * @param max
     * @return
     */
    public static List<Integer> findSimpleNumbers(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    simple = false;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        System.out.println("Counter: " + counter);
        return result;
    }

    /**
     * Пример алгоритма с экспоненциальной сложностью - O(2^n). Рекурсивный поиск чисел Фибоначи.
     *
     * @param position
     * @param counter
     * @return
     */
    public static int fib(int position, AtomicInteger counter) {
        counter.incrementAndGet();
        if (position == 1) return 0;
        if (position == 2) return 1;
        return fib(position - 1, counter) + fib(position - 2, counter);
    }

    /**
     * Пример алгоритма с экспоненциальной сложностью - O(2^n). При увеличении количества кубиков.
     * Поиск вероятности выпадения суммы на 3 кубиках.
     *
     * @param sum
     * @return
     */
    public static double findSum(int sum) {
        int count = 0;
        int successResult = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (i + j + k == sum) {
                        successResult++;
                    }
                    count++;
                }
            }

        }
        return ((double) successResult) / ((double) count);
    }
}
