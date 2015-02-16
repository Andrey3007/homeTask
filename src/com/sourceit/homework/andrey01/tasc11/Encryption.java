package com.sourceit.homework.andrey01.tasc11;

import static java.lang.Integer.toUnsignedString;

/**
 * Created by Андрей on 11.02.2015.
 * •	Создать класс, который будет хранить в одной целочисленной переменной несколько значений меньшей длины.
 * Например, возраст, вес, рост и год рождения. Добавить методы получения и добавления параметров отдельно.
 */
public class Encryption {
    long storeg;

    public void setAge(int i){
        setParam(i, 48);

    }
    public int getAge(){
        return getParam(48);
    }

    public void setParam(int newParam, int shift){
        long mask= 0xffff<<shift;
        mask= ~mask;
        storeg=storeg&mask;
        long l=((long)newParam)<<shift;
        storeg= storeg|l;

    }
    public int getParam(int shift){
        long i= (storeg>>>shift);
        int d= (int)(i & 0xFFFF);
        return d;
    }

    public void setWeigh(int i){
        setParam(i, 32);
    }
    public int getWeight(){
        return getParam(32);
    }

    public void setHigh(int i){
        setParam(i, 16);
    }
    public int getHigh(){
        return getParam(16);
    }

    public void setYear(int i){
        setParam(i, 0);

    }
    public int getYear(){
        return getParam(0);
    }


}