package com.matt.observerpattern.pluginsdonotknowproducer;

public class Main {
    public static void main(String[] args) {
        PluginEventProducer producer = new PluginEventProducer();
        producer.addListener("id1", new PluginListener1());
        producer.addListener("id2", new PluginListener2());
        producer.sendEvent("yo rocking");
    }
}
