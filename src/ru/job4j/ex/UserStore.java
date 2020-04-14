package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(login)) {
                break;
            }
            throw new UserNotFoundException();
        }
        return null;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid()) {
            System.out.println("Пользователь не валидный");
            throw new UserInvalidException();
        }
        if (user.getUsername().length() < 3) {
            System.out.println("Имя пользователя состоит из менее трех символов");
            throw new UserInvalidException();
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
        } catch (UserNotFoundException e) {
            System.out.println("User not found");
        }
        try {
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("The user is not valid");
        }
    }
}
