package week5.ınnerclasses;


// Outher Class
public class Employee {


    // Employee's fields
    private final String name;
    private final String surname;
    private final ContactInfo contactInfo;

    //Employee's constructor
    public Employee(String name, String surname, String jobTitle,String eMail,String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.contactInfo = new ContactInfo(eMail, phoneNumber);
    }

    // Inner Class
    static final class ContactInfo{

        //ContactInfo's fields
        private final String eMail;
        private final String phoneNumber;

        // ContactInfo's toString method
        @Override
        public String toString() {
            return "eMail='" + eMail + '\'' +
                    ", phoneNumber='" + phoneNumber;
        }
        // ContactInfo's constructor
        public ContactInfo(String eMail, String phoneNumber) {
            this.eMail = eMail;
            this.phoneNumber = phoneNumber;

        }
    }

    // Employee's toString method
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contactInfo=" + contactInfo;
    }

    // Main
    public static void main(String[] args) {

        Employee employee1 = new Employee("Uğur","Taşdelen","Backend Developer","ugurtasdelen1234@gmail.com","5346904018");
        System.out.println(employee1);

    }
}


