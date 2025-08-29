import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter Marks (0-100): ");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
           System.out.println("Grade: A+ (Excellent)");
        } 
        else if (marks >= 75) {
          System.out.println("Grade: A (Very Good)");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: B (Good)");
        } 
        else if (marks >= 40) {
            System.out.println("Grade: C (Pass)");
        } 
        else if (marks >= 0) {
            System.out.println("Grade: F (Fail)");
        } 
        else {
            System.out.println("Invalid Marks! Please enter between 0 and 100.");
        }

        sc.close();
    }
}