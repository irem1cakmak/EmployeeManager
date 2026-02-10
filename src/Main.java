import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name=scanner.nextLine();
        System.out.print("Enter the surname: ");
        String surname=scanner.nextLine();
        System.out.print("Enter the salary: ");
        int salary=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the country: ");
        String country=scanner.nextLine();
        System.out.print("Enter the task: ");
        String task=scanner.nextLine();
        Employee e=new Employee(name,surname,salary,country,task);


        System.out.println("---");
        System.out.println("Name: " + e.name);
        System.out.println("Surname: " + e.surname);
        System.out.println("Salary: " + e.salary);
        System.out.println("Country: " + e.country);
        System.out.println("Task: " + e.task);


    }
}