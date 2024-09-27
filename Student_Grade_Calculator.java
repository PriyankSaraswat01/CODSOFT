import java.util.Scanner;

public class Student_Grade_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int noOfSubjects = scanner.nextInt();

        
        int[] marks = new int[noOfSubjects];
        int totalMarks = 0;
        
        for (int x = 0; x < noOfSubjects; x++) {
            System.out.print("Enter marks obtained in subject " + (x + 1));
            marks[x] = scanner.nextInt();
            totalMarks += marks[x];
        }

        
        double avgPercentage = (double) totalMarks / noOfSubjects;

        
        char grade;
        if (avgPercentage >= 90) {
            grade = 'A';
        } else if (avgPercentage >= 80) {
            grade = 'B';
        } else if (avgPercentage >= 70) {
            grade = 'C';
        } else if (avgPercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
