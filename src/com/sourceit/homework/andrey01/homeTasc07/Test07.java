package com.sourceit.homework.andrey01.homeTasc07;

import java.util.*;

/**
 * Created by Андрей on 25.02.2015.
 */
public class Test07 {
    public static void main(String[] args) {
        Integer a1 = 54, a2 = 23, a3 = 43, a4 = 47;
        Integer a5 = 32, a6 = 23, a7 = 47, a8 = 74;

        ArrayList arrayList1 = new ArrayList<Integer>();
        ArrayList arrayList2 = new ArrayList<Integer>();

        arrayList1.add(a1);
        arrayList1.add(a2);
        arrayList1.add(a3);
        arrayList1.add(a4);

        arrayList2.add(a5);
        arrayList2.add(a6);
        arrayList2.add(a7);
        arrayList2.add(a8);


        Part1 part1 = new Part1();                             // test implements interface CollectionUtils

        try {
            System.out.println(part1.union(arrayList1, arrayList2));     //run union
        } catch (NullPointerException a) {
            System.out.println(a.getMessage());
        }


        try {
            System.out.println(part1.intersection(arrayList1, arrayList2));   //run intersection
        } catch (NullPointerException a) {
            System.out.println(a.getMessage());
        }

        try {
            System.out.println(part1.unionWithoutDuplicates(arrayList1, arrayList2)); // run unionWithoutDuplicates
        } catch (NullPointerException a) {
            System.out.println(a.getMessage());
        }

        try {
            System.out.println(part1.intersectionWithoutDuplicates(arrayList1, arrayList2)); //run intWitDup
        } catch (NullPointerException a) {
            System.out.println(a.getMessage());
        }

        try {
            System.out.println(part1.difference(arrayList1, arrayList2)); //run difference
        } catch (NullPointerException a) {
            System.out.println(a.getMessage());
        }

        Part2 part2 = new Part2();    //test implements interface ListUtils
        try {
            System.out.println(part2.asList("ghdi", "fsdfs", "gdsfg", "gf"));         //run asList
        } catch (IllegalArgumentException a) {
            System.out.println(a.getMessage());
        }


        class Exanple implements Comparable {

            Date date = new Date();


            @Override
            public int compareTo(Object o) {
                if (o instanceof Comparable) {
                    Exanple i = (Exanple) o;
                    return date.compareTo(i.date);
                }
                return 0;
            }

            @Override
            public String toString() {
                return "Exanple{" +
                        "date=" + date +
                        '}';
            }
        }

        ArrayList arLisPart2 = new ArrayList();
        Exanple b = new Exanple();
        Exanple b1 = new Exanple();
        Exanple b2 = new Exanple();

        arLisPart2.add(b);
        arLisPart2.add(b1);
        arLisPart2.add(b2);

        try {
            System.out.println(part2.sortedList(arLisPart2));         //run sortedList
        } catch (IllegalArgumentException a) {
            System.out.println(a.getMessage());
        }




        Part3 part3 = new Part3();                //test implements interface SetUtils
        Set<String> set = new LinkedHashSet<>();
        set.add("a");
        set.add("b");

        set.add("d");
        set.add("c");
        try {
            System.out.println(part3.orderedSet(arrayList1, set));              //run orderedSet
        } catch (NullPointerException a) {
            System.out.println(a.getMessage());
        }


        try{
            System.out.println(part3.customOrderSet(a1,a2,a3,a4));  //run customOrderSet
        }catch (NullPointerException a){
            System.out.println(a.getMessage());
        }




        Part4 part4= new Part4();           //test implements interface MultiValueMap
        try{
            part4.put("d", 5);                       //run MultiValueMap
            part4.put("d", 4);
            System.out.println(part4.size());
            System.out.println(part4.getCountValues("d"));
            System.out.println(part4.entrySet());
        }catch (NullPointerException a){
            System.out.println(a.getMessage());
        }

    }
}
