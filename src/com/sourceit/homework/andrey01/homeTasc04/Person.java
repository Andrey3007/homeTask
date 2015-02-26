package com.sourceit.homework.andrey01.homeTasc04;

/**
 * Created by Андрей on 13.02.2015.
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    protected Person(String name, int age, String gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName(){

        return name;
    }
    public void setName(String s){
        name=s;
    }

    public void setAge (int i){
        age=i;
    }
    public int getAge(){
        return age;
    }

    public void setGender(String s){
        gender= s;
    }
    public String getGender(){
        return gender;
    }

    public String toString(){
        String s3=getName()+", age: "+getAge()+", gender: "+getGender();
        return s3;
    }
}
