package baruedanactivity1;

import java.util.Scanner;
import Banking.bankApp;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankApp bc = new bankApp();
                int attempts = 0;
                boolean success = false;

                while (attempts < 3) {
                    System.out.println("\nEnter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.println("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        success = true;
                        break;
                    } else {
                        attempts++;
                        System.out.println("INVALID ACCOUNT! Attempts left: " + (3 - attempts));
                    }
                }

                if (!success) {
                    System.out.println("\nMaximum login attempts reached. System shutting down...");
                    System.exit(0);
                }

                break;

            case 2:
           
                break;

            case 3:
                
                break;

            default:
                
        }
    }
}
