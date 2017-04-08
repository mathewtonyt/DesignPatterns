package com.matt.observerpattern.pluginsdonotknowproducer;

public class PluginListener2 implements PluginListenerInterface {

    @Override
    public void onEvent(String message) {
        System.out.printf("plugin2 :: messageEvent ==> %s\n", message);
    }
}
