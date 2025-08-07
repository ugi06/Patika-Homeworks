package workingarea.çetohomeworks.animal;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
            new Cat("Roka"),
                new Dog("Asi")
        };

        for(Animal animal : animals){
            animal.makeSound();
        }
    }
}
