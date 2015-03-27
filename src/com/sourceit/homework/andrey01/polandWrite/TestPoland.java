package com.sourceit.homework.andrey01.polandWrite;

import java.util.Scanner;

/**
 * Created by Андрей on 26.03.2015.
 */
public class TestPoland {
    public static void main(String[] args) {
        Poland poland = new Poland();
        Scanner scanner= new Scanner(System.in);
        String expr= scanner.nextLine();
        System.out.println(poland.fullPoland(expr));

    }
}
