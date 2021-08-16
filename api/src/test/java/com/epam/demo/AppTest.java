package com.epam.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void test_byteArrayInputStream() {
        String input = "";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(byteArrayInputStream);

        String[] expected = new String[]{"Run with arguments: [1.1, 15]", "Is all positive number? \ntrue"};

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        App.main(new String[]{"1.1", "15"});

        String[] actual = byteArrayOutputStream.toString().split(System.lineSeparator());
        Assertions.assertArrayEquals(expected, actual);
    }

}

