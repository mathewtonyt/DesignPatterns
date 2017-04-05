package com.matt.commandpattern;

import java.util.List;

public class Executor {
    public void execute(List<Plugin> plugins) {
        plugins.stream()
                .forEach(e -> {
                    System.out.println("------ started the job -------");
                    System.out.println(e.doJob1("test1"));
                    System.out.println(e.doJob2("test2"));
                    System.out.println("------ completed the job -------");
                });
    }
}
