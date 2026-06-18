package subject;

import observers.Observer;

public interface Subject {
    void addObservers(Observer o);
    void notifyObservers();
}
