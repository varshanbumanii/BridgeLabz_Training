package objectorientedprogramming.inheritance.hybridlevel;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID  : " + id);
    }
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        System.out.println("Duties: Cooking food and managing kitchen");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        System.out.println("Duties: Serving food to customers");
    }
}

public class Restaurant {
    public static void main(String[] args) {

        Worker w1 = new Chef("Arun", 101);
        Worker w2 = new Waiter("Kiran", 102);

        System.out.println("---- Chef Details ----");
        ((Person) w1).displayDetails();
        w1.performDuties();

        System.out.println("\n---- Waiter Details ----");
        ((Person) w2).displayDetails();
        w2.performDuties();
    }
}

