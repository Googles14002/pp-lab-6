import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Nowak", 5000, 1);
        Worker worker2 = new Worker("Piotr Kowalczyk", 5200, 2);
        Worker worker3 = new Worker("Marta Lewandowska", 4800, 3);
        Worker worker4 = new Worker("Karolina Wójcik", 5100, 4);

        Manager manager = new Manager("Katarzyna Wiśniewska", 7000, 5);

        System.out.println("Worker #1 salary: " + worker1.getSalary());
        worker1.work();

        System.out.println("Worker #2 salary: " + worker2.getSalary());
        worker2.work();

        System.out.println("Worker #3 salary: " + worker3.getSalary());
        worker3.work();

        System.out.println("Worker #4 salary: " + worker4.getSalary());
        worker4.work();

        System.out.println("Manager salary: " + manager.getSalary());
        manager.work();
    }
}
