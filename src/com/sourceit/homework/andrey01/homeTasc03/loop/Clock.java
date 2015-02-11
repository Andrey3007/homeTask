package com.sourceit.homework.andrey01.homeTasc03.loop;

/**
 * Created by Андрей on 11.02.2015.
 */
public class Clock {
    public static void main(String[] args) {
        int amount=0;
        for(int i=0;i<24;i++){
            for(int a=0;a<60; a++){

                int hour=i;
                int minute= a;

                int h1=hour%10;
                hour/=10;
                int h2=hour;

                int m1=minute%10;
                minute/=10;
                int m2=minute;

                String s1= Integer.toString(h1);
                String s2= Integer.toString(h2);
                String s3= Integer.toString(m1);
                String s4= Integer.toString(m2);


                if(((s1+s2).equals(s4+s3))){
                    System.out.print((s2+s1)+" "+(s4+s3)+" ");
                    System.out.println((s1+s2).equals(s4 + s3));
                    amount++;
                }
            }
        }
        System.out.println("Всего значений  "+amount);
    }
}
