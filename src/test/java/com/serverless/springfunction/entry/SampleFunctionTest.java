package com.serverless.springfunction.entry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleFunctionTest {
    SampleFunction function;

    @BeforeEach
    public void setUp() {
        function = new SampleFunction();
    }

    @Test
    void testApply() {
        assertEquals("Hello Junit", function.apply("Junit"));
    }

}