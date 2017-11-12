package br.com.kyxadious.chapter.three;

import br.com.kyxadious.chapter.three.interfaces.Validator;

public class Chapter3 {

    public void exampleLocalVariableNonFinal() {
        int number = 1;
        new Thread(() -> System.out.println(number)).start();
    }

    public void exampleLocalVariableFinal() {
        final int number = 1;
        new Thread(() -> System.out.println(number)).start();
    }

    public void exampleWhoAmILambda() {
        Runnable r = () -> {
            System.out.println("Who am I? What lambda?");
        };

        System.out.println(r);
        System.out.println(r.getClass());
    }

    public void exampleValidatorCEP() {
        String validCep = "60900-000";
        String invalidCep = "600900-000";

        System.out.println("#1");
        Validator<String> validator1 = new Validator<String>() {
            @Override
            public Boolean valid(String value) {
                return value.matches("[0-9]{5}-[0-9]{3}");
            }
        };
        System.out.println(validCep + ": " +validator1.valid(validCep));
        System.out.println("-----------------");

        System.out.println("#2");
        Validator<String> validator2 =
                value -> {
                    return value.matches("[0-9]{5}-[0-9]{3}");
                };
        System.out.println(validCep + ": " + validator2.valid(validCep));
        System.out.println("-----------------");

        System.out.println("#3");
        Validator<String> validator3 =
                value -> value.matches("[0-9]{5}-[0-9]{3}");
        System.out.println(invalidCep + ": " + validator3.valid(invalidCep));
        System.out.println("-----------------");
    }

    public void exampleThreadRunnable() {
        // #1
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("#1");
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                }
                System.out.println("-----------------");
            }
        };
        new Thread(r1).start();

        // #2
        Runnable r2 = () -> {
            System.out.println("#2");
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
            System.out.println("-----------------");
        };
        new Thread(r2).start();

        // #3
        new Thread(() -> {
            System.out.println("#3");
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
            System.out.println("-----------------");
        }).start();
    }
}
