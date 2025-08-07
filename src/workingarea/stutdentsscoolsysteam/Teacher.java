package workingarea.stutdentsscoolsysteam;

public class Teacher {

    private String name;

    private String surname;

    private String phoneNo;

    private Course course;

    public Teacher(String name, String surname, String phoneNo) {
        this.name = name;
        this.surname = surname;
        this.phoneNo = phoneNo;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
