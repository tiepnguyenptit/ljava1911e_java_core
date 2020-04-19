package application.buoi4;

import application.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.setStudentCode("123");
//        student.setName("ABC");
//        student.setClassName("CNTT1");
//        System.out.println(student.getStudentCode());
//        System.out.println(student.getName());
//        System.out.println(student.getClassName());

        List<Student> studentList = new ArrayList<>();
        Student a = new Student("123", "ABC", "CNTT1");
        Student b = new Student("123", "ABC", "CNTT1");
        System.out.println(a.equals(b));
//        studentList.add(a);
//        studentList.forEach(student -> {
//            System.out.println(student);
//        });


    }

}
