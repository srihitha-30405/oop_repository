package module;

import java.io.*;

public class PatientReportProcessor {
    public static void main(String[] args) {
        String fileName = "reports.txt";
        int totalPatients = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Patients with Positive results:");
            while ((line = reader.readLine()) != null) {
                totalPatients++;
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String result = parts[1].trim();
                    if (result.equalsIgnoreCase("Positive")) {
                        System.out.println("- " + name);
                    }
                }
            }
            System.out.println("Total number of patients: " + totalPatients);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
