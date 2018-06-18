package br.com.kyxadious.chapter.common.entity;

import java.util.ArrayList;
import java.util.List;

public class UserFactory {

    private UserFactory() {
    }

    public static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Tony", 110, false));
        users.add(new User("Peter", 120, false));
        users.add(new User("Jonh", 150, false));
        users.add(new User("jonh", 140, false));
        users.add(new User("peter", 130, false));
        users.add(new User("Mark", 190, false));
        users.add(new User("Kennedy", 195, false));
        return users;
    }

    public static List<User> getUsersWithNull() {
        List<User> users = new ArrayList<>();
        users.add(null);
        users.add(new User("Tony", 110));
        users.add(new User("Peter", 120));
        users.add(new User("Jonh", 150));
        users.add(new User("jonh", 140));
        users.add(null);
        users.add(new User("peter", 130));
        users.add(new User("Mark", 190));
        users.add(null);
        users.add(new User("Kennedy", 190));
        return users;
    }
}
