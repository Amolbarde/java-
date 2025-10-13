
* Abstraction : Abstraction means showing only the important things and hiding the rest

* Example
abstract class Animal 
{
    abstract void makeSound(); // No body – just says what needs to be done
}

class Dog extends Animal
  {
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow Meow");
    }
}
