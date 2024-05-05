package company.models;

import company.abstracts.Employee;

public class Worker extends Employee {
    public Worker(String name, double salary, int id, String hireDate, String position) {
        super(name, salary, id, hireDate, position);
    }

    public int getId() {
        return super.id;
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working...");
    }
}
