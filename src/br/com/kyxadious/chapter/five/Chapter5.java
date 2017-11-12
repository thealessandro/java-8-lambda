package br.com.kyxadious.chapter.five;

import br.com.kyxadious.chapter.two.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {

    public void exampleComparatorLambda2() {
        User user1 = new User("Mark", 190);
        User user2 = new User("Peter", 120);
        User user3 = new User("Jonh", 150);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Collections.sort(users, Comparator.comparing(User::getName));
        users.forEach(u -> System.out.println(u));
    }

    public void exampleComparatorLambda1() {
        User user1 = new User("Mark", 190);
        User user2 = new User("Peter", 120);
        User user3 = new User("Jonh", 150);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
        users.forEach(u -> System.out.println(u));
    }

    public void exampleComparator() {
        User user1 = new User("Mark", 190);
        User user2 = new User("Peter", 120);
        User user3 = new User("Jonh", 150);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Comparator<User> comparator = new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getName().compareTo(u2.getName());
            }
        };

        Collections.sort(users, comparator);
        users.forEach(u -> System.out.println(u));
    }
}
