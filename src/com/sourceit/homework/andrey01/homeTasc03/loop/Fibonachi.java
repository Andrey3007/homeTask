package com.sourceit.homework.andrey01.homeTasc03.loop;

import java.util.Scanner;

/**
 * Created by Андрей on 11.02.2015.
 * цикл do-while позволяет пользователю ввести отрицательное число. В этом случае цикл повторяется и пользователя
 * прося ввести число заново.
 */
public class Fibonachi {
    public static void main(String[] args) {
        char c;
        int i;
        do {
            System.out.println("Введите число для которого хотите узнать значение функции Фибониччи");
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
        }while (i<0);
        System.out.print("Ряд чисел Фибоначчи ");
        for(int a=0; a<(i+1);a++){
            System.out.print(calculation(a)+" ");
        }

        }
    public static int calculation(int i){
        if ((i==0)||(i==1)){
            return 1;
        }
        return (calculation(i-1)+calculation(i-2));
    }

}
