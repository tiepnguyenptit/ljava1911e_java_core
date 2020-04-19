package application.model;

import java.util.Objects;

public class Student {

    private String studentCode;
    private String name;
    private String className;

    public Student() {
    }

    public Student(String studentCode, String name, String className) {
        this.studentCode = studentCode;
        this.name = name;
        this.className = className;
    }

    public Student(String studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentCode, student.studentCode) &&
                Objects.equals(name, student.name) &&
                Objects.equals(className, student.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentCode, name, className);
    }


}
