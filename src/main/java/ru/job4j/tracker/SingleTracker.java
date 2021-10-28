package ru.job4j.tracker;

public final class SingleTracker {
    private static SingleTracker instance = null;
    private final Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }
}

class Test {
    public static void main(String[] args) {
        SingleTracker singleTracker = SingleTracker.getInstance();
        System.out.println(singleTracker.findById(1));
    }
}
