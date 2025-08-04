package baruedanactivity1;

import java.util.Scanner;

public class BARUEDANACTIVITY1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int subjects, grade, total = 0;
        double average;

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        for (int i = 1 ; i <= subjects; i++) {
            System.out.print("Enter grade for subject " + i + ": ");
            grade = sc.nextInt();
            total += grade;
        }

        average = (double) total / subjects;

        System.out.printf("\nStudent Name: %s\n", name);
        System.out.printf("Average: %.2f\n", average);

        if (average >= 75) {
            System.out.println("Remarks: PASSED");
        } else {
            System.out.println("Remarks: FAILED");
        }

        sc.close();
    }
}