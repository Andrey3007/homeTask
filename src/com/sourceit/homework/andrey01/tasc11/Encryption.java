package com.sourceit.homework.andrey01.tasc11;

import static java.lang.Integer.toUnsignedString;

/**
 * Created by Андрей on 11.02.2015.
 */
public class Encryption {
    public static void main(String[] args) {
        //int t=0B1101_0110_0011_1111_0100_0110;
        Person andrey= new Person();
        andrey.encoded= setAge(andrey.encoded,19 );
        andrey.encoded= setWeight(andrey.encoded, 60);
        andrey.encoded= setHeight(andrey.encoded,168 );
        System.out.println("Person Andrey:"+"\n"+"Age-     "+getAge(andrey.encoded)+"\n"+"Weight-  "
                +getWeight(andrey.encoded) +"\n"+"Height-  " + getHeight(andrey.encoded));
    }

    private static int setAge(int i, int b) {
        i=(i)|(b<<16);
        return i;
    }

    private static int setWeight(int i, int b) {
        i=(i)|(b<<8);
        return i;
    }

    private static int setHeight(int i, int b) {
        i=i|b;
        return i;
    }

    private static int getAge(int i) {
        int t=0b11111111;
        t=t<<16;
        t=i&t;
        t=t>>16;
        return t;
    }

    private static int getWeight(int i) {
        int t=0b11111111;
        t=t<<8;
        t=i&t;
        t=t>>8;
        return t;
    }

    private static int getHeight(int i) {
        int t=0b11111111;
         t=i&t;
        return t;
    }

}