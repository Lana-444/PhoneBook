package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("Liza", "89181231234");
        assertEquals(1, result);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Liza", "89181231234");
        String name = phoneBook.findByNumber("89181231234");
        assertEquals("Liza", name);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Lana Bee", "89181231234");
        assertEquals("89181231234", phoneBook.findByName("Lana Bee"));
    }
}