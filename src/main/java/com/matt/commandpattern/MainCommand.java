package com.matt.commandpattern;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mtony on 4/1/17.
 */
public class MainCommand {
    public static void main(String[] args) {
        List<Plugin> plugins = Arrays.asList(new PluginA(), new PluginB());
        new Executor().execute(plugins);

    }
}
