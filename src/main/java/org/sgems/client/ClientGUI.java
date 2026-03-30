package org.sgems.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import org.sgems.salary.*;
import org.sgems.reporting.*;
import org.sgems.leadership.*;

import javax.swing.*;

public class ClientGUI {

    public static void main(String[] args) {

        ManagedChannel salaryChannel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
        ManagedChannel reportingChannel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        ManagedChannel leadershipChannel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();

        SalaryMonitoringServiceGrpc.SalaryMonitoringServiceBlockingStub salaryStub =
                SalaryMonitoringServiceGrpc.newBlockingStub(salaryChannel);

        DiscriminationReportingServiceGrpc.DiscriminationReportingServiceBlockingStub reportingStub =
                DiscriminationReportingServiceGrpc.newBlockingStub(reportingChannel);

        LeadershipRepresentationServiceGrpc.LeadershipRepresentationServiceBlockingStub leadershipStub =
                LeadershipRepresentationServiceGrpc.newBlockingStub(leadershipChannel);

        JFrame frame = new JFrame("SGEMS Client");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel salaryLabel = new JLabel("Salary Service");
        salaryLabel.setBounds(20, 10, 200, 20);

        JTextField deptField = new JTextField();
        deptField.setBounds(20, 30, 200, 25);

        JTextField yearField = new JTextField();
        yearField.setBounds(20, 60, 200, 25);

        JButton salaryBtn = new JButton("Calculate Pay Gap");
        salaryBtn.setBounds(20, 90, 200, 25);

        JLabel reportLabel = new JLabel("Reporting Service");
        reportLabel.setBounds(20, 130, 200, 20);

        JTextField reportIdField = new JTextField();
        reportIdField.setBounds(20, 150, 200, 25);

        JButton reportBtn = new JButton("Submit Report");
        reportBtn.setBounds(20, 180, 200, 25);

        JLabel leaderLabel = new JLabel("Leadership Service");
        leaderLabel.setBounds(20, 220, 200, 20);

        JTextField orgField = new JTextField();
        orgField.setBounds(20, 240, 200, 25);

        JButton leaderBtn = new JButton("Get Stats");
        leaderBtn.setBounds(20, 270, 200, 25);

        JTextArea output = new JTextArea();
        output.setBounds(250, 30, 200, 300);

        salaryBtn.addActionListener(e -> {
            try {
                PayGapRequest req = PayGapRequest.newBuilder()
                        .setDepartmentId(deptField.getText())
                        .setYear(Integer.parseInt(yearField.getText()))
                        .build();

                PayGapResponse res = salaryStub.calculatePayGap(req);
                output.setText("Gap: " + res.getPayGapPercentage());

            } catch (Exception ex) {
                output.setText("Error: " + ex.getMessage());
            }
        });

        reportBtn.addActionListener(e -> {
            try {
                IncidentRequest req = IncidentRequest.newBuilder()
                        .setReportId(reportIdField.getText())
                        .setDescription("Test")
                        .setReporterGender("Unknown")
                        .setTimestamp(String.valueOf(System.currentTimeMillis()))
                        .build();

                IncidentResponse res = reportingStub.submitIncidentReport(req);
                output.setText("Report: " + res.getStatus());

            } catch (Exception ex) {
                output.setText("Error: " + ex.getMessage());
            }
        });

        leaderBtn.addActionListener(e -> {
            try {
                RepresentationRequest req = RepresentationRequest.newBuilder()
                        .setOrganizationId(orgField.getText())
                        .build();

                RepresentationResponse res = leadershipStub.getRepresentationStats(req);
                output.setText("Leadership %: " + res.getRepresentationPercentage());

            } catch (Exception ex) {
                output.setText("Error: " + ex.getMessage());
            }
        });

        frame.add(salaryLabel);
        frame.add(deptField);
        frame.add(yearField);
        frame.add(salaryBtn);

        frame.add(reportLabel);
        frame.add(reportIdField);
        frame.add(reportBtn);

        frame.add(leaderLabel);
        frame.add(orgField);
        frame.add(leaderBtn);

        frame.add(output);

        frame.setVisible(true);
    }
}