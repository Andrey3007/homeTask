package com.sourceit.homework.andrey01.homeTasc03.array;

/**
 * Created by Андрей on 11.02.2015.
 * •	Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 * Вывести массив на экран.
 */
public class Array {
    public static void main(String[] args) {
        int a[][] = new int[8][5];
        for (int k =0; k < 8 ; k ++) {
            for (int i = 0; i < 5; i++) {
               int d= ((int)(((Math.random())*(90))+(10)));
                a[k][i]=d;
                System.out.print(a[k][i]+"  ");
            }
            System.out.println();
        }
    }
}
