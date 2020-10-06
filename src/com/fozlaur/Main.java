package com.fozlaur;

import model.Student;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(
                "Peter Cullen",79,"Male",19840001
        ));

        students.add(new Student(
                "Frank Welker",74,"Male",19840002
        ));

        for(int i=0;i<students.size(); i++){
            int j = i+1;
            System.out.println("STUDENT #"+j);
            students.get(i).displayStudentData();
        }
    }
}
