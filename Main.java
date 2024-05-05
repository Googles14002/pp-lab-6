import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Nowak", 5000, 2, "01.01.2024", "Web Developer");
        Worker worker2 = new Worker("Piotr Kowalczyk", 5200, 1, "02.02.2020", "Frontend Developer");
        Worker worker3 = new Worker("Marta Lewandowska", 4800, 2, "05.15.2023", "Backend Developer");

        Manager manager = new Manager("Katarzyna Wiśniewska", 7000, 3, "08.08.2018", "Technical Lead");

        Employee[] employees = {worker1, worker2, manager};

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        System.out.println(worker2.getName() + " equals " + worker3.getName() + ": " + worker2.equals(worker3));
        System.out.println(worker1.getName() + " equals " + worker3.getName() + ": " + worker1.equals(worker3));
        System.out.println(manager.getName() + " equals " + worker3.getName() + ": " + manager.equals(worker3));
    }
}
