package org.example;

public class JobSearch {
    public static void main(String[] args) {
        JobSite js = new JobSite();

        js.addVacancy("First Java Position");
        js.addVacancy("Second Java Position");

        Observer firstSubscriber = new Subscriber("Erasyl Zhomartov");
        Observer secondSubscriber = new Subscriber("Abyz Satbek");

        js.addObserved(firstSubscriber);
        js.addObserved(secondSubscriber);

        js.addVacancy("Third Java Position");
        js.removeVacancy("First Java Position");
    }
}
