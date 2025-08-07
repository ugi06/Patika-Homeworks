package workingarea.stutdentsscoolsysteam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        //

        Student[] students = new Student[3];

        Student student1 = new Student("Uğur","Taşdelen",101);

        Student student2 = new Student("Sabito","Şenşen",102);

        Student student3 = new Student("Roka","Taşdelen",001);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        //

        Teacher[] teachers = new Teacher[3];

        Teacher mathTeacher = new Teacher("Fındık","Fıstık","5346904018");

        Teacher pysicosTeacher = new Teacher("oooooo","karamelli","5323290401");

        Teacher englishTeacher = new Teacher("yastık","vooooo","5323304018");

        teachers[0] = mathTeacher;
        teachers[1] = pysicosTeacher;
        teachers[2] = englishTeacher;

        //

        Course[] courses = new Course[3];

        Course math = new Course("Matematik",10,55);

        Course pysico = new Course("Fizik",6,55);

        Course english = new Course("İngilizce",4,50);

        courses[0] = math;
        courses[1] = pysico;
        courses[2] = english;


        //
        mathTeacher.setCourse(math);
        pysicosTeacher.setCourse(pysico);
        englishTeacher.setCourse(english);


        //

        math.setTeacher(mathTeacher);
        pysico.setTeacher(pysicosTeacher);
        english.setTeacher(englishTeacher);


        //

        student1.setCourses(courses);
        student2.setCourses(courses);
        student3.setCourses(courses);



        for (Student student : students){
            System.out.println(student);
        }

        for (Course course : courses){
            System.out.println(course);
        }

        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }





    }

}
