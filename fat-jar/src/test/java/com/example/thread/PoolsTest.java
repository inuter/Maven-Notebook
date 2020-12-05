package com.example.thread;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/**
 * @author inuter@qq.com
 * @date 2020/12/05
 */
public class PoolsTest {
    @Test
    public void testGetThreadPool() {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello world";
            }
        };
        try {
            String s = Pools.getThreadPool().submit(callable).get();
            Assertions.assertEquals("Hello world", s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
