package ru.job4j.threads.storage;

import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class UserStorage {

    public synchronized boolean add(User user) {
        return false;
    }

    public synchronized boolean update(User user) {
        return false;
    }

    public synchronized boolean delete(User user) {
        return false;
    }

    public synchronized boolean transfer(int fromid, int told, int amount) {
        return false;
    }
}
