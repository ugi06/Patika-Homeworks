package week5.records;


// Student Record with three parameters : Name, Surname, Number
public record Student(String name, String surname, Integer number) {
    @Override
    public String toString() {
        return STR."Student / Name: '\{name}', Surname: '\{surname}', Number: \{number}";
    }

}
