package org.sgems.salary;

import io.grpc.stub.StreamObserver;

public class SalaryServiceImpl extends SalaryMonitoringServiceGrpc.SalaryMonitoringServiceImplBase {

    @Override
    public void calculatePayGap(PayGapRequest request, StreamObserver<PayGapResponse> responseObserver) {

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
    }
    
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