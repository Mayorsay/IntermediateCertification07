package spectator;

import java.util.Random;

public class Master implements Observer{
    private static Random random = new Random();
    private String name;
    private double minSalary;

    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(80000, 100000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, boolean isStudent) {
        if (minSalary <= salary) {
            System.out.printf("Мастер %s (%f) >>> Нужна эта работа [%s - %f]\n", name, minSalary, nameCompany, salary);
            minSalary = salary;
        } else {
            System.out.printf("Мастер %s (%f) >>> Не нужна эта работа [%s - %f]\n", name, minSalary, nameCompany, salary);
        }
    }
}
