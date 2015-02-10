package com.sourceit.homework.andrey01.tasc3;
import java.io.*;
/**
 * Created by Андрей on 10.02.2015.
 */
public class checking {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число для проверки на четность");

        BufferedReader number= new BufferedReader(new InputStreamReader(System.in));
        char i= (char) number.read();

        int d= i;
        if(d%2==0) {
            System.out.print("Число четно");
        }else{
            System.out.print("Число не четное");
        }
    }
}
