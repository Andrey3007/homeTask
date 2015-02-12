package com.sourceit.homework.andrey01.homeTasc03.recursion;

import java.util.Scanner;

/**
 * Created by Андрей on 12.02.2015.
 * •	Создайте код, который выводит все простые числа из интервала от 2доn (заданного с клавиатуры).
 * Результат должен быть: 2,3,5,7 ...
 */
public class Tasc3 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan= new Scanner(System.in);
        int i= scan.nextInt();
        calc(i);
        System.out.print("  "+i);
    }
    public static void play(int k){

    }
    public static int calc(int b){
        if(b>2){
            b=b-1;
            calc(b);
            System.out.print("  "+b);
            return b;
        }
        return 2;
    }
}
