package com.sourceit.homework.andrey01.tasc10;

import java.util.Scanner;

/**
 * Created by Андрей on 11.02.2015.
 */
public class Equation {
    public static void main(String[] args) {
        Equation eq= new Equation();
        eq.getRootsEquation();
    }

    private void getRootsEquation() {
        System.out.println("Введите a");
        Scanner scanA= new Scanner(System.in);
        double a=scanA.nextDouble();

        System.out.println("Введите b");
        Scanner scanB= new Scanner(System.in);
        double b=scanB.nextDouble();

        System.out.println("Введите c");
        Scanner scanC= new Scanner(System.in);
        double c=scanC.nextDouble();

        double discriminant= (b*b)-(4* (a*c));
        System.out.println(discriminant);
        if(discriminant>0){
            double roots1= ((-b)-(Math.sqrt(discriminant)))/(2*a);
            double roots2= ((-b)+(Math.sqrt(discriminant)))/(2*a);
            System.out.println("roots1= "+ roots1);
            System.out.println("roots2= "+ roots2);
        }else{
            System.out.println("Корней нет");
        }

    }
}
