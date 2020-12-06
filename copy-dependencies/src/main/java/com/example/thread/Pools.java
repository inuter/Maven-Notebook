package com.example.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author inuter@qq.com
 * @date 2020/12/06
 */
public class Pools {

    /**
     * return a thread pool
     * @return thread pool
     */
    public static ExecutorService getThreadPool() {
        LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        ThreadFactory factory = new ThreadFactoryBuilder().setNameFormat("maven-pool-%d").build();
        return new ThreadPoolExecutor(1, 2, 30,
                TimeUnit.SECONDS, queue, factory, new ThreadPoolExecutor.AbortPolicy());
    }
}
