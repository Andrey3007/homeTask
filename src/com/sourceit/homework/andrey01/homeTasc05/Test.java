package com.sourceit.homework.andrey01.homeTasc05;

import com.sourceit.hometask.basic.FractionNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Андрей on 21.02.2015.
 */
public class Test {
    public static void main(String[] args) {
        FractionNumber fractionNumber = new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
        fractionNumber.setDivisor(2);
        fractionNumber.setDividend(1);
        System.out.println(fractionNumber.toString());
        System.out.println(fractionNumber.doubleValue());

        FractionNumber fractionNumber2 = new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
        fractionNumber2.setDivisor(8);
        fractionNumber2.setDividend(2);
        System.out.println(fractionNumber2.toString());
        System.out.println(fractionNumber2.doubleValue());

        FractionNumberOperation fract = new FractionNumberOperation();
        System.out.println(fract.add(fractionNumber, fractionNumber2).toString());
        System.out.println(fract.add(fractionNumber, fractionNumber2).doubleValue());

        System.out.println(fract.sub(fractionNumber, fractionNumber2).toString());
        System.out.println(fract.sub(fractionNumber, fractionNumber2).doubleValue());

        System.out.println(fract.mul(fractionNumber, fractionNumber2).toString());
        System.out.println(fract.mul(fractionNumber, fractionNumber2).doubleValue());

        System.out.println(fract.div(fractionNumber, fractionNumber2).toString());
        System.out.println(fract.div(fractionNumber, fractionNumber2).doubleValue());


        System.out.println((fract.parseFractionNumber("32")).toString());
        System.out.println((fract.parseFractionNumber("32")).doubleValue());

        System.out.println((fract.parseFractionNumber("32/34")).toString());
        System.out.println((fract.parseFractionNumber("32/34")).doubleValue());

        System.out.println(fractionNumber.compareTo(fractionNumber2));
        System.out.println(fractionNumber.compareTo(fractionNumber));
        System.out.println(fractionNumber2.compareTo(fractionNumber));

        Test test= new Test();

        test.bubbleSort(test.arrayFillIn());

    }

    public void bubbleSort(com.sourceit.homework.andrey01.homeTasc05.FractionNumber[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].doubleValue() > arr[j + 1].doubleValue()) {
                    com.sourceit.homework.andrey01.homeTasc05.FractionNumber tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            System.out.print(arr[i].doubleValue()+"  ");
        }
        System.out.print(arr[0].doubleValue()+"  ");

    }

    public com.sourceit.homework.andrey01.homeTasc05.FractionNumber[] arrayFillIn(){
        com.sourceit.homework.andrey01.homeTasc05.FractionNumber[] a=
                new com.sourceit.homework.andrey01.homeTasc05.FractionNumber[5];
        for(int i = a.length -1; i > -1; i--){
            String s= "i";
            com.sourceit.homework.andrey01.homeTasc05.FractionNumber r=
                    new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
            r.setDivisor(((int)(((Math.random()*(1000))-500))));
            if (r.getDivisor()==0) r.setDivisor(1);
            r.setDividend(((int)((Math.random()*1000)-500)));
            a[i]=r;
            System.out.print(r.doubleValue() + "  ");
        }
        System.out.println();
        return a;
    }

}
