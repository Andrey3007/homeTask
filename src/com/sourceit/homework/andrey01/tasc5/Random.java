package com.sourceit.homework.andrey01.tasc5;

import java.util.Scanner;

/**
 * Created by Андрей on 11.02.2015.
 */
public class Random {
    public static void main(String[] args) {
        int g= getValue();
        int r= random(g);
        render(r);
    }

    private static void render(int r) {
        System.err.print(r);
    }

    private static int random(int g) {
        int z=((int)(Math.random()*(g+1)));
        if(Math.random()<0.5){
            z=-z;
            return (z);
        }else{
            return z;
        }

    }

    private static int getValue() {
        System.err.println("Введите число для задания диапазона генерации числа");
        Scanner scan= new Scanner(System.in);
        int i= scan.nextInt();
        return i;
    }


}
