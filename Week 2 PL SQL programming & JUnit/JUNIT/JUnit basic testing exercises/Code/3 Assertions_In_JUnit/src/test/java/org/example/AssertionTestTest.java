package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertionTestTest {

    @Test
    void assertions() {
        assertEquals(5,2+3);
        assertTrue(5>3);
        assertFalse(5<3);
        assertNull(null);
        assertNotNull(new Object());
    }
}