package com.matt.commandpattern;

/**
 * Created by mtony on 4/1/17.
 */
public class PluginB implements Plugin {
    @Override
    public String doJob1(String input) {
        return input.concat("Bjob1");
    }

    @Override
    public String doJob2(String input) {
        return input.concat("Bjob2");
    }
}
