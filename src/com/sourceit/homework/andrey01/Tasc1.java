package com.sourceit.homework.andrey01;

/**
 * Created by Андрей on 10.02.2015.
 * •	Создать класс, который содержит int и char (не проинициализированные) и распечатать их значения.
 * Замечания:  - The idea of the task was to create fields (variables in a class) not
 *                  the local variables (variables in a method).
 */
public class Tasc1 {
    static int a;           //Я тут исправил. Поставил переменные в статические поля класса.
    static char d;
    public static void main(String[] args){
        System.out.print(a);
        System.out.print(d);
        //System.out.print("Их нельзя напечатать");
    }
}
