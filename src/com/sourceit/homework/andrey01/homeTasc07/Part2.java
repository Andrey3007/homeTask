package com.sourceit.homework.andrey01.homeTasc07;

import com.sourceit.hometask.collections.ListUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Андрей on 25.02.2015.
 */
public class Part2 implements ListUtils {
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        ArrayList<String> ar= new ArrayList<>();
        for(String x: strings){
            if(x.equals("null")){
                throw new IllegalArgumentException("one of the set arguments is null");
            }else {
                ar.add(x);
            }

        }
        return ar;
    }

    @Override
    public <T extends Comparable<T>> List<T> sortedList(List<T> list) throws IllegalArgumentException {
      Comparable [] a= new Comparable[list.size()];
        for(int i=0; i<list.size(); i++){
            a[i]= (Comparable) list.toArray()[i];
        }

        Arrays.sort(a);
        ArrayList ar= new ArrayList();
        for(int i=0; i<a.length; i++){
            ar.add(a[i]);
        }

        return ar;
    }
}
