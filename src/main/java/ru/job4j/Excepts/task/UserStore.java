package ru.job4j.Excepts.task;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User findingUser = null;
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                findingUser = value;
            } else {
                throw new UserNotFoundException("User not found");
            }
        }
        return findingUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = false;
        if (user.isValid()) {
            rsl = true;
        } else {
            throw new UserInvalidException("User don't have an access");
        }
        return rsl;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {new User("Ivanov Ivan", true)};
        User user = findUser(users, "Ivanov Ivan");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
