package com.sourceit.homework.andrey01.homeTasc04;

/**
 * Created by Андрей on 13.02.2015.
 */
public class TestingHT4 {
    public static void main(String[] args) {
        Person person = new Person("Coach Bob", 27, "M");
        System.out.println(person.toString());

        Teacher teacher = new Teacher("Duke Java", 34, "M", 50000.0, "Computer Science");
        System.out.println(teacher.toString());

        Student student= new Student("Lynne Brooke", 16, "F", "HS95129",  3.5);
        System.out.println(student.toString());

        CollegeStudent collegeStudent= new CollegeStudent("Ima Frosh", 18, "F", "UCB123",  4.0, 1,  "English");
        System.out.println(collegeStudent.toString());
    }
}
