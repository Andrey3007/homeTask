package com.sourceit.homework.andrey01.homeTasc03.recursion;

import java.util.Scanner;

/**
 * Created by Андрей on 12.02.2015.
 * •	Написать метод, который для данного числа n (заданного с клавиатуры) вычисляет сумму чисел от 1 до n;
 */
public class Tasc1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan= new Scanner(System.in);
        int i = scan.nextInt();

        System.out.print(sum(i));

    }
    public static int sum(int a){
        if (a>0){
            a=a+sum(a-1);
        }

        return a;
    }
}
