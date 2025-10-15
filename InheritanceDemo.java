// Save as InheritanceDemo.java

// Base class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    void sound() {
        System.out.println("Animals make sounds.");
    }

    void showInfo() {
        System.out.println("I am an animal named " + name);
    }
}

// Derived class Dog
class Dog extends Animal {

    Dog(String name) {
        super(name); // call Animal constructor
    }

    // Method overriding
    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Derived class Cat
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    // Method overriding
    @Override
    void sound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Animal generic = new Animal("Generic");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Kitty");

        System.out.println("=== Demonstrating Classes, Inheritance & Overriding ===");
        generic.showInfo();
        generic.sound(); // Calls Animal's sound()

        dog.showInfo();
        dog.sound(); // Calls Dog's overridden sound()

        cat.showInfo();
        cat.sound(); // Calls Cat's overridden sound()

        // Polymorphism in action
        Animal polyAnimal;
        polyAnimal = new Dog("Max");
        polyAnimal.sound(); // Calls Dog's version

        polyAnimal = new Cat("Luna");
        polyAnimal.sound(); // Calls Cat's version
    }
}

