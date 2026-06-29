package buscs2;

import java.util.Scanner;

public class BusCs2 {

    public static void main(String[] args) {

        Administrator administrator = new Administrator();
        User user = new User();
        Scanner input = new Scanner(System.in);

        int userChoice;
        int choice;

        do {

            System.out.println("\n===== BUS MANAGEMENT SYSTEM =====");
            System.out.println("1. Administrator");
            System.out.println("2. User");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            userChoice = input.nextInt();
            input.nextLine();

            switch (userChoice) {

                case 1:

                    System.out.println("\nAdministrator Menu");
                    System.out.println("1. Add Bus");
                    System.out.println("2. Delete Bus");
                    System.out.println("3. Update Requests");
                    System.out.println("4. Generate Report");
                    System.out.print("Enter your choice: ");

                    choice = input.nextInt();
                    input.nextLine();

                    switch (choice) {

                        case 1:

                            System.out.print("Enter Bus Code: ");
                            String code = input.nextLine();

                            System.out.print("Enter Destination: ");
                            String destination = input.nextLine();

                            System.out.print("Enter Other Info: ");
                            String otherInfo = input.nextLine();

                            administrator.addBus(
                                    new Bus(code, destination, otherInfo));

                            break;

                        case 2:

                            System.out.print("Enter Bus Code: ");
                            code = input.nextLine();

                            administrator.deleteBus(code);

                            break;

                        case 3:

                            administrator.updateRequests();

                            break;

                        case 4:

                            System.out.print("Enter Bus Code/Destination/Info: ");
                            String search = input.nextLine();

                            administrator.reports(search);

                            break;

                        default:
                            System.out.println("Invalid choice.");
                    }

                    break;

                case 2:

                    System.out.println("\nUser Menu");
                    System.out.println("1. Search Bus");
                    System.out.println("2. Make Request");
                    System.out.println("3. Make Complaint");
                    System.out.print("Enter your choice: ");

                    choice = input.nextInt();
                    input.nextLine();

                    switch (choice) {

                        case 1:

                            System.out.print("Enter Bus Code or Destination: ");
                            String result = user.searchBus(input.nextLine());

                            if (result.isEmpty())
                                System.out.println("No bus found.");
                            else
                                System.out.println(result);

                            break;

                        case 2:

                            user.Request();

                            break;

                        case 3:

                            user.complaint();

                            break;

                        default:

                            System.out.println("Invalid choice.");
                    }

                    break;

                case 0:

                    System.out.println("Goodbye!");
                    break;

                default:

                    System.out.println("Invalid choice.");
            }

        } while (userChoice != 0);

        input.close();
    }
}