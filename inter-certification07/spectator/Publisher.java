package spectator;

import java.util.List;

public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver (Observer observer); 

    void sendOffer(String nameCompany, double salary, boolean isStudent);
}
