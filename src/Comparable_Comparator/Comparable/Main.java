package Comparable_Comparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();


        studentList.add(new Student("hiep",20,"nam dinh"));
        studentList.add(new Student("tu",30,"ha nam"));
        studentList.add(new Student("vu",18,"bac ninh"));
        studentList.add(new Student("thanh",25,"thanh hoa"));

        System.out.println("Before: ");
        for(Student student: studentList){
            System.out.println(student.toString());
        }

        System.out.println("After:  ");
        Collections.sort(studentList);
        for(Student student: studentList){
            System.out.println(student.toString());
        }


    }
}
