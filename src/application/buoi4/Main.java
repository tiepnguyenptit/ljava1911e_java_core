package application.buoi4;

import application.model.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.setStudentCode("123");
//        student.setName("ABC");
//        student.setClassName("CNTT1");
//        System.out.println(student.getStudentCode());
//        System.out.println(student.getName());
//        System.out.println(student.getClassName());

//        List<Student> studentList = new ArrayList<>();
        Set<Student> studentSet = new HashSet<>();
        Student a = new Student("123", "ABC", "CNTT1");
        Student b = new Student("123", "ABC", "CNTT1");
        Student c = new Student("123", "ABC", "CNTT1");
//        studentSet.add(a);
//        studentSet.add(b);
//        studentSet.add(c);
//        for(Student s: studentSet){
//            System.out.println(s);
//        }
//        studentList.add(a);
//        System.out.println(studentList.contains(b));
//        System.out.println(a.equals(b));
//        studentList.add(a);
//        studentList.forEach(student -> {
//            System.out.println(student);
//        });
        int s = 4;
        int[] arr = {1, 2, 2,100};
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] <= s && map.get(s-arr[i]) !=0) {
                flag = true;
                break;
            }
            map.put(arr[i], map.get(arr[i]) + 1);
        }
        if(flag == true) {
            System.out.println("YES");
        } else System.out.println("NO");

    }

}
