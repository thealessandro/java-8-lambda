package br.com.kyxadious.chapter.four;

import br.com.kyxadious.chapter.common.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static br.com.kyxadious.chapter.common.entity.UserFactory.getUsers;

public class Chapter4 {

    public void examplePredicateLambda() {
        List<User> users = getUsers();

        users.removeIf(u -> u.getPoints() > 170);
        users.forEach(u -> System.out.println(u));
    }

    public void examplePredicate() {
        List<User> users = getUsers();

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
