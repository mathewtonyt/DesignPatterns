package com.matt.singleton;

/**
 *
 * 1. volatile - is used to make this thread safe with multiple processor.
 * 2. two instance is null check is because the lock for synchronouziation is expensive.
 */
public class PluginAThreadSafe {
    private static volatile PluginAThreadSafe instance;

    private PluginAThreadSafe() {
    }

    public static PluginAThreadSafe getInstance() {
        if (instance == null) {
            synchronized (PluginAThreadSafe.class) {
                if (instance == null) {
                    instance = new PluginAThreadSafe();
                }
            }
        }
        return instance;
    }

}
