package ru.job4j.threads.storage;

import net.jcip.annotations.ThreadSafe;
import java.util.ArrayList;

@ThreadSafe
public class UserStorage {

    ArrayList<User> users = new ArrayList<>();

    public synchronized boolean add(User user) {
        try {
            for (User findUser : users){
                if (findUser != user) {
                    users.add(user);
                } else {
                    System.out.println("user found");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public synchronized boolean update(User user) {
        return false;
    }

    public synchronized boolean delete(User user) {
        return false;
    }


    public static void main(String[] args) {
        UserStorage storage = new UserStorage();
        storage.add(new User(1, 100));
        storage.add(new User(1, 100));
        storage.transfer(1, 2, 50);
    }
}
