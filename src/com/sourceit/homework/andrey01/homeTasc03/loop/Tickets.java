package com.sourceit.homework.andrey01.homeTasc03.loop;

import java.util.Scanner;

/**
 * Created by Андрей on 11.02.2015.
 */
public class Tickets {
    public static void main(String[] args) {
        int amount=0;
        for(int i=1;i<1_000_000; i++){
            int n=i;

            int m1=n%10;
            n/=10;
            int m2=n%10;
            n/=10;
            int m3=n%10;
            n/=10;
            int m4=n%10;
            n/=10;
            int m5=n%10;
            n/=10;
            int m6=n%10;

            if((m1+m2+m3)==(m4+m5+m6)){
                System.out.print(i+ "  "+ "\n");
                amount++;
            }
        }
        System.out.println("Всего счасливых билетов "+ amount);
    }
}
