package com.edwardnoaland.wave.e;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaveProjectETest {
    @Test
    public void shouldDescribeTheCalculatedValue() {
        assertEquals("project-e:7", WaveProjectE.describe(3));
    }

    @Test
    public void shouldCalculateZero() {
        assertEquals(1, WaveProjectE.calculate(0));
    }
}
