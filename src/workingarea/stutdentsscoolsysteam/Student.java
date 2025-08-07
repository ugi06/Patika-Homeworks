package workingarea.stutdentsscoolsysteam;


import java.util.Arrays;

public class Student {

    private String name;

    private String surname;

    private Integer studentNo;

    private Course[] courses = new Course[3];


    public Student(String name, String surname, Integer studentNo) {
        this.name = name;
        this.surname = surname;
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(Integer studentNo) {
        this.studentNo = studentNo;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentNo=" + studentNo +
                '}';
    }
}
