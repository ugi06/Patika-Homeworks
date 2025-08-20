package week5.records;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        // Students List

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Isaac","Newton",643727);
        students.add(student1);

        Student student2 = new Student("Albert","Einstein",879955);
        students.add(student2);

        Student student3 = new Student("Galileo","Galilei",564642);
        students.add(student3);

        Student student4 = new Student("Charles","Darwin",809882);
        students.add(student4);

        Student student5 = new Student("Büyük","İskender",356323);
        students.add(student5);

        Student student6 = new Student("Büyük","İskender",356323);
        students.add(student6);

        // Student Set with unique element
        Set<Student> studentSet = new HashSet<>(students);

        // Display the students list
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("---------------------");

        // Display the students set
        for (Student student : studentSet) {
            System.out.println(student);
        }

        // equals() and hashcode() method example
        System.out.println(student1.equals(student4));

        System.out.println(student5.name().equals(student6.name()));

        System.out.println(student5.hashCode()== student6.hashCode());

        System.out.println(studentSet.hashCode());

    }
}