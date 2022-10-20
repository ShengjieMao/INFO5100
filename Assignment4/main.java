/*
 * Assignment 4
 * Shengjie Mao
 * id #002795042
 * section 08
 */

import java.util.Scanner;
// the main class that calculates and prints out the final weighted grade
public class main {

    /* 
    // method for defining letter grade
    public static char calcLetter(double totalGrade) {
        char letter_grade;
        if ((totalGrade>=90) & (totalGrade<=100)){
            letter_grade = 'A';
        }
        else if ((totalGrade>=80) & (totalGrade<90)){
            letter_grade = 'B';
        }
        else if ((totalGrade>=70) & (totalGrade<80)){
            letter_grade = 'C';
        }
        else if ((totalGrade>=60) & (totalGrade<70)){
            letter_grade = 'D';
        }
        else {
            letter_grade = 'F';
        }
        return letter_grade;
    }
    */

    public static void main (String[] args) {
        // define the input types
        int numb_in;
          
        // get necessary values need from user inputs
        Scanner scanner = new Scanner(System.in);

        // determine the number of the assignments input
        System.out.println("What is the number of assignments: ");
        numb_in = scanner.nextInt();

        double[] raw_grade = new double[numb_in];
        double[] total_grade = new double[numb_in];
        double[] percentage = new double[numb_in];

        for (int i=0; i<numb_in; i++) {
            System.out.println("Enter the raw points: ");
            raw_grade[i] = scanner.nextDouble();
        }
        for (int i=0; i<numb_in; i++) {
            System.out.println("Enter the total points: ");
            total_grade[i] = scanner.nextDouble();
        }
        for (int i=0; i<numb_in; i++) {
            System.out.println("Enter the percentage each assignment weights: ");
            percentage[i] = scanner.nextDouble();
        }

        // get the total weighted score
        double[] weighted = new double[numb_in];
        double total = 0;
        WeightScore test = new WeightScore ();

        // get the final letter grade
        for (int i=0; i<numb_in; i++) {
            weighted[i] = test.weightGrade(total_grade[i], raw_grade[i], percentage[i]);
            total = total + weighted[i];
        }
        scanner.close();

        // return the letter grade result
        char letter_grade;
        letter_grade = test.calcLetter(total);
        System.out.print(total);
        System.out.println("Letter grade is: " + letter_grade);

    }
}
