package com.matt.strategypattern.lamda;

import java.util.function.Function;

/**
 * Created by mtony on 4/5/17.
 */
public class PluginExecutor {
    private Function<String, String> doJob1;
    private Function<String, String> doJob2;

    public PluginExecutor(Function<String, String> doJob1, Function<String, String> doJob2) {
        this.doJob1 = doJob1;
        this.doJob2 = doJob2;
    }

    public void execute(String input1, String input2) {
        System.out.println(this.doJob1.apply(input1));
        System.out.println(this.doJob2.apply(input2));
    }
}
