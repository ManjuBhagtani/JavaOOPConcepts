package OOP.polymorphism.UpDownCasting;

public class Main {
    public static void main(String[] args) {
        Animal animalDog = new Dog(); //upcasting, implicit casting
        animalDog.eats();
        animalDog.breathes();

        //Dog dogAnimal = (Dog)new Animal(); //downcasting, explicit casting. Runtime error on this line itself.
        //dogAnimal.eats();
        //dogAnimal.breathes();
        //dogAnimal.bark();
    }
}
