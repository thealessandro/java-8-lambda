package br.com.kyxadious.chapter.two;

import br.com.kyxadious.chapter.common.entity.User;

import java.util.function.Consumer;

public class UserConsumer implements Consumer<User> {

    @Override
    public void accept(User user) {
        System.out.println(user.getName());
    }
}
