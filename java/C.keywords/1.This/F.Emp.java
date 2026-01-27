class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        this(101, "Akash");
        System.out.println("Default constructor called");
    }

    Employee(int id, String name) {
        this(id, name, 50000);
        System.out.println("Two-parameter constructor called");
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Three-parameter constructor called");
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class ThisConstructorDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
    }
}

//Three-parameter constructor called
//Two-parameter constructor called
//Default constructor called
//ID: 101
//Name: Akash
//Salary: 50000.0


