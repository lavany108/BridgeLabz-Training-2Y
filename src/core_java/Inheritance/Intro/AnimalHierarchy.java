package core_java.Inheritance.Intro;

class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " (Dog) says: Woof Woof!");
    }
}
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " (Cat) says: Meow Meow!");
    }
}
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println(name + " (Bird) says: Tweet Tweet!");
    }
}
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Bruno", 3);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Parry", 1);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
