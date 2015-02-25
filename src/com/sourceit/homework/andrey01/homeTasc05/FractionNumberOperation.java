package com.sourceit.homework.andrey01.homeTasc05;

import com.sourceit.hometask.basic.*;
import com.sourceit.hometask.basic.FractionNumber;

/**
 * Created by Андрей on 21.02.2015.
 */
public class FractionNumberOperation implements com.sourceit.hometask.basic.FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        com.sourceit.homework.andrey01.homeTasc05.FractionNumber fr =
                new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
        fr.divisor = fractionNumber.getDivisor() * fractionNumber1.getDivisor();
        fr.divident = ((fr.getDivisor() / fractionNumber.getDivisor()) * fractionNumber.getDividend())
                + ((fr.getDivisor() / fractionNumber1.getDivisor()) * fractionNumber1.getDividend());
        return fr;
    }

    @Override
    public FractionNumber sub(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        com.sourceit.homework.andrey01.homeTasc05.FractionNumber fr =
                new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
        fr.divisor = fractionNumber.getDivisor() * fractionNumber1.getDivisor();
        fr.divident = ((fr.getDivisor() / fractionNumber.getDivisor()) * fractionNumber.getDividend())
                - ((fr.getDivisor() / fractionNumber1.getDivisor()) * fractionNumber1.getDividend());
        return fr;
    }

    @Override
    public FractionNumber mul(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        com.sourceit.homework.andrey01.homeTasc05.FractionNumber fr =
                new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
        fr.divisor = fractionNumber.getDivisor() * fractionNumber1.getDivisor();
        fr.divident = fractionNumber.getDividend() * fractionNumber1.getDividend();
        return fr;
    }

    @Override
    public FractionNumber div(FractionNumber fractionNumber, FractionNumber fractionNumber1) {
        com.sourceit.homework.andrey01.homeTasc05.FractionNumber fr =
                new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
        fr.divisor = fractionNumber.getDivisor() * fractionNumber1.getDividend();
        fr.divident = fractionNumber.getDividend() * fractionNumber1.getDivisor();
        return fr;
    }

    @Override
    public FractionNumber parseFractionNumber(String s) {
        com.sourceit.homework.andrey01.homeTasc05.FractionNumber frac =
                new com.sourceit.homework.andrey01.homeTasc05.FractionNumber();
        if (s.indexOf("/") < 0) {
            frac.setDividend(Integer.parseInt(s));
            frac.setDivisor(frac.DEFAULT_DIVISOR_VALUE);
            return frac;
        } else {
            char[] chars = s.toCharArray();
            String s1 = "";
            String s2 = "";
            int i = 0;
            for (char c : chars) {
                for (; i == 0; ) {
                    if (c == '/') {
                        i = 1;
                        break;
                    }
                    s1 = s1 + c;
                    break;
                }
                for (; i == 1; ) {
                    if (c == '/') break;
                    s2 = s2 + c;
                    break;
                }
            }
            //System.out.println(s1);
            //System.out.println(s2);
            frac.setDividend(Integer.parseInt(s1));
            frac.setDivisor(Integer.parseInt(s2));
        }
        return frac;
    }
}
