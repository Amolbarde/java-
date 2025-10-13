abstract class Animal {
    abstract void makeSound();  // Abstract method – no body

    void eat() {
        System.out.println("All animals eat food.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a1.eat();

        System.out.println();

        a2.makeSound();
        a2.eat();
    }
}

// output
//   Dog says: Woof! Woof!
// All animals eat food.
// Cat says: Meow! Meow!
// All animals eat food.


