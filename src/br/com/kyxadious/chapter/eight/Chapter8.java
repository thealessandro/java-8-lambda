package br.com.kyxadious.chapter.eight;

import br.com.kyxadious.chapter.common.entity.User;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static br.com.kyxadious.chapter.common.entity.UserFactory.getUsers;

public class Chapter8 {

    public void exampleStreams7() {
        List<User> users = getUsers();

        double average = users.stream()
                .mapToInt(User::getPoints)
                .average()
                .getAsDouble();

        int sum = users.stream()
                .mapToInt(User::getPoints)
                .sum();

        long count = users.stream()
                .mapToInt(User::getPoints)
                .count();

        int min = users.stream()
                .mapToInt(User::getPoints)
                .min()
                .orElse(0);

        int max = users.stream()
                .mapToInt(User::getPoints)
                .max()
                .orElse(0);

        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public void exampleStreams6() {
        Stream.of("bus", "car", "bycle", "flight", "train")
                .filter(t -> t.length() > 3)
                .peek(t -> System.out.println("Filtered: " + t))
                .map(String::toUpperCase)
                .peek(t -> System.out.println("Mapped: " + t))
                .collect(Collectors.toList());
    }

    public void exampleStreams5() {
        List<User> users = getUsers();

        users.stream()
                .peek(System.out::println)
                .sorted(Comparator.comparing(User::getName))
                .findAny();
    }

    public void exampleStreams4() {
        List<User> users = getUsers();

        users.stream()
                .filter(u -> u.getPoints() > 100)
                .peek(System.out::println);
    }

    public void exampleStreams3() {
        List<User> users = getUsers();

        users.stream()
                .filter(u -> u.getPoints() > 100)
                .peek(System.out::println)
                .findAny();
    }

    public void exampleStreams2() {
        List<User> users = getUsers();

        Optional<User> userOptional = users.stream()
                .filter(u -> u.getPoints() > 100)
                .sorted(Comparator.comparing(User::getName, String::compareToIgnoreCase))
                .findAny();

        userOptional.ifPresent(System.out::println);
    }

    public void exampleStreams1() {
        List<User> users = getUsers();

        List<User> sortedList = users.stream()
                .filter(u -> u.getPoints() > 100)
                .sorted(Comparator.comparing(User::getName, String::compareToIgnoreCase))
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}
