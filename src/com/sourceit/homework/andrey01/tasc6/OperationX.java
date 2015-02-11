package com.sourceit.homework.andrey01.tasc6;

import java.util.Scanner;

/**
 * Created by Андрей on 11.02.2015.
 */
public class OperationX {
    public static void main(String[] args) {
        System.out.println("Введите первое число (n)");
        Scanner scan1= new Scanner(System.in);
        double n= scan1.nextDouble();

        System.out.println("Введите второе число (m)");
        Scanner scan2= new Scanner(System.in);
        double m= scan2.nextDouble();

        double mod1=Math.abs(n - 10);
        double mod2=Math.abs(m - 10);

        if(mod1==mod2){
            System.out.println("Оба числа равно удалены от 10");
        }else{
            if (mod1<mod2){
                System.out.println("Первое число (n) ближе к 10");
            }else{
                System.out.println("Второе число (m) ближе к 10");
            }
        }
    }
}
