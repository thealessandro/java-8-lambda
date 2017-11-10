package br.com.kyxadious.chapter.two;

import java.util.function.Consumer;

public class UserConsumer implements Consumer<User> {

    @Override
    public void accept(User user) {
        System.out.println(user.getName());
    }
}
