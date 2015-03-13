package com.sourceit.homework.andrey01.homeTasc07;

import com.sourceit.hometask.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Андрей on 25.02.2015.
 */
public class Part1 implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> collection,
                                     Collection<Integer> collection1) throws NullPointerException {
        if(collection==null) throw new NullPointerException("collection= null");
        if(collection1==null) throw new NullPointerException("collection1= null");
        ArrayList ar= new ArrayList<Integer>();
        ar.addAll(collection);
        ar.addAll(collection1);
        return ar;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> collection,
                                            Collection<Integer> collection1) throws NullPointerException {
        if(collection==null) throw new NullPointerException("collection= null");
        if(collection1==null) throw new NullPointerException("collection1= null");

        ArrayList ar= new ArrayList<Integer>();
        if(collection.size()<=collection1.size()){
            for(Integer x: collection){
                for(Integer y: collection1){
                    if(x==y){
                        ar.add(x);
                        ar.add(y);
                    }
                }
            }
            return ar;
        }else{
            for(Integer x: collection1){
                for(Integer y: collection){
                    if(x==y){
                        ar.add(x);
                        ar.add(y);
                    }
                }
            }
            return ar;

        }
    }

    @Override
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> collection,
                                               Collection<Integer> collection1) throws NullPointerException {
        if(collection==null) throw new NullPointerException("collection= null");
        if(collection1==null) throw new NullPointerException("collection1= null");
        HashSet<Integer> set= new HashSet<>();
        set.addAll(collection);
        set.addAll(collection1);
        return set;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> collection,
                                                      Collection<Integer> collection1) throws NullPointerException {
        if(collection==null) throw new NullPointerException("collection= null");
        if(collection1==null) throw new NullPointerException("collection1= null");

        HashSet<Integer> ar= new HashSet<>();
        if(collection.size()<=collection1.size()){
            for(Integer x: collection){
                for(Integer y: collection1){
                    if(x==y){
                        ar.add(x);
                    }
                }
            }
            return ar;
        }else{
            for(Integer x: collection1){
                for(Integer y: collection){
                    if(x==y){
                        ar.add(x);
                    }
                }
            }
            return ar;

        }
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> collection,
                                          Collection<Integer> collection1) throws NullPointerException {
        if(collection==null) throw new NullPointerException("collection= null");
        if(collection1==null) throw new NullPointerException("collection1= null");

        ArrayList<Integer> ar= new ArrayList<>();

        for(Integer x: collection){
            int i= collection1.size();
            for(Integer y: collection1){
                if(x!=y){
                    i--;
                }
                if(i==0){
                    ar.add(x);
                }
            }
        }
        for(Integer x: collection1){
            int i= collection.size();
            for(Integer y: collection){
                if(x!=y){
                    i--;
                }
                if(i==0){
                    ar.add(x);
                }
            }
        }
        return ar;
    }
}
