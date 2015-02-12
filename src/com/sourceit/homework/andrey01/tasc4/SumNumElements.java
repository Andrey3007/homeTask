package com.sourceit.homework.andrey01.tasc4;

import java.util.Scanner;

/**
 * Created by Андрей on 10.02.2015.
 * •	В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран
 * сумму цифр числа n(n – вводит пользователь).
 */
public class SumNumElements {
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);
        int i = sca.nextInt();
        System.out.print(sum(i));
    }

    private static int sum(int i) {
        int t=0;
        for(int d=0;d<3;d++){
            t+= i%10;
            i/=10;
        }
        return t;
    }

}
