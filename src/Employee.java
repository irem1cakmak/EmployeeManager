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
}
