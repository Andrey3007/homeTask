package com.sourceit.homework.andrey01.homeTasc06;

import com.sourceit.hometask.exceptions.CustomException;

/**
 * Created by Андрей on 22.02.2015.
 */
public class TestTH6 {
    public static void main(String[] args) throws CustomException {
        StringUtils stringUtils = new StringUtils();
        try {
            System.out.println(stringUtils.div("5", "2"));
        } catch (NullPointerException a) {
            System.out.println(a.getMessage());
        } catch (NumberFormatException a) {
            System.out.println("NumberFormatException:  number1 or number2 are not a numbers");
        } catch (ArithmeticException a) {
            System.out.println(a.getMessage());
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
            System.out.println(q.getMessage());
        }



        System.out.println();
        String s3= " ";
        String s4= "5,9 g 4,7 hh 46,678";
        try {
            for(int i=0; i<(stringUtils.findNumbers(s3)).length; i++){
                System.out.print(stringUtils.findNumbers(s3)[i]+"  ");
            }
        }catch (CustomException a){
            System.out.println(a.getMessage());
        }
    }
}
