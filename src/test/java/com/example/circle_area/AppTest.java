
package com.example.circle_area;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testArea() {
        assertEquals(78.5398, App.calculateArea(5), 0.0001);
    }

    @Test
    public void testRadiusOne() {
        assertEquals(Math.PI, App.calculateArea(1), 0.0001);
    }

    @Test
    public void testRadiusZero() {
        assertEquals(0.0, App.calculateArea(0), 0.0001);
    }

    @Test
    public void testNegativeRadius() {
        assertThrows(IllegalArgumentException.class,
                () -> App.calculateArea(-5));
    }
}
