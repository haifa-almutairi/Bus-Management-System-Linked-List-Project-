package buscs2;

import java.io.*;
import java.util.Scanner;

public class Administrator {

    private LinkedList linklist;

    public Administrator() {

        linklist = new LinkedList();

        try {
            String filename = "Buses.txt";
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] parts = line.split(",");

                if (parts.length >= 3) {
                    Bus bus = new Bus(
                            parts[0].trim(),
                            parts[1].trim(),
                            parts[2].trim());

                    linklist.addData(bus);
                }
            }

            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            // Ignore if file doesn't exist yet
        }
    }

    public void addBus(Bus bus) {

        String filename = "Buses.txt";

        try {

            FileWriter fileWriter = new FileWriter(filename, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(bus.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();

            linklist.addData(bus);

            System.out.println("New bus item has been saved:");
            linklist.Display();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteBus(String code) {

        linklist.DeleteNode(code);

        try {

            String filename = "Buses.txt";

            BufferedReader reader =
                    new BufferedReader(new FileReader(filename));

            String buses = "";
            String line;

            boolean deleted = false;

            while ((line = reader.readLine()) != null) {

                if (!line.contains(code)) {
                    buses += line + "\n";
                } else {
                    deleted = true;
                }
            }

            reader.close();

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(filename));

            writer.write(buses);
            writer.close();

            if (deleted)
                System.out.println("Bus item has been deleted.");
            else
                System.out.println("No bus found with given code.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public void updateRequests() {

        String filename = "Requests.txt";
        Scanner input = new Scanner(System.in);

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(filename));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Enter User ID: ");
        String id = input.nextLine();

        System.out.print("Enter Response: ");
        String response = input.nextLine();

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(filename));

            String output = "";
            String line;

            while ((line = reader.readLine()) != null) {

                if (line.contains(id))
                    output += line + " Responded : " + response + "\n";
                else
                    output += line + "\n";
            }

            reader.close();

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(filename));

            writer.write(output);
            writer.close();

            System.out.println("Request updated.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void reports(String data) {

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader("Buses.txt"));

            BufferedWriter writer =
                    new BufferedWriter(new FileWriter("Reports.txt"));

            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {

                if (line.contains(data)) {
                    writer.write(line);
                    writer.newLine();
                    found = true;
                }
            }

            reader.close();
            writer.close();

            if (found)
                System.out.println("Report saved in Reports.txt");
            else
                System.out.println("No matching bus found.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}