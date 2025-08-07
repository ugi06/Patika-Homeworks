package workingarea.çetohomeworks.studentclass;

public class Student {

    private String name ;

    private String surname;

    private Integer studenId;

    private Integer age ;

    public Student(String name, String surname, Integer studenId, Integer age) {
        this.name = name;
        this.surname = surname;
        this.studenId = studenId;
        this.age = age;
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

    public Integer getStudenId() {
        return studenId;
    }

    public void setStudenId(Integer studenId) {
        this.studenId = studenId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studenId=" + studenId +
                ", age=" + age +
                '}';
    }
}
