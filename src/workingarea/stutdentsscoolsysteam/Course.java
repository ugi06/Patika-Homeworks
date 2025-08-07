package workingarea.stutdentsscoolsysteam;

public class Course {

    private String id;

    private Integer note;

    private Integer weeklyHour;

    private Teacher teacher;


    public Course(String id, Integer weeklyHour, Integer note) {
        this.id = id;
        this.weeklyHour = weeklyHour;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Teacher getTeacher(Teacher teacher) {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getWeeklyHour() {
        return weeklyHour;
    }

    public void setWeeklyHour(Integer weeklyHour) {
        this.weeklyHour = weeklyHour;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", note=" + note +
                ", weeklyHour=" + weeklyHour +
                '}';
    }
}
