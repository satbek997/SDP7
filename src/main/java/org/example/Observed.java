package org.example;

public interface Observed {
    void addObserved(Observer observer);
    void removeObserved(Observer observer);
    void notifyObservers();
}
