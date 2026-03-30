package org.sgems.reporting;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ReportingServer {

    public static void main(String[] args) {

        try {
            Server server = ServerBuilder.forPort(50052)
                    .addService(new DiscriminationReportingServiceImpl())
                    .build();

            server.start();

            System.out.println("DiscriminationReportingService running on port 50052...");

            server.awaitTermination();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}