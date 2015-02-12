package com.sourceit.homework.andrey01.homeTasc03.recursion;
import java.util.Stack;
/**
 * Created by Андрей on 12.02.2015.
 * •	Имеется три стержня, на один из которых нанизаны N колец, причем кольца отличаются размером и лежат меньшее
 * на большем. Требуется перенести пирамиду из N колец с одного стержня на другой за наименьшее число ходов. За один
 * раз разрешается переносить только одно кольцо, причём нельзя класть большее кольцо на меньшее.
 */
public class Tasc4 {
    public static void main(String[] args) {
        Stack sterj1= new Stack();
        Stack sterj2= new Stack();
        Stack sterj3= new Stack();

        for(int i=10;i>0;i--){
            sterj1.push(i);
        }
        //System.out.print(sterj1);

    }
}
