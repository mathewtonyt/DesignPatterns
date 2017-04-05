package com.matt.strategypattern;

/**
 * Created by mtony on 4/3/17.
 */
public class PluginB implements Plugin{

    @Override
    public String doJob1(String input) {
        return "Bjob1";
    }

    @Override
    public String doJob2(String input) {
        return "Bjob2";
    }
}
