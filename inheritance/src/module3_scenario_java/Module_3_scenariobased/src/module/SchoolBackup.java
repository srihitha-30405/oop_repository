package module;

import java.io.*;

public class SchoolBackup {
    public static void main(String[] args) {
        String inputFile = "grades.txt";
        String outputFile = "grades_backup.txt";
        int backupCount = 0;

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int grade;
                    try {
                        grade = Integer.parseInt(parts[1].trim());
                        if (grade > 75) {
                            writer.write(name + "," + grade + "\n");
                            backupCount++;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid grade format for line: " + line);
                    }
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
            System.out.println("Backup completed. Total students backed up: " + backupCount);
        } catch (IOException e) {
            System.out.println("File operation error: " + e.getMessage());
        }
    }
}

