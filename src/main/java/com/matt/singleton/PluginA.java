package com.matt.singleton;

/**
 * <p>
 * This class get created when the classLoader is loaded
 * 1) if the class is not used  - the instance will not be created
 * 2) if the class is used rarely - this will not be GCed TODO - is this case true
 * 3) if the class is used frequently  - this is the preferred way of creating the singleton
 * 4) if the singleton uses high memory for storage - then this is not Ple preferred way - as this will not be GCed - TODO - confirm this too
 * 5) This is not thread safe
 */
public class PluginA {
    private static final PluginA INSTANCE = new PluginA();

    private PluginA() {
    }

    public static PluginA getInstance() {
        return INSTANCE;
    }
}
