import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Nowak", 5000, 1, "01.01.2024", "Web Developer");
        Worker worker2 = new Worker("Piotr Kowalczyk", 5200, 2, "02.02.2020", "Frontend Developer");
        Worker worker3 = new Worker("Marta Lewandowska", 4800, 3, "05.15.2023", "Backend Developer");
        Worker worker4 = new Worker("Karolina Wójcik", 5100, 4, "09.14.2019", "System Analyst");

        Manager manager = new Manager("Katarzyna Wiśniewska", 7000, 5, "08.08.2018", "Technical Lead");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}
