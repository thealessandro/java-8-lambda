package br.com.kyxadious.test.chapter.three;

import br.com.kyxadious.chapter.three.ValidCep;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorCepTests {

    @Test
    public void testValidCEP() {
        String cep = "60533-685";

        assertEquals(true, new ValidCep().valid(cep));
    }

    @Test
    public void testInvalidCEP() {
        String cep = "960533-685";

        assertEquals(false, new ValidCep().valid(cep));
    }
}
