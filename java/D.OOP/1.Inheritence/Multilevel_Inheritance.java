// 1. Base Class (Grandparent)
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// 2. Intermediate Derived Class (Parent)
// Mammal inherits from Animal
class Mammal extends Animal {
    void sleep() {
        System.out.println("Mammal is sleeping.");
    }
}

// 3. Final Derived Class (Child)
// Dog inherits from Mammal, gaining features of both Mammal and Animal
class Dog extends Mammal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Main class to test the inheritance
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the final derived class
        Dog myDog = new Dog();

        // Accessing a method from the Dog class itself
        myDog.bark();

        // Accessing a method inherited from the Mammal class
        myDog.sleep();

        // Accessing a method inherited from the Animal class
        myDog.eat();
    }
}