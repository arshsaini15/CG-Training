package Inheritance_Jan_19_01_2026;

public class Animal {
    public String name;
    public int age;

    void makeSound() {
        System.out.println("Making Sound");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark !");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow !");
    }
}

class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Chirp !");
    }
}
