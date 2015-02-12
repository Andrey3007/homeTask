package com.sourceit.homework.andrey01.homeTasc03.recursion;

import java.util.Scanner;

/**
 * Created by Андрей on 12.02.2015.
 * •	Подсчитайте, сколько раз потребуется повторно вычислить четвёртый элемент последовательности Фибоначчи
 * для вычисления пятнадцатого элемента.
 */
public class Tasc2 {
    static int c=0;
    public static void main(String[] args) {

        int i;
        i =15;
        System.out.print("Ряд чисел Фибоначчи ");
        for(int a=0; a<(i+1);a++){
            System.out.print(calculation(a)+" ");
        }
        System.out.print("\n"+"Вызовов расчета четвертого элемента  "+c);

    }
    public static int calculation(int i){
        if(i==4)c=c+1;
        if ((i==0)||(i==1)){
            return 1;
        }
        return (calculation(i-1)+calculation(i-2));
    }
}
