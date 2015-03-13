package com.sourceit.homework.andrey01.homeTasc07;

import com.sourceit.hometask.collections.SetUtils;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

/**
 * Created by Андрей on 25.02.2015.
 */
public class Part3 implements SetUtils {



    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection, Set<String> set) throws NullPointerException {
        if(collection.size()!=set.size()) return null;
        if(collection==null) throw new NullPointerException("collection are null");
        if(set==null) throw new NullPointerException("set2 are null");


        System.out.println(set);
        System.out.println(collection);



        TreeMap<String, Integer> map= new TreeMap<>();



        for(int i=0; i<set.size(); i++){
            map.put((String)set.toArray()[i],(Integer) collection.toArray()[i]);
        }

        TreeSet<String> treeSet= new TreeSet(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                return map.get(o1)-map.get(o2);
            }
        });

        treeSet.addAll(set);

        return treeSet;



    }

    @Override
    public Set<Integer> customOrderSet(Integer... integers) throws NullPointerException {
        if(integers==null) throw new NullPointerException("one of the set arguments is null");

        TreeSet<Integer> treeSet= new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i2= (Integer)o2;
                Integer i1= (Integer)o1;
                return i2-i1;
            }
        });
        for(Integer x: integers){
            treeSet.add(x);
        }

        return treeSet;
    }
}
