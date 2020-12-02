package com.example.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author inuter@qq.com
 * @date 2020/11/30
 */
public class ChannelDemoTest {

    @Test
    public void testPrintGreeting() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        try {
            ChannelDemo.printGreeting();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals("Hello world!\n", outputStream.toString());
        ChannelDemo.printGreeting();
    }
}
