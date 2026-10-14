package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testReverseString() {
        App app = new App();

        String actual = app.reverseString("hello");

        assertEquals("olleh", actual);
    }
}
