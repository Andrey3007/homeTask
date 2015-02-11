package com.sourceit.homework.andrey01.tasc8;

import java.util.Scanner;

/**
 * Created by Андрей on 11.02.2015.
 */
public class Triangle {
    static double cathetusA;
    static double cathetusB;
    public static void main(String[] args) {


        Triangle triangle= new Triangle();
        triangle.cathetusA = setCathetus_a();
        triangle.cathetusB= setCathetus_b();
        triangle.getArea(cathetusA,cathetusB );
        triangle.getPerimeter(cathetusA,cathetusB);
    }

    private void getPerimeter(double a, double b) {
        double hypotenuse = Math.sqrt((a*a)+(b*b));
        System.out.println("периметр треугольника = "+(hypotenuse+a+b));
    }

    private static void getArea(double a, double b) {
        double area= (a*b)/2;
        System.out.println("Площадь треугольника = " +(area));
    }

    private static double setCathetus_b() {
        System.out.println("Введите значение второго катета");
        Scanner scan= new Scanner(System.in);
        double x= scan.nextDouble();
        return x;
    }

    private static double setCathetus_a() {
        System.out.println("Введите значение первого катета");
        Scanner scan= new Scanner(System.in);
        double x= scan.nextDouble();
        return x;
    }
}
