package com.example;

import com.example.io.ChannelDemo;

import java.io.IOException;

/**
 * @author inuter@qq.com
 * @date 2020/11/30
 */
public class Main {
    public static void main(String[] args) {
        try {
            ChannelDemo.printGreeting();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
