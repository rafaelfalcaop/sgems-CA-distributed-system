package org.sgems.reporting;

import io.grpc.stub.StreamObserver;

public class DiscriminationReportingServiceImpl extends DiscriminationReportingServiceGrpc.DiscriminationReportingServiceImplBase {

    // 1. Unary RPC
    @Override
    public void submitIncidentReport(IncidentRequest request, StreamObserver<IncidentResponse> responseObserver) {

        String reportId = request.getReportId();

        IncidentResponse response = IncidentResponse.newBuilder()
                .setStatus("Report submitted")
                .setAssignedOfficer("Officer123")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Report received: " + reportId);
    }

    // 2. Server Streaming RPC
    @Override
    public void getIncidentUpdates(IncidentUpdateRequest request, StreamObserver<IncidentUpdate> responseObserver) {

        String reportId = request.getReportId();

        String[] updates = {
            "Case received",
            "Under review",
            "Investigation ongoing"
        };

        for (String update : updates) {

            IncidentUpdate response = IncidentUpdate.newBuilder()
                    .setUpdateMessage(update)
                    .setUpdateTimestamp(String.valueOf(System.currentTimeMillis()))
                    .build();

            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();

        System.out.println("Streaming updates for report: " + reportId);
    }

    // 3. Bidirectional Streaming RPC
    @Override
    public StreamObserver<LiveMessage> liveCaseCommunication(StreamObserver<LiveMessage> responseObserver) {

        return new StreamObserver<LiveMessage>() {

            @Override
            public void onNext(LiveMessage message) {

                System.out.println("Received message: " + message.getMessage());

                LiveMessage response = LiveMessage.newBuilder()
                        .setMessage("Acknowledged: " + message.getMessage())
                        .setRole("Officer")
                        .build();

                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error in live communication");
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
                System.out.println("Live communication ended");
            }
        };
    }
}