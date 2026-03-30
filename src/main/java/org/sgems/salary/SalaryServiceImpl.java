package org.sgems.salary;

import io.grpc.stub.StreamObserver;
import io.grpc.Status;

public class SalaryServiceImpl extends SalaryMonitoringServiceGrpc.SalaryMonitoringServiceImplBase {

    // 1. Unary RPC com error handling
    @Override
    public void calculatePayGap(PayGapRequest request, StreamObserver<PayGapResponse> responseObserver) {

        try {

            // validações
            if (request.getDepartmentId().isEmpty()) {
                responseObserver.onError(
                        Status.INVALID_ARGUMENT
                                .withDescription("Department ID cannot be empty")
                                .asRuntimeException()
                );
                return;
            }

            if (request.getYear() <= 0) {
                responseObserver.onError(
                        Status.INVALID_ARGUMENT
                                .withDescription("Year must be positive")
                                .asRuntimeException()
                );
                return;
            }

            String department = request.getDepartmentId();
            int year = request.getYear();

            // dados simulados
            double maleAvg = 50000;
            double femaleAvg = 45000;

            double gap = ((maleAvg - femaleAvg) / maleAvg) * 100;

            PayGapResponse response = PayGapResponse.newBuilder()
                    .setAverageMaleSalary(maleAvg)
                    .setAverageFemaleSalary(femaleAvg)
                    .setPayGapPercentage(gap)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

            System.out.println("Processed pay gap for dept: " + department + " year: " + year);

        } catch (Exception e) {
            responseObserver.onError(
                    Status.INTERNAL
                            .withDescription("Error calculating pay gap")
                            .asRuntimeException()
            );
        }
    }

    // 2. Server Streaming RPC
    @Override
    public void streamSalaryStatistics(SalaryStatsRequest request, StreamObserver<SalaryStatsResponse> responseObserver) {

        String department = request.getDepartmentId();

        String[] months = {"Jan", "Feb", "Mar"};

        for (String month : months) {

            SalaryStatsResponse response = SalaryStatsResponse.newBuilder()
                    .setMonth(month)
                    .setAverageSalary(48000)
                    .setGender("Mixed")
                    .build();

            responseObserver.onNext(response);
        }

        responseObserver.onCompleted();

        System.out.println("Streaming salary stats for: " + department);
    }

    // 3. Client Streaming RPC
    @Override
    public StreamObserver<SalaryRecord> uploadSalaryRecords(StreamObserver<UploadStatus> responseObserver) {

        return new StreamObserver<SalaryRecord>() {

            int count = 0;

            @Override
            public void onNext(SalaryRecord record) {
                count++;
                System.out.println("Received record: " + record.getEmployeeId());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error receiving salary records");
            }

            @Override
            public void onCompleted() {

                UploadStatus response = UploadStatus.newBuilder()
                        .setStatus("Received " + count + " records")
                        .build();

                responseObserver.onNext(response);
                responseObserver.onCompleted();

                System.out.println("Finished receiving salary records");
            }
        };
    }
}