package com.sourceit.homework.andrey01.homeTasc06;

import com.sourceit.hometask.exceptions.CustomException;

/**
 * Created by Андрей on 22.02.2015.
 */
public class TestTH6 {
    public static void main(String[] args) throws CustomException {
        StringUtils stringUtils = new StringUtils();
        try {
            System.out.println(stringUtils.div("7", "2"));
        } catch (NullPointerException a) {
            System.out.println("NullPointerException: number1 or number2 are equal null");
        } catch (NumberFormatException a) {
            System.out.println("NumberFormatException:  number1 or number2 are not a numbers");
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException:  number2 is equal 0");
        }

        String s1 = "3 ter ret tre ert ter";
        String s2 = "ter";
        try {
            int[] a;
            a = stringUtils.findWord(s1, s2);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        } catch (NullPointerException q) {
            System.out.println("text or word are equal null, or there is no occurrence of finding word");
        }



        System.out.println();

        try {
            for(int i=0; i<(stringUtils.findNumbers("5,9 g 4,7 hh 46,678")).length; i++){
                System.out.print(stringUtils.findNumbers("5,9 g 4,7 hh 46,678")[i]+"  ");
            }
        }catch (CustomException a){
            System.out.println("no double value was found in the text");
        }
    }
}
