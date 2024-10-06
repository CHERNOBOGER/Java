public class Worker extends Person {
    private double salary;

    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    @Override
    public void printPerson() {
        super.printPerson();
        System.out.println("Зарплата: " + salary);

    }
}

