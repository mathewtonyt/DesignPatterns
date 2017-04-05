package com.matt.strategypattern;

/**
 * Created by mtony on 4/3/17.
 */
public class PluginExecutor {
    private Plugin plugin;

    public PluginExecutor(Plugin plugin) {
        this.plugin = plugin;
    }

    public void execute(String message) {
        System.out.println(plugin.doJob1(message));
        System.out.println(plugin.doJob2(message));
    }
}
