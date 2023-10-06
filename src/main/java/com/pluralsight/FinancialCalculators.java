package com.pluralsight;
import java.util.Scanner;
public class FinancialCalculators {

    public static void main(String[] args) {

        mortgageCalc();











    }
        //calculates mortgage and outputs print statements
    public static void mortgageCalc(){

        //declare local variables
        Scanner keyboard = new Scanner(System.in);
        double principal = 0.0;
        double interestRate = 0.0;
        double loanLength = 0.0;
        double monthlyPayment = 0.0;
        double totalInterest = 0.0;

        // ask user for input
        System.out.print("Please enter loan amount: $");
        principal = keyboard.nextDouble();
        System.out.print("Please enter the interest rate: ");
        interestRate = keyboard.nextDouble();
        double interestRateDecimal = interestRate / 1200;
        System.out.print("Please enter the length of the loan (in years): ");
        loanLength = keyboard.nextDouble();

        //  monthly payment calculations

        monthlyPayment = principal * interestRateDecimal / (1 -
                Math.pow((1 + interestRateDecimal), (-1 * (loanLength * 12))));


        // total interest calculations

        totalInterest = (monthlyPayment * (loanLength * 12)) - principal;

        //display data

        System.out.printf("Your monthly payment is: %.2f" , monthlyPayment);
        System.out.println();
        System.out.printf("Your total interest is: %.2f" , totalInterest);


    }






}
