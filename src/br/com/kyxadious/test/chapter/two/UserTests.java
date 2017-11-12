package br.com.kyxadious.test.chapter.two;

import br.com.kyxadious.chapter.two.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTests {

    @Test
    public void testEqualsTrue() {
        User user1 = new User("Maria", 150);
        User user2 = new User("Maria", 150);

        assertTrue(user1.equals(user2));
    }

    @Test
    public void testEqualsTrueWithDiffPoints() {
        User user1 = new User("Maria", 150);
        User user2 = new User("Maria", 151);

        assertTrue(user1.equals(user2));
    }

    @Test
    public void testEqualsNull() {
        User user1 = new User("Maria", 150);
        User user2 = null;

        assertFalse(user1.equals(user2));
    }
}
