package BMICalculator;

import java.util.Scanner;
import java.io.*;
class Student {
    private String name;
    private int rollNumber;
    private double feesPaid;
    private double totalFees;

    public Student(String name, int rollNumber, double totalFees) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalFees = totalFees;
        this.feesPaid = 0;
    }

    public void payFees(double amount) {
        feesPaid += amount;
    }

    public double getRemainingFees() {
        return totalFees - feesPaid;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Fees: " + totalFees);
        System.out.println("Fees Paid: " + feesPaid);
        System.out.println("Remaining Fees: " + getRemainingFees());
    }
}

public class FeesManagementSystem {
	public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = Scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = Scanner.nextInt();

        System.out.print("Enter total fees: ");
        double totalFees = Scanner.nextDouble();

        Student student = new Student(name, rollNumber, totalFees);

        while (true) {
            System.out.println("\n1. Pay Fees");
            System.out.println("2. Display Student Info");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = Scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to pay: ");
                    double amount = Scanner.nextDouble();
                    student.payFees(amount);
                    System.out.println("Fees paid successfully.");
                    break;
                case 2:
                    student.displayInfo();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            
        }
    }
}
}
   


