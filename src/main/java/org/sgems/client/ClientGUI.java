package org.sgems.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

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

        SalaryMonitoringServiceGrpc.SalaryMonitoringServiceStub salaryAsyncStub =
                SalaryMonitoringServiceGrpc.newStub(salaryChannel);

        DiscriminationReportingServiceGrpc.DiscriminationReportingServiceBlockingStub reportingStub =
                DiscriminationReportingServiceGrpc.newBlockingStub(reportingChannel);

        LeadershipRepresentationServiceGrpc.LeadershipRepresentationServiceBlockingStub leadershipStub =
                LeadershipRepresentationServiceGrpc.newBlockingStub(leadershipChannel);

        JFrame frame = new JFrame("SGEMS Client");
        frame.setSize(650, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ===== SALARY =====
        JLabel salaryTitle = new JLabel("Salary Monitoring Service");
        salaryTitle.setBounds(20, 10, 300, 20);

        JLabel deptLabel = new JLabel("Department ID:");
        deptLabel.setBounds(20, 35, 150, 20);

        JTextField deptField = new JTextField();
        deptField.setBounds(180, 35, 150, 25);

        JLabel yearLabel = new JLabel("Year:");
        yearLabel.setBounds(20, 65, 150, 20);

        JTextField yearField = new JTextField();
        yearField.setBounds(180, 65, 150, 25);

        JLabel salaryDesc = new JLabel("Calculates gender pay gap for a department and year");
        salaryDesc.setBounds(20, 95, 400, 20);

        JButton payGapBtn = new JButton("Calculate Pay Gap");
        payGapBtn.setBounds(20, 120, 150, 25);

        JButton streamBtn = new JButton("Stream Salary Stats");
        streamBtn.setBounds(180, 120, 170, 25);
        
        // ===== REPORTING =====
        JLabel reportTitle = new JLabel("Discrimination Reporting Service");
        reportTitle.setBounds(20, 170, 300, 20);

        JLabel reportIdLabel = new JLabel("Report ID:");
        reportIdLabel.setBounds(20, 195, 150, 20);

        JTextField reportIdField = new JTextField();
        reportIdField.setBounds(180, 195, 150, 25);

        JLabel descLabel = new JLabel("Description:");
        descLabel.setBounds(20, 225, 150, 20);

        JTextField descField = new JTextField();
        descField.setBounds(180, 225, 150, 25);

        JLabel genderLabel = new JLabel("Reporter Gender:");
        genderLabel.setBounds(20, 255, 150, 20);

        JTextField genderField = new JTextField();
        genderField.setBounds(180, 255, 150, 25);

        JLabel reportDesc = new JLabel("Submit a discrimination report");
        reportDesc.setBounds(20, 285, 300, 20);

        JButton reportBtn = new JButton("Submit Report");
        reportBtn.setBounds(20, 310, 200, 25);

        // ===== LEADERSHIP =====
        JLabel leaderTitle = new JLabel("Leadership Representation Service");
        leaderTitle.setBounds(20, 360, 300, 20);

        JLabel orgLabel = new JLabel("Organization ID:");
        orgLabel.setBounds(20, 385, 150, 20);

        JTextField orgField = new JTextField();
        orgField.setBounds(180, 385, 150, 25);

        JLabel leaderDesc = new JLabel("Retrieve leadership gender distribution");
        leaderDesc.setBounds(20, 415, 300, 20);

        JButton leaderBtn = new JButton("Get Representation Stats");
        leaderBtn.setBounds(20, 440, 250, 25);

        // ===== OUTPUT =====
        JTextArea output = new JTextArea();
        output.setLineWrap(true);
        output.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(output);
        scroll.setBounds(350, 35, 260, 450);

        // ===== ACTIONS =====

        payGapBtn.addActionListener(e -> {
            try {

                if (yearField.getText().isEmpty()) {
                    output.setText("Please enter a valid year");
                    return;
                }

                PayGapRequest req = PayGapRequest.newBuilder()
                        .setDepartmentId(deptField.getText())
                        .setYear(Integer.parseInt(yearField.getText()))
                        .build();

                PayGapResponse res = salaryStub.calculatePayGap(req);

                output.setText(
                        "Male Avg: " + res.getAverageMaleSalary() +
                        "\nFemale Avg: " + res.getAverageFemaleSalary() +
                        "\nGap: " + res.getPayGapPercentage() + "%"
                );

            } catch (Exception ex) {
                output.setText("Error: invalid input");
            }
        });

        streamBtn.addActionListener(e -> {

            output.setText("");

            SalaryStatsRequest req = SalaryStatsRequest.newBuilder()
                    .setDepartmentId(deptField.getText())
                    .build();

            salaryAsyncStub.streamSalaryStatistics(req, new StreamObserver<SalaryStatsResponse>() {

                @Override
                public void onNext(SalaryStatsResponse value) {
                    output.append(value.getMonth() + ": " + value.getAverageSalary() + "\n");
                }

                @Override
                public void onError(Throwable t) {
                    output.append("Error streaming\n");
                }

                @Override
                public void onCompleted() {
                    output.append("Stream finished\n");
                }
            });
        });

        reportBtn.addActionListener(e -> {
            try {
                IncidentRequest req = IncidentRequest.newBuilder()
                        .setReportId(reportIdField.getText())
                        .setDescription(descField.getText())
                        .setReporterGender(genderField.getText())
                        .setTimestamp(String.valueOf(System.currentTimeMillis()))
                        .build();

                IncidentResponse res = reportingStub.submitIncidentReport(req);

                output.setText(
                        "Status: " + res.getStatus() +
                        "\nOfficer: " + res.getAssignedOfficer()
                );

            } catch (Exception ex) {
                output.setText("Error submitting report");
            }
        });

        leaderBtn.addActionListener(e -> {
            try {
                RepresentationRequest req = RepresentationRequest.newBuilder()
                        .setOrganizationId(orgField.getText())
                        .build();

                RepresentationResponse res = leadershipStub.getRepresentationStats(req);

                output.setText(
                        "Total Leaders: " + res.getTotalLeaders() +
                        "\nFemale: " + res.getFemaleLeaders() +
                        "\nMale: " + res.getMaleLeaders() +
                        "\nNon-binary: " + res.getNonBinaryLeaders() +
                        "\nRepresentation %: " + res.getRepresentationPercentage()
                );

            } catch (Exception ex) {
                output.setText("Error fetching data");
            }
        });

        // ===== ADD =====
        frame.add(salaryTitle);
        frame.add(deptLabel);
        frame.add(deptField);
        frame.add(yearLabel);
        frame.add(yearField);
        frame.add(salaryDesc);
        frame.add(payGapBtn);
        frame.add(streamBtn);

        frame.add(reportTitle);
        frame.add(reportIdLabel);
        frame.add(reportIdField);
        frame.add(descLabel);
        frame.add(descField);
        frame.add(genderLabel);
        frame.add(genderField);
        frame.add(reportDesc);
        frame.add(reportBtn);

        frame.add(leaderTitle);
        frame.add(orgLabel);
        frame.add(orgField);
        frame.add(leaderDesc);
        frame.add(leaderBtn);

        frame.add(scroll);

        frame.setVisible(true);
    }
}