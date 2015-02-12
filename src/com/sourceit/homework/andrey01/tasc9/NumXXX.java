package com.sourceit.homework.andrey01.tasc9;

/**
 * Created by Андрей on 11.02.2015.
 * •	Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число
 * и его наибольшую цифру.
 */
public class NumXXX {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int i=(int)((Math.random()*900)+100);
        System.out.println(i);

        n3= i%10;
        n2=(i/10)%10;
        n1=((i/10)/10)%10;


        if(n1>=n2&&n1>=n3){
            System.out.println("Самая большая цифра в числе это  "+n1);
        }else{
            if(n2>=n1&&n2>=n3){
                System.out.println("Самая большая цифра в числе это  "+n2);
            }else{
                System.out.println("Самая большая цифра в числе это  "+n3);
            }
        }
    }
}
