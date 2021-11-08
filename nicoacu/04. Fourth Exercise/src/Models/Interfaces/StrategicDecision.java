package Models.Interfaces;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;



public interface StrategicDecision {

    static void hireStaff() {
        // System.out.println(new File(".").getAbsolutePath()); // Check the absolute path for debugging purposes.
        String absolutePath = new File(".").getAbsolutePath();
        File originalFile = new File(absolutePath + "/java-argentina-lab/nicoacu/04. Fourth Exercise/src/Resources/staff.txt");
        File tempFile = new File(absolutePath + "/java-argentina-lab/nicoacu/04. Fourth Exercise/src/Resources/temporal_staff.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(originalFile))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
                // Below this the try code

                Scanner scanner = new Scanner(System.in);
                System.out.println("Please insert the name of the temporal staff member");
                String name = scanner.nextLine();

                //System.out.println(reader.readLine());

                writer.write(name);
                writer.newLine();
                System.out.println(name);
                writer.close();
                boolean successful = tempFile.renameTo(new File(originalFile + "_" + LocalDateTime.now()));
                System.out.println("Overwritten staff.txt file?: " + successful);

                // Above this the try code
            } catch (IOException e) {
                System.out.println("Error with BufferedWriter");
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error with BufferedReader: File not found. Check if the path is correct");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error with BufferedReader.");
            e.printStackTrace();
        }

    }

    static void fireStaff() {

        // System.out.println(new File(".").getAbsolutePath()); // Check the absolute path for debugging purposes.
        String absolutePath = new File(".").getAbsolutePath();
        File originalFile = new File(absolutePath + "/java-argentina-lab/nicoacu/04. Fourth Exercise/src/Resources/staff.txt");
        File tempFile = new File(absolutePath + "/java-argentina-lab/nicoacu/04. Fourth Exercise/src/Resources/temporal_staff.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(originalFile))) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
                // Below this the try code

                Scanner scanner = new Scanner(System.in);
                System.out.println("Press Enter in the console if you want to fire the temporal staff.");
                String name = scanner.nextLine();

                String currentLine;

                //System.out.println(reader.readLine());

                while ((currentLine = reader.readLine()) == null) {

                    writer.write(currentLine);
                    writer.newLine();
                    System.out.println(currentLine);
                }

                writer.close();
                boolean successful = tempFile.renameTo(originalFile);
                System.out.println("Successfully overwritten staff.txt file: " + successful);

                // Above this the try code
            } catch (IOException e) {
                System.out.println("Error with BufferedWriter");
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error with BufferedReader: File not found. Check if the path is correct");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error with BufferedReader.");
            e.printStackTrace();
        }
    }

}
