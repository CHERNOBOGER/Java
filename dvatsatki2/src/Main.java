public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("nalim", 30, "male", 50000);
        Worker worker2 = new Worker("azalia", 25, "female", 45000);

        Manager manager = new Manager("corge", 40, "male", 70000);

        manager.addslave(worker1);
        manager.addslave(worker2);

        manager.printPerson();
    }
}