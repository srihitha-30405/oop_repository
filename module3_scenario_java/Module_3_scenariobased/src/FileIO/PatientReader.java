package FileIO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PatientReader {
    public static void main(String[] args) {
        String fileName = "patients.txt";
        int patientCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Patients with names starting with 'J':");
            while ((line = reader.readLine()) != null) {
                patientCount++;
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[1].trim();
                    if (name.startsWith("J")) {
                        System.out.println("- " + name);
                    }
                }
            }
            System.out.println("Total number of patients: " + patientCount);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
