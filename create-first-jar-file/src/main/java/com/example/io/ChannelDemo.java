package com.example.io;

import java.io.*;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;


/**
 * @author inuter@qq.com
 * @date 2020/11/30
 */
public class ChannelDemo {

    /**
     * print the content of greeting.txt file
     * @throws IOException file not found or cannot read
     */
    public static void printGreeting() throws IOException {
        final String FILE_NAME = "greeting.txt";
        final int BYTE_BUFFER_CAPACITY = 2048;

        InputStream inputStream = ChannelDemo.class.getClassLoader().getResourceAsStream(FILE_NAME);
        try (ReadableByteChannel channel = Channels.newChannel(inputStream)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(BYTE_BUFFER_CAPACITY);

            while (channel.read(byteBuffer) != -1) {
                byteBuffer.flip();
                String s = StandardCharsets.UTF_8.decode(byteBuffer).toString();
                System.out.print(s);
                byteBuffer.clear();
            }
        }
    }
}
