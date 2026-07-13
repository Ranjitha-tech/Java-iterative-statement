public class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks loudly.");
    }
}

public class AnimalShelterUpcasting {

    public static void main(String[] args) {

        Animal animal = new Dog(); // Upcasting

        animal.makeSound();
    }
} {
    
}
