import java.util.Scanner;

public class BasicMarkSheet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Mark Sheet Generator ---");

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        if (obtainedMarks > totalMarks || totalMarks <= 0) {
            System.out.println("Error: Invalid marks entered. Please restart the program.");
            return; 
        }

        
        double percentage = (obtainedMarks / totalMarks) * 100;

        String grade;
        double gpa;


        if (percentage >= 85) {
            grade = "A";
            gpa = 4.0;
        } else if (percentage >= 75) {
            grade = "B";
            gpa = 3.0;
        } else if (percentage >= 65) {
            grade = "C";
            gpa = 2.0;
        } else if (percentage >= 50) {
            grade = "D";
            gpa = 1.0;
        } else {
            grade = "F";
            gpa = 0.0;
        }

        System.out.println("\n=================================");
        System.out.println("       OFFICIAL MARK SHEET       ");
        System.out.println("=================================");
        System.out.println("Student Name   : " + name);
        System.out.println("---------------------------------");
        System.out.println("Total Marks    : " + totalMarks);
        System.out.println("Obtained Marks : " + obtainedMarks);
        System.out.println("---------------------------------");
        System.out.println("Percentage     : " + percentage + " %");
        System.out.println("Grade          : " + grade);
        System.out.println("GPA            : " + gpa);
        System.out.println("=================================\n");

        scanner.close();
    }
}