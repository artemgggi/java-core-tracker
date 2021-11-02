package ru.job4j.collection.Map.BankTransferTask;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        for (User key : users.keySet()) {
            if (! users.containsKey(user)) {
                users.put(user, new ArrayList<Account>());
            }
        }
    }
   /*
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            for (User user : users.keySet()) {

            }
        }
    }*/

    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (Objects.equals(user.getPassport(), passport)) {
                rsl = user;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}
