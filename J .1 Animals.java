class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Pig();
        Animal a3 = new Dog();

        a1.animalSound();
        a2.animalSound();
        a3.animalSound();
    }
}

//The animal makes a sound
//The pig says: wee wee
//The dog says: bow wow