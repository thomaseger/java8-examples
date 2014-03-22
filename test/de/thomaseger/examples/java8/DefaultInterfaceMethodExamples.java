package de.thomaseger.examples.java8;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by thomaseger on 3/22/14.
 */
public class DefaultInterfaceMethodExamples {

    @Test
    public void trivialExample() throws Exception {
        MyInterface impl = new MyImplementor();
        assertEquals("some string", impl.getSomeString());
    }
}
