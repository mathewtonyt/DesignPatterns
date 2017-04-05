package com.matt.commandpattern;

/**
 * Created by mtony on 4/1/17.
 */
public class PluginA implements Plugin {
    @Override
    public String doJob1(String input) {
        return input.concat("Ajob1");
    }

    @Override
    public String doJob2(String input) {
        return input.concat("Ajob2");
    }
}
