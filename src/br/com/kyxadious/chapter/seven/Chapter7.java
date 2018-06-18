package br.com.kyxadious.chapter.seven;

import br.com.kyxadious.chapter.common.entity.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static br.com.kyxadious.chapter.common.entity.UserFactory.getUsers;

public class Chapter7 {

    public void exampleStreamAndCollector10() {
        List<User> users = getUsers();

        String maxName = users.stream()
                .max(Comparator.comparing(User::getPoints))
                .map(User::getName)
                .orElse("-");

        System.out.println(maxName);
    }

    public void exampleStreamAndCollector9() {
        List<Integer> integers = new ArrayList<>(Arrays.asList(5, 1, 4, 3, 5));

        OptionalDouble average = integers.stream()
                .mapToInt(Integer::intValue)
                .average();
        double value = average.orElse(0.0);

        System.out.println(value);
    }

    public void exampleStreamAndCollector8() {
        List<User> users = getUsers();

        List<Integer> points = users.stream()
                .filter(u -> u.getPoints() > 135)
                .map(User::getPoints)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        points.forEach(System.out::println);
    }

    public void exampleStreamAndCollector7() {
        List<User> users = getUsers();
        List<User> itIsOver135 = new ArrayList<>();

        users.stream().filter(u -> u.getPoints() > 135).forEach(itIsOver135::add);
        itIsOver135.forEach(System.out::println);
    }

    public void exampleStreamAndCollector6() {
        List<User> users = getUsers();

        users.stream().filter(u -> u.getPoints() > 130).forEach(User::moderatorOn);
        users.forEach(System.out::println);
    }

    public void exampleStreamAndCollector5() {
        User user1 = new User("Nicky", 50);
        User user2 = new User("Paul", 10);
        User user3 = new User("Mary", 120);

        List<User> users = Arrays.asList(user1, user2, user3);
        users.stream().filter(u -> u.getPoints() > 50).forEach(System.out::println);
    }

    public void exampleStreamAndCollector4() {
        User user1 = new User("Nicky", 50);
        User user2 = new User("Paul", 10);
        User user3 = new User("Mary", 120);

        List<User> users = Arrays.asList(user1, user2, user3);
        List<User> list = users.stream().filter(u -> u.getPoints() > 50).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

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
