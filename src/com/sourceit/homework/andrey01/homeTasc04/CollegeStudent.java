package com.sourceit.homework.andrey01.homeTasc04;

/**
 * Created by Андрей on 13.02.2015.
 */
public class CollegeStudent extends Student {
    private int year;
    private String major;

    protected CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major){
        super(name, age, gender, idNumber, gpa);
        setYear(year);
        setMajor(major);
    }

    @Override
    public String toString() {
        return super.toString()+", year: "+getYear()+", major:"+getMajor();
    }

    public void setYear(int i){
        year=i;
    }
    public int getYear(){
        return year;
    }

    public void setMajor(String s){
        major= s;
    }
    public String getMajor(){
        return major;
    }
}
