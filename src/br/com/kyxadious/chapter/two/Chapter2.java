package br.com.kyxadious.chapter.two;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chapter2 {

    public static void main(String[] args) {
        User user1 = new User("Jonh", 150);
        User user2 = new User("Maria", 120);
        User user3 = new User("Mark", 190);

        List<User> users = Arrays.asList(user1, user2, user3);

        System.out.println("#1");
        for (User user : users) {
            System.out.println(user.getName());
        }
        System.out.println("-----------------");

        System.out.println("#2");
        Consumer<User> consumer1 = new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user.getName());
            }
        };
        users.forEach(consumer1);
        System.out.println("-----------------");

        System.out.println("#3");
        users.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user.getName());
            }
        });
        System.out.println("-----------------");

        System.out.println("#4");
        UserConsumer consumer2 = new UserConsumer();
        users.forEach(consumer2);
        System.out.println("-----------------");

        System.out.println("#5");
        Consumer<User> consumer3 = (User user) -> {System.out.println(user.getName());};
        users.forEach(consumer3);
        System.out.println("-----------------");

        System.out.println("#6");
        users.forEach(user -> System.out.println(user.getName()));
        System.out.println("-----------------");
    }
}
