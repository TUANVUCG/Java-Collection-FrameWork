package Comparable_Comparator.Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("hiep",20,"nam dinh"));
        studentList.add(new Student("tu",30,"ha nam"));
        studentList.add(new Student("vu",27,"bac ninh"));
        studentList.add(new Student("thanh",24,"thanh hoa"));

        System.out.println("Before : ");
        for(Student student : studentList){
            System.out.println(student.toString());
        }


        System.out.println("After : ");
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Student student : studentList){
            System.out.println(student.toString());
        }

        // Sap xep theo tuoi
        System.out.println("Compare by age : ");
        Collections.sort(studentList,new MyCompare());
            for(Student student : studentList){
                System.out.println(student.toString());
            }
        }
    }

class MyCompare implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()>o2.getAge()){
            return -1;
        }else if(o1.getAge()<o2.getAge()){
            return 1;
        }else {
            return 0;
        }
    }
}
