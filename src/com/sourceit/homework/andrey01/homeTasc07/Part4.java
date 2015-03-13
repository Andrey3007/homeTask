package com.sourceit.homework.andrey01.homeTasc07;

import com.sourceit.hometask.collections.MultiValueMap;

import java.util.*;

/**
 * Created by Андрей on 25.02.2015.
 */
public class Part4<K,V> implements MultiValueMap{

    HashMap<Object,List> hashMap= new HashMap();



    @Override
    public int getCountValues(Object o) {
        return (hashMap.get(o).size());
    }


    @Override
    public Object get(Object o) {
        return hashMap.get(o).get(hashMap.size());
    }

    @Override
    public Object remove(Object o) {

        return null;
    }

    @Override
    public Iterator getIterator(Object o) {
        return hashMap.get(o).iterator();
    }





    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return hashMap.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return hashMap.containsValue(value);
    }



    @Override
    public Object put(Object key, Object value) {
        List list= new ArrayList<>();

        if(hashMap.get(key)==null){
            list.add(value);
        }else{
            list.addAll(hashMap.get(key));
            list.add(value);
        }
        hashMap.put(key, list);
        return list;
    }





    @Override
    public void putAll(Map m) {
        hashMap.putAll(m);
    }

    @Override
    public void clear() {
        hashMap.clear();
    }

    @Override
    public Set keySet() {
        return hashMap.keySet();
    }

    @Override
    public Collection values() {
        return hashMap.values();
    }

    @Override
    public Set<Entry<Object, List>> entrySet() {
        return hashMap.entrySet();
    }
}
