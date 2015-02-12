package com.sourceit.homework.andrey01.tasc2;

/**
 * Created by Андрей on 10.02.2015.
 * •	Создать класс Dog, который будет содержать 2 поля name и says. В main( ) создать 2 экземпляра класса
 * с name “spot” (says, “Ruff!”) и “scruffy” (says, “Wurf!”). И распечатать поля объектов.
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog2.name= "spot";
        dog2.says= "Ruff!";

        dog1.name= "scruffy";
        dog1.says= "Wurf!";

        System.out.println("dog2.name = " +dog2.name +"   and says = " + dog2.says);
        System.out.print("dog1.name = " +dog1.name+ "   and says = " + dog1.says);
    }
}
