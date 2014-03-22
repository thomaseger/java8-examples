package de.thomaseger.examples.java8;

public interface MyInterface {

    default String getSomeString() {
        return "some string";
    }

}
