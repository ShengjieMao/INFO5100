/*
 * Assignment 3
 * Shengjie Mao
 * id #002795042
 * section 08
 */

import java.util.Scanner;
// the main class that calculates and prints out the final weighted grade
public class GetGrade {

    

    public static void main (String[] args) {
        // define the input types
        double[] raw_grade = new double[8];
        double[] total_grade = new double[8];
        double[] percentage = new double[8];

        // get necessary values need from user inputs
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<raw_grade.length; i++) {
            System.out.println("Enter the raw points: ");
            raw_grade[i] = scanner.nextDouble();
        }
        for (int i=0; i<total_grade.length; i++) {
            System.out.println("Enter the total points: ");
            total_grade[i] = scanner.nextDouble();
        }
        for (int i=0; i<percentage.length; i++) {
            System.out.println("Enter the percentage each assignment weights: ");
            percentage[i] = scanner.nextDouble();
        }

        // get the total weighted score
        double[] weighted = new double[8];
        double total = 0;
        WeightScore test = new WeightScore ();

        // get the final letter grade
        for (int i=0; i<raw_grade.length; i++) {
            weighted[i] = test.weightGrade(total_grade[i], raw_grade[i], percentage[i]);
            total = total + weighted[i];
        }
        scanner.close();

        // return the letter grade result
        char letter_grade;
        letter_grade = test.calcLetter(total);
        System.out.println("Letter grade is: " + letter_grade);

    }
}
