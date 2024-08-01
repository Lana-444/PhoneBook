package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result  = phoneBook.add("Liza", 89181230990);
        assertEquals(1, result);
    }
}