package com.matt.observerpattern.pluginsdonotknowproducer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PluginEventProducer {
    private Map<String, PluginListenerInterface> listenerMap = new ConcurrentHashMap<>();

    public void addListener(String id, PluginListenerInterface listener) {
        listenerMap.put(id, listener);
    }

    public void removeListener(String id) {
        if (listenerMap.containsKey(id)) listenerMap.remove(id);
    }

    public void sendEvent(String eventMessage){
        listenerMap.values().forEach(x -> x.onEvent(eventMessage));
    }

}
