package com.matt.strategypattern;

/**
 * Created by mtony on 4/3/17.
 */
public class main {
    public static void main(String[] args) {
        PluginExecutor pluginExecutor = new PluginExecutor(new PluginA());
        pluginExecutor.execute("test");
    }
}
