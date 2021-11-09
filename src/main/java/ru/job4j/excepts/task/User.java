package ru.job4j.excepts.task;

public class User {
    private String username;
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public  boolean isValid() {
        return valid;
    }

    public  String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}
