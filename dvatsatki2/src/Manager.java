import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker{
    private List<Worker> slaves;

    public Manager(String name, int age, String gender, double salary) {
        super(name, age, gender, salary);
        this.slaves = new ArrayList<>();
    }

    public void addslave(Worker worker) {
        slaves.add(worker);
    }

    @Override
    public void printPerson() {
        super.printPerson();
        System.out.println("Подчиненные сотрудники:");
        for (Worker worker : slaves) {
            System.out.println("- " + worker.getName());
        }
    }
}
