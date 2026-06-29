package buscs2;

import java.io.*;
import java.util.Scanner;

public class User {

    public String searchBus(String destination) {

        String filename = "Buses.txt";

        try {

            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(filename));

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                if (line.contains(destination)) {
                    bufferedReader.close();
                    return line;
                }
            }

            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    public void Request() {

        String filename = "Requests.txt";

        try {

            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(filename, true));

            Scanner input = new Scanner(System.in);

            System.out.print("Enter ID: ");
            String id = input.nextLine();

            System.out.print("Enter Request: ");
            String request = input.nextLine();

            bufferedWriter.write(id + " : " + request + ".");
            bufferedWriter.newLine();
            bufferedWriter.close();

            System.out.println("Your request has been submitted.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void complaint() {

        String filename = "Complaints.txt";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your complaint: ");
        String complaint = input.nextLine();

        try {

            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(filename, true));

            bufferedWriter.write("Complaint: " + complaint);
            bufferedWriter.newLine();
            bufferedWriter.close();

            System.out.println("Your complaint has been submitted.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}