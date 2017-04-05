package com.matt.strategypattern.lamda;

/**
 * Created by mtony on 4/5/17.
 */
public class mainClass {
    public static void main(String[] args) {
        PluginExecutor pluginExecutor =
                new PluginExecutor(PluginLambaUtils::doJob1, PluginLambaUtils::doJob2);
        pluginExecutor.execute("value1", "value2");
    }
}
