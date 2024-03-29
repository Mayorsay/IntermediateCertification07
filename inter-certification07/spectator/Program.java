package spectator;

public class Program {
    public static void main(String[] args) {
        JobAgency jobAgency = new JobAgency();

        Company oil = new Company("Oil", 70000, jobAgency);
        Company pig = new Company("Pig", 2500, jobAgency);
        Company noy = new Company("Noy", 120000, jobAgency);

        Master ivanov = new Master("Sergey");
        Consultant petrov = new Consultant("Zahar");
        Student sidorov = new Student("Kirill");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);

        for (int i = 0; i < 5; i++) {
            oil.needEmployer();
            pig.needEmployer();
            noy.needEmployer();
        }
    }
}
