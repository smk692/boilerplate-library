package org.example.module1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class UtilityClassOneTest {

    @Test
    void testLogSomething() {
        try {
            UtilityClassOne.logSomething();
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
}
