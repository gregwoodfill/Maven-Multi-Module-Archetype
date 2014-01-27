package com.gregwoodfill.myapp;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HelloGeneratorTest {

    private HelloGenerator helloGenerator;

    @Before
    public void setUp() {
        helloGenerator = new HelloGenerator();
    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals("Hello Greg", helloGenerator.generateHello("Greg"));
    }
}
