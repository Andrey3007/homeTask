package com.sourceit.homework.andrey01.homeTasc03.array;

/**
 * Created by Андрей on 11.02.2015.
 * •	Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
 * Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
 * Если таких строк несколько, то вывести индекс первой встретившейся из них.
 */
public class Array2 {
    public static void main(String[] args) {
        int a[][] = new int[8][5];
        int maxSum=0;
        int index=0;
        for (int k = 0; k < 8; k++) {
            int sum=0;
            for (int i = 0; i < 5; i++) {
                int d = ((int) (((Math.random()) * (6))));
                if (Math.random() < 0.5) {
                    d = -d;
                }
                a[k][i] = d;
                System.out.print(a[k][i] + "  ");
                sum+= Math.abs(a[k][i]);
            }
            //System.out.print(sum+" "+k);  //Для ручной проверки правильности
            System.out.println();
            if(sum>maxSum){
                maxSum=sum;
                index=k;
            }
        }
        System.out.println("Наибольшая сумма равна "+maxSum+"в строке №"+index);
    }
}