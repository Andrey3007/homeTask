package com.sourceit.homework.andrey01.homeTasc03.loop;

import java.util.Scanner;

/**
 * Created by Андрей on 11.02.2015.
 */
public class FoundSumNum {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan= new Scanner(System.in);
        int i= scan.nextInt();
        int n=0;
        do{
            n+=i%10;
            i=i/10;

        }while (i!=0);
        System.out.println(n);
    }
}
