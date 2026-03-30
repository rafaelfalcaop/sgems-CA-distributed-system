package org.sgems.naming;

import java.util.HashMap;
import java.util.Map;

public class ServiceRegistry {

    private static final Map<String, String> registry = new HashMap<>();

    public static void register(String serviceName, String address) {
        registry.put(serviceName, address);
        System.out.println("Service registered: " + serviceName + " -> " + address);
    }

    public static String discover(String serviceName) {
        return registry.get(serviceName);
    }
}