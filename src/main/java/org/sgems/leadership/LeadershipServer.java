package org.sgems.leadership;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class LeadershipServer {

    public static void main(String[] args) {

        try {
            Server server = ServerBuilder.forPort(50053)
                    .addService(new LeadershipRepresentationServiceImpl())
                    .build();

            server.start();

            System.out.println("LeadershipRepresentationService running on port 50053...");

            server.awaitTermination();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}