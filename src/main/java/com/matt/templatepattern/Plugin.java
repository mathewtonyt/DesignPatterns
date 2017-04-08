package com.matt.templatepattern;

import java.util.Random;

public class Plugin {
    public Plugin() {
        System.out.println("Plugin created");
    }

    public void usePlugin() {
        riskyOperation();
        System.out.println("Plugin used");
    }

    public void employPlugin() {
        riskyOperation();
        System.out.println("Plugin employed");
    }

    public void dispose() {
        System.out.println("Plugin disposed");
    }

    private void riskyOperation() {
        if (new Random().nextInt(10) == 0) {
            throw new RuntimeException();
        }
    }
}
