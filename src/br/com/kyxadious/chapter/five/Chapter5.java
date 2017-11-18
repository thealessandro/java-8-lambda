package br.com.kyxadious.chapter.five;

import br.com.kyxadious.chapter.common.entity.User;

import java.util.*;
import java.util.function.Function;

import static br.com.kyxadious.chapter.common.entity.UserFactory.getUsers;

public class Chapter5 {

    public void exampleComparatorLambda10() {
        List<User> users = getUsers();

        users.sort(Comparator.comparingInt(u -> u.getPoints()));
        users.forEach(System.out::println);
    }

    public void exampleComparatorLambda9() {
        List<User> users = getUsers();

        users.sort(Comparator.comparing(User::getPoints));
        users.forEach(System.out::println);
    }

    public void exampleComparatorLambda8() {
        List<User> users = getUsers();

        Function<User, Integer> points = u -> u.getPoints();
        users.sort(Comparator.comparing(points));
        users.forEach(u -> System.out.println(u));
    }

    public void exampleComparatorLambda7() {
        List<String> words = Arrays.asList("Car", "House", "Sky", "Airplane");

        System.out.println("Natural Order:");
        words.sort(Comparator.naturalOrder());
        words.forEach(u -> System.out.println(u));

        System.out.println("Reverse Order:");
        words.sort(Comparator.reverseOrder());
        words.forEach(u -> System.out.println(u));
    }

    public void exampleComparatorLambda6() {
        List<User> users = getUsers();

        users.sort(Comparator.comparing(u -> u.getName()));
        users.forEach(u -> System.out.println(u));
    }

    public void exampleComparatorLambda5() {
        List<User> users = getUsers();

        Comparator<User> comparator = Comparator.comparing(u -> u.getName());
        users.sort(comparator);
        users.forEach(u -> System.out.println(u));
    }

    public void exampleComparatorLambda4() {
        List<User> users = getUsers();

        users.sort((u1, u2) -> String.CASE_INSENSITIVE_ORDER.compare(u1.getName(), u2.getName()));
        users.forEach(u -> System.out.println(u));
    }

    public void exampleComparatorLambda3() {
        List<User> users = getUsers();

        Collections.sort(users,
                (u1, u2) -> String.CASE_INSENSITIVE_ORDER.compare(u1.getName(), u2.getName()));
        users.forEach(u -> System.out.println(u));
    }

    public void exampleComparatorLambda2() {
        List<User> users = getUsers();

        Collections.sort(users, Comparator.comparing(User::getName));
        users.forEach(u -> System.out.println(u));
    }

    public void exampleComparatorLambda1() {
        List<User> users = getUsers();

        Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
        users.forEach(u -> System.out.println(u));
    }

    public void exampleComparator() {
        List<User> users = getUsers();

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
