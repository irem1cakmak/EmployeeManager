public class Employee {
     String name;
     String surname;
     int salary;
     String country;
     String task;

    public Employee(String name, String surname, int salary, String country, String task) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.country = country;
        this.task = task;
        System.out.println("Correct!");
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println(name + " - " + salary);
    }

    public Employee(String name) {
        this(name, 1000);
        System.out.println("Name: " + name);
    }
}
