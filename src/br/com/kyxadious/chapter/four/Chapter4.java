package br.com.kyxadious.chapter.four;

import br.com.kyxadious.chapter.two.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Chapter4 {

    public void examplePredicateLambda() {
        User user1 = new User("Jonh", 150);
        User user2 = new User("Maria", 120);
        User user3 = new User("Mark", 190);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        users.removeIf(u -> u.getPoints() > 170);
        users.forEach(u -> System.out.println(u));
    }

    public void examplePredicate() {
        User user1 = new User("Jonh", 150);
        User user2 = new User("Maria", 120);
        User user3 = new User("Mark", 190);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        Predicate<User> predicate = new Predicate<User>() {
            @Override
            public boolean test(User user) {
                return user.getPoints() > 170;
            }
        };

        users.removeIf(predicate);
        users.forEach(user -> System.out.println(user));
    }
}
