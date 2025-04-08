// Implementation in architectures like Clean Architecture
public class App {
    public static void main(String[] args) {
        Employee dev = new Developer("John", 5000, 1000);
        Employee manager = new Manager("Mary", 8000, 1500);

        System.out.println("Salary of " + dev.getName() + ": " + dev.calculateSalary());
        System.out.println("Salary of " + manager.getName() + ": " + manager.calculateSalary());
    }
}
