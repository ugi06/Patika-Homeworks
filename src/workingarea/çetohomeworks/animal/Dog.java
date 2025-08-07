package workingarea.çetohomeworks.animal;

public class Dog extends Animal{


    public Dog(String name){
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName()+ " Hav Hav dedi.");
    }

}
