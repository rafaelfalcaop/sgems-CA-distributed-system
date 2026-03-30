package org.sgems.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.sgems.salary.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI {

    public static void main(String[] args) {

        // conexão com SalaryService
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        SalaryMonitoringServiceGrpc.SalaryMonitoringServiceBlockingStub stub =
                SalaryMonitoringServiceGrpc.newBlockingStub(channel);

        // GUI
        JFrame frame = new JFrame("SGEMS Client");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField departmentField = new JTextField();
        JTextField yearField = new JTextField();
        JButton button = new JButton("Calculate Pay Gap");
        JTextArea resultArea = new JTextArea();

        departmentField.setBounds(50, 30, 300, 30);
        yearField.setBounds(50, 70, 300, 30);
        button.setBounds(50, 110, 300, 30);
        resultArea.setBounds(50, 150, 300, 80);

        frame.add(departmentField);
        frame.add(yearField);
        frame.add(button);
        frame.add(resultArea);

        frame.setLayout(null);
        frame.setVisible(true);

        // ação do botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String dept = departmentField.getText();
                    int year = Integer.parseInt(yearField.getText());

                    PayGapRequest request = PayGapRequest.newBuilder()
                            .setDepartmentId(dept)
                            .setYear(year)
                            .build();

                    PayGapResponse response = stub.calculatePayGap(request);

                    resultArea.setText(
                            "Male Avg: " + response.getAverageMaleSalary() + "\n" +
                            "Female Avg: " + response.getAverageFemaleSalary() + "\n" +
                            "Gap: " + response.getPayGapPercentage() + "%"
                    );

                } catch (Exception ex) {
                    resultArea.setText("Error: " + ex.getMessage());
                }
            }
        });
    }
}