package br.com.kyxadious.chapter.two;

import br.com.kyxadious.chapter.common.entity.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static br.com.kyxadious.chapter.common.entity.UserFactory.getUsers;

public class Chapter2 {

    public void exampleForEach() {
        List<User> users = getUsers();

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
        Consumer<User> consumer3 = (User user) -> {
            System.out.println(user.getName());
        };
        users.forEach(consumer3);
        System.out.println("-----------------");

        System.out.println("#6");
        users.forEach(user -> System.out.println(user.getName()));
        System.out.println("-----------------");
    }
}
