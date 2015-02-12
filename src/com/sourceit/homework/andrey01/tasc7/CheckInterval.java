package com.sourceit.homework.andrey01.tasc7;

/**
 * Created by Андрей on 11.02.2015.
 * •	Создать программу, которая будет проверять попало ли случайно выбранное из отрезка [5;155] целое число
 * в интервал (25;100) и сообщать результат на экран.
 */
public class CheckInterval {
    public static void main(String[] args) {
        int i=(int)((Math.random()*151)+5);
        System.out.println("Случайное число из отрезка [5;155] = "+i);

        if(i>25&&i<100){
            System.out.println("Число попало в отрезок (25;100) ");
        }else{
            System.out.println("Число не попало в отрезок (25;100) ");
        }
    }
}
