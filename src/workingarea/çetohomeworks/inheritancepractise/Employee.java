package workingarea.çetohomeworks.inheritancepractise;

public class Employee extends Person {

    private double salary;
    private String jobTitle;

    public Employee(String name, String surname, Integer age, String jobTitle, double salary) {
        super(name, surname, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "İsim: " + getName()+
                "\nSoyisim: " + getSurname()+
                "\nsalary: " + salary +
                "\njobTitle: " + jobTitle;
    }
}
