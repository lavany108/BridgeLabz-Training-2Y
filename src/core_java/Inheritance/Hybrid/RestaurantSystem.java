package core_java.Inheritance.Hybrid;

class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    void displayPerson() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
interface Worker {
    void performDuties(); // abstract method
}
class Chef extends Person implements Worker {
    String specialty;
    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }
    @Override
    public void performDuties() {
        System.out.println(name + " is cooking " + specialty + " dishes.");
    }
}
class Waiter extends Person implements Worker {
    int tablesAssigned;
    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }
    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }
}
public class RestaurantSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Alice", 101, "Italian");
        Worker waiter = new Waiter("Bob", 201, 5);
        chef.performDuties();
        waiter.performDuties();
    }
}
