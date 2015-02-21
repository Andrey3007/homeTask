package com.sourceit.homework.andrey01.homeTasc05;

import com.sourceit.hometask.basic.FractionNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Андрей on 21.02.2015.
 */
public class Test {
    public static void main(String[] args) {
        FractionNumber fractionNumber= new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
        fractionNumber.setDivisor(2);
        fractionNumber.setDividend(1);
        System.out.println(fractionNumber.toString());
        System.out.println(fractionNumber.doubleValue());

        FractionNumber fractionNumber2 = new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
        fractionNumber2.setDivisor(8);
        fractionNumber2.setDividend(2);
        System.out.println(fractionNumber2.toString());
        System.out.println(fractionNumber2.doubleValue());

        FractionNumberOperation fract= new FractionNumberOperation();
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
    }
}
