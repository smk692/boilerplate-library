// module-2/src/test/java/com/example/module2/UtilityClassTwoTest.java

package org.example.module2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class UtilityClassTwoTest {

    @Test
    void testLogSomething() {
        try {
            UtilityClassTwo.logSomething();
            assertTrue(true);
        } catch (Exception e) {
            fail();
        }
    }
}
