class Animal {
  Animal() {
    System.out.println("Animal is created");
  }
}

class Dog extends Animal {
  Dog() {
    super(); // Call parent constructor
    System.out.println("Dog is created");
  }
}

public class Main {
  public static void main(String[] args) {
    Dog myDog = new Dog();
  }
}

// Animal is created
// Dog is created

