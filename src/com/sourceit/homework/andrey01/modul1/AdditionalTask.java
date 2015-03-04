package com.sourceit.homework.andrey01.modul1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Андрей on 03.03.2015.
 */
public class AdditionalTask {
    private String s1;
    private String s2;
    ArrayList<String> arrayList= new ArrayList();

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }


    public void enterString(){
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        setS1(s);
    }


    public void processTheData(){
        System.out.println("To process the data...");
        s1= getS1();
        String[] str= s1.split(" ");
        for(int y=0; y<str.length; y++){
            str[y]=str[y].replaceAll("\\.","");
        }
        for(int t= 0; t< str.length-1; t++){
            if(str[t].length()>str[t+1].length()){
                String tmp= str[t+1];
                str[t+1]=str[t];
                str[t]= tmp;
            }
        }
        s2= str[str.length-1];
    }


    public void save(){
        System.out.println("save...");
        arrayList.add(s2);
    }

    public void seeLast(){
        System.out.println("The last result:");
        System.out.println(s2);
    }

    public void seeAll(){
        System.out.println("All result:");
        System.out.println(arrayList.toString());
    }

    public void exit(){
        System.out.println("Exit");
    }
}
