package com.sourceit.homework.andrey01.tasc11;

/**
 * Created by Андрей on 11.02.2015.
 */
public class Person {
    public static void main(String[] args) {
        Encryption pers= new Encryption();
        pers.setYear(1995);
        pers.setAge(20);
        pers.setWeigh(68);
        pers.setHigh(168);
        System.out.println(pers.getYear());
        System.out.println(pers.getAge());
        System.out.println(pers.getWeight());
        System.out.println(pers.getHigh());

    }
}
