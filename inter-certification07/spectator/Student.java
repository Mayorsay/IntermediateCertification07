package spectator;

import java.util.Random;
//наблюдатель за вакансиями, за агенством

public class Student implements Observer{

    private static Random random = new Random();
    private String name;
    private double minSalary;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
    }

    @Override
    public void receiveOffer(String nameCompany, double salary, boolean isStudent) {
        if (this instanceof Student) isStudent = true;
        else isStudent = false;
        if (isStudent == true) {
            if (minSalary <= salary) {
                System.out.printf("Студент %s (%f) >>> Нужна эта работа [%s - %f]\n", name, minSalary, nameCompany, salary);
                minSalary = salary;
            } else {
                System.out.printf("Студенту %s (%f) >>> Не нужна эта работа [%s - %f]\n", name, minSalary, nameCompany, salary);
            }
        } else System.out.printf("Студент %s >>> (Не может устроится на работу так как он студент) [%s - %f]\n", name, nameCompany);
    }

}
