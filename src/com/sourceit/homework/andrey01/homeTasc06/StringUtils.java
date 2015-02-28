package com.sourceit.homework.andrey01.homeTasc06;

import com.sourceit.hometask.exceptions.CustomException;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Андрей on 22.02.2015.
 */
public class StringUtils implements com.sourceit.hometask.exceptions.StringUtils {
    @Override
    public double div(String s, String s1) throws NullPointerException, NumberFormatException, ArithmeticException {
        String s2 = "null";
        if (s2.equals(s)) throw new NullPointerException("NullPointerException: number1 are equal null");
        if (s2.equals(s1)) throw new NullPointerException("NullPointerException: number2 are equal null");
        double i = (Double.parseDouble(s));
        double k = (Double.parseDouble(s1));
        if (k == 0) throw new ArithmeticException("ArithmeticException: divisor are equal 0");
        return i / k;
    }

    @Override
    public int[] findWord(String s, String s1) throws NullPointerException {
        String s2 = "null";
        if (s2.equals(s)) throw new NullPointerException("NullPointerException: s= null");
        if (s2.equals(s1)) throw new NullPointerException("NullPointerException: s1= null");
        ArrayList list = new ArrayList<Integer>();
        int m = 0;
        int t = 0;
        for (; true; ) {
            if ((-1) == (s.indexOf(s1, t))) {
                break;
            } else {
                list.add(s.indexOf(s1, t));
                t = ((int) ((list.toArray())[m])) + 1;
            }
            m++;
        }
        if ((list.toArray()).length == 0) throw new NullPointerException("NullPointerException: " +
                "there is no occurrence of finding word");
        int[] a = new int[(list.toArray()).length];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((list.toArray())[i]);
        }
        return a;
    }

    @Override
    public double[] findNumbers(String s) throws CustomException {
        StringBuilder sb = new StringBuilder(s);
        ArrayList list = new ArrayList<Double>();
        for (; ; ) {
            Scanner scanner = new Scanner(String.valueOf(sb));
            if (scanner.hasNextDouble()) {
                list.add(scanner.nextDouble());
                double d = ((double) ((list.toArray())[((list.toArray()).length) - 1]));
                String snr = String.valueOf(d);
                int i = snr.length();
                sb = sb.delete(0, i);
            }
            sb = sb.delete(0, 1);

            if (scanner.hasNext() == false) {
                break;
            }

        }
        double[] db = new double[((list.toArray()).length)];
        for (int r = 0; r < ((list.toArray()).length); r++) {
            db[r] = ((double) ((list.toArray())[r]));
        }
        if(list.toArray().length==0) throw new CustomException("no double value was found in the text");
        return db;
    }
}
