package org.sgems.naming;

import java.util.HashMap;
import java.util.Map;

public class NamingServer {

    private static Map<String, String> registry = new HashMap<>();

    // register service
    public static void register(String serviceName, String address) {
        registry.put(serviceName, address);
        System.out.println("Registered: " + serviceName + " -> " + address);
    }

    // discover service
    public static String discover(String serviceName) {
        return registry.get(serviceName);
    }

    public static void main(String[] args) {

        System.out.println("Naming Service started...");

        // Example registrations (simulação)
        register("SalaryService", "localhost:50051");
        register("ReportingService", "localhost:50052");
        register("LeadershipService", "localhost:50053");

        System.out.println("Available services:");
        registry.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}