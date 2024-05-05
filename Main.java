import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Nowak", 5000, 3, "01.01.2024", "Web Developer");
        Worker worker2 = new Worker("Piotr Kowalczyk", 5200, 2, "02.02.2020", "Frontend Developer");
        Worker worker3 = new Worker("Marta Lewandowska", 4800, 3, "05.15.2023", "Backend Developer");
        Worker worker4 = new Worker("Karolina Wójcik", 5100, 3, "09.14.2019", "Network Engineer");
        Worker worker5 = new Worker("Grzegorz Wiśniewski ", 5100, 4, "04.07.2019", "Data Scientist");
        Worker worker6 = new Worker("Monika Jankowska", 4700, 6, "08.11.2022", "Cloud Architect");

        Manager manager = new Manager("Agnieszka Kowalska", 7000, 5, "08.08.2018", "Technical Lead");
        Manager manager2 = new Manager("Janusz Kowalski", 6000, 1, "09.03.2021", "Product Manager");


        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);
        employees.add(worker4);

        double totalSalaryAllEmployees = 0;
        double totalSalaryAllManagers = 0;
        double totalSalaryAllWorkers = 0;

        for (Employee employee : employees) {
            totalSalaryAllEmployees += employee.getSalary();
            if (employee instanceof Manager) {
                totalSalaryAllManagers += employee.getSalary();
            } else {
                totalSalaryAllWorkers += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: $" + totalSalaryAllEmployees);
        System.out.println("Total salary of all managers: $" + totalSalaryAllManagers);
        System.out.println("Total salary of all workers: $" + totalSalaryAllWorkers);

        int searchId = 3;
        System.out.println("List of employees with ID " + searchId + ":");
        for (Employee employee : employees) {
            if (employee instanceof Worker && ((Worker) employee).getId() == searchId) {
                System.out.println("- " + employee.getName());
            }
        }
    }
}
