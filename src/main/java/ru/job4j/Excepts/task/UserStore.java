package ru.job4j.Excepts.task;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
        }
    }


    public static boolean validate(User user) throws UserInvalidException {
        try {
            user.isValid();
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User[] users = {new User("Ivanov ivan", true)};
        User user = findUser(users, "Ivanov Ivan");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
