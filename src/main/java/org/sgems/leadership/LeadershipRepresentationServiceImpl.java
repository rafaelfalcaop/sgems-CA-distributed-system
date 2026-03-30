package org.sgems.leadership;

import io.grpc.stub.StreamObserver;

public class LeadershipRepresentationServiceImpl extends LeadershipRepresentationServiceGrpc.LeadershipRepresentationServiceImplBase {

    // 1. Unary RPC
    @Override
    public void getRepresentationStats(RepresentationRequest request, StreamObserver<RepresentationResponse> responseObserver) {

        String orgId = request.getOrganizationId();

        int total = 100;
        int female = 40;
        int male = 55;
        int nonBinary = 5;

        double percentage = ((double) female / total) * 100;

        RepresentationResponse response = RepresentationResponse.newBuilder()
                .setTotalLeaders(total)
                .setFemaleLeaders(female)
                .setMaleLeaders(male)
                .setNonBinaryLeaders(nonBinary)
                .setRepresentationPercentage(percentage)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Stats requested for org: " + orgId);
    }

    // 2. Client Streaming RPC
    @Override
    public StreamObserver<LeaderData> uploadLeadershipData(StreamObserver<UploadResponse> responseObserver) {

        return new StreamObserver<LeaderData>() {

            int count = 0;

            @Override
            public void onNext(LeaderData data) {
                count++;
                System.out.println("Received leader: " + data.getLeaderId());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error receiving leadership data");
            }

            @Override
            public void onCompleted() {

                UploadResponse response = UploadResponse.newBuilder()
                        .setUploadStatus("Received " + count + " records")
                        .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();

                System.out.println("Finished uploading leadership data");
            }
        };
    }

    // 3. Server Streaming RPC
    @Override
    public void streamRepresentationChanges(RepresentationRequest request, StreamObserver<RepresentationChange> responseObserver) {

        String orgId = request.getOrganizationId();

        String[] changes = {
            "New female leader appointed",
            "Leadership diversity improved",
            "New policy implemented"
        };

        double[] percentages = {41.0, 43.0, 45.0};

        for (int i = 0; i < changes.length; i++) {

            RepresentationChange response = RepresentationChange.newBuilder()
                    .setChangeDescription(changes[i])
                    .setUpdatedPercentage(percentages[i])
                    .build();

            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();

        System.out.println("Streaming representation changes for org: " + orgId);
    }
}