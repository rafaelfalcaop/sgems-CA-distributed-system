package org.sgems.salary;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SalaryServer {

    public static void main(String[] args) {

        try {
            Server server = ServerBuilder.forPort(50051)
                    .addService(new SalaryServiceImpl())
                    .build();

            server.start();

            System.out.println("SalaryMonitoringService running on port 50051...");

            server.awaitTermination();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}