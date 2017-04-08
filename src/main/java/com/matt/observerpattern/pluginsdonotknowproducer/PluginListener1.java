package com.matt.observerpattern.pluginsdonotknowproducer;

public class PluginListener1 implements PluginListenerInterface {

    @Override
    public void onEvent(String message) {
        System.out.printf("plugin1 :: messageEvent ==> %s\n", message);
    }
}
