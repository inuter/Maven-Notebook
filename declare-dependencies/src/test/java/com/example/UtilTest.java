package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author inuter@qq.com
 * @date 2020/11/01
 */
public class UtilTest {

    @Test
    public void testPeek() {
        assertEquals(1, Util.peek(1));
    }
}
