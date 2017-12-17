package br.com.kyxadious.chapter.seven;

import br.com.kyxadious.chapter.common.entity.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static br.com.kyxadious.chapter.common.entity.UserFactory.getUsers;

public class Chapter7 {

    public void exampleStreamAndCollector3() {
        List<User> users = getUsers();

        Stream<User> stream = users.stream().filter(u -> u.getPoints() > 130);
        stream.forEach(System.out::println);
    }

    public void exampleStreamAndCollector2() {
        List<User> users = getUsers();

        users.stream().filter(u -> u.getPoints() > 130);
        users.forEach(System.out::println);
    }

    public void exampleStreamAndCollector1() {
        List<User> users = getUsers();

        users.sort(Comparator.comparing(User::getPoints).reversed());
        users.subList(0, 5).forEach(User::moderatorOn);
        users.forEach(System.out::println);
    }
}
