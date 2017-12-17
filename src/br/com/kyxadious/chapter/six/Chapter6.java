package br.com.kyxadious.chapter.six;

import br.com.kyxadious.chapter.common.entity.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static br.com.kyxadious.chapter.common.entity.UserFactory.getUsers;
import static br.com.kyxadious.chapter.common.entity.UserFactory.getUsersWithNull;
import static java.util.Comparator.comparing;

public class Chapter6 {

    public void exampleConstructorReference11() {
        BiFunction<String, Integer, User> creatorUser = User::new;
        User john = creatorUser.apply("John", 120);
        User maike = creatorUser.apply("Maike", 70);

        Arrays.asList(john, maike).forEach(System.out::println);
    }

    public void exampleConstructorReference10() {
        Function<String, User> creatorUser = User::new;
        User john = creatorUser.apply("John");
        User maike = creatorUser.apply("Maike");

        Arrays.asList(john, maike).forEach(System.out::println);
    }

    public void exampleConstructorReference9() {
        Supplier<User> creatorUser = User::new;
        User user = creatorUser.get();
        user.setName("John");

        System.out.println(user);
    }

    public void exampleMethodReference8() {
        List<User> users = getUsers();

        users.sort(Comparator.comparing(User::getPoints).reversed());
        users.forEach(System.out::println);
    }

    public void exampleMethodReference7() {
        List<User> users = getUsersWithNull();

        users.sort(Comparator.nullsLast(Comparator.comparing(User::getPoints).thenComparing(User::getName)));
        users.forEach(x -> System.out.println(x));
    }

    public void exampleMethodReference6() {
        List<User> users = getUsers();

        users.sort(Comparator.comparing(User::getPoints).thenComparing(User::getName));
        users.forEach(x -> System.out.println(x));
    }

    public void exampleMethodReference5() {
        List<User> users = getUsers();

        Comparator<User> comparator = Comparator.comparing(User::getPoints)
                .thenComparing(User::getName);

        users.sort(comparator);
        users.forEach(x -> System.out.println(x));
    }

    public void exampleMethodReference4() {
        List<User> users = getUsers();

        users.sort(Comparator.comparingInt(User::getPoints));
        users.forEach(x -> System.out.println(x));
    }

    public void exampleMethodReference3() {
        List<User> users = getUsers();

        Function<User, Integer> byPoint = User::getPoints;
        users.sort(comparing(byPoint));
        users.forEach(System.out::println);
    }

    public void exampleMethodReference2() {
        List<User> users = getUsers();

        users.sort(comparing(User::getPoints));
        users.forEach(System.out::println);
    }

    public void exampleMethodReference1() {
        List<User> users = getUsers();

        users.forEach(User::moderatorOn);
        users.forEach(System.out::println);
    }
}
