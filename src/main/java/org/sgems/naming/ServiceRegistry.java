package org.sgems.naming;

import java.util.HashMap;
import java.util.Map;

public class ServiceRegistry {

    private static Map<String, String> registry = new HashMap<>();

    public static void register(String serviceName, String address) {
        registry.put(serviceName, address);
        System.out.println("Registered: " + serviceName + " -> " + address);
    }

    public static String discover(String serviceName) {
        String address = registry.get(serviceName);

        if (address == null) {
            System.out.println("Service not found: " + serviceName);
        } else {
            System.out.println("Discovered: " + serviceName + " -> " + address);
        }

        return address;
    }
}