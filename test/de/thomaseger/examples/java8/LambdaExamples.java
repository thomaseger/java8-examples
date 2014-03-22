package de.thomaseger.examples.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LambdaExamples {

    @Test
    public void trivialExample() throws Exception {
        List<String> someIterable = new ArrayList<>();
        someIterable.add("one");
        someIterable.add("two");
        someIterable.add("three");
        someIterable.forEach(element -> System.out.println(element));
    }
}
