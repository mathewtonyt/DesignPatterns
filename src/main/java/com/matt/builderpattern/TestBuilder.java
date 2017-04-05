package com.matt.builderpattern;

/**
 * Created by mtony on 3/17/17.
 */
public class TestBuilder {
    public static void main(String[] args) {
        MyObject myObject = new MyObject.Builder()
                .withFname("aaa")
                .withLname("bbb")
                .withId("123")
                .withSchool("test")
                .build();
    }
}
