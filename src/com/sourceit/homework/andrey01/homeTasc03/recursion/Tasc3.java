package com.sourceit.homework.andrey01.homeTasc03.recursion;

import java.util.Scanner;

/**
 * Created by Андрей on 12.02.2015.
 * •	Создайте код, который выводит все простые числа из интервала от 2доn (заданного с клавиатуры).
 * Результат должен быть: 2,3,5,7 ...
 */
public class Tasc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        Tasc3 x = new Tasc3();
        x.checkNumders(k);

    }

    public void checkNumders(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i, i-1)) {
                System.out.print(i + " ");
            }
        }
    }

    boolean isPrime(int p, int k) {
        if (k == 1) {
            return true;
        }
        if (p % k != 0) {
            return isPrime(p, k - 1);
        }
        return false;
    }
}
