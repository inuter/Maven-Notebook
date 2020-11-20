package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author inuter@qq.com
 * @date 2020/11/20
 */
public class UtilTest {

    @Test
    public void testPeek() {
        Assertions.assertEquals(1024, Util.peek(1024));
    }
}
