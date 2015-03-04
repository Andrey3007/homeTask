package com.sourceit.homework.andrey01.modul1;

import java.util.Scanner;

/**
 * Created by Андрей on 03.03.2015.
 */
public class TestModul {
    public static void main(String[] args) {
        AdditionalTask ad = new AdditionalTask();
        int i;

        do {
            System.out.println("1 - To enter the string\n" +
                    "2 - To process the data\n" +
                    "3 - To save last calculation\n" +
                    "4 - To see last result\n" +
                    "5 - To see all saved results\n" +
                    "6 - Print available commands\n" +
                    "\n" +
                    "0 - Exit"+"\n");
            System.out.println("Please, enter your choice:");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();

            switch (i) {
                case 0:
                    ad.exit();
                    break;
                case 1:
                    ad.enterString();
                    break;
                case 2:
                    ad.processTheData();
                    break;
                case 3:
                    ad.save();
                    break;
                case 4:
                    ad.seeLast();
                    break;
                case 5:
                    ad.seeAll();
                    break;
                case 6:
                    System.out.println("Menu:");
                    break;


            }
            if(i==0)break;
        } while (true);


    }
}
