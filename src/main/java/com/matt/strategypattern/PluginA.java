package com.matt.strategypattern;

/**
 * Created by mtony on 4/3/17.
 */
public class PluginA implements Plugin{

    @Override
    public String doJob1(String input) {
        return "Ajob1";
    }

    @Override
    public String doJob2(String input) {
        return "Ajob2";
    }
}
