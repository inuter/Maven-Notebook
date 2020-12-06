package com.example;

import com.example.thread.Pools;

import java.util.concurrent.ExecutorService;

/**
 * @author inuter@qq.com
 * @date 2020/12/06
 */
public class Main {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Coping dependencies");
            }
        };
        ExecutorService threadPool = Pools.getThreadPool();
        threadPool.submit(task);
        threadPool.shutdown();
    }
}
