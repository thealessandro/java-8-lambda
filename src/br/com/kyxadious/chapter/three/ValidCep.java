package br.com.kyxadious.chapter.three;

import br.com.kyxadious.chapter.three.interfaces.Validator;

public class ValidCep implements Validator<String> {

    public ValidCep() {
    }

    @Override
    public Boolean valid(String value) {
        return value.matches("[0-9]{5}-[0-9]{3}");
    }
}
