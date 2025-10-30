package org.example;

import java.util.List;
import java.util.ArrayList;

public class JobSite implements Observed {
    private List<String> vacancies = new ArrayList<>();
    private List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserved(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserved(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.handleEvent(vacancies);
        }
    }
}
