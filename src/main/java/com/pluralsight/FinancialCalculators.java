package com.pluralsight;
import java.util.Scanner;
public class FinancialCalculators {

    public static void main(String[] args) {

       //if statement for selecting a calculator mode
        Scanner keyboard = new Scanner(System.in);
            int choice;
        System.out.print("Select your calculator mode:\n");
        System.out.println("\t (1.)Mortgage");
        System.out.println("\t (2.)Compound Interest\n");
        choice = keyboard.nextInt();

        if(choice == 1)
        {
            mortgageCalc();
        }
        else if(choice == 2)
        {
            compoundInterest();
        }




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

    }//end morgCalc


    //calculates and displays compound interest
    public static void compoundInterest(){
        //declare local variables
        Scanner keyboard = new Scanner(System.in);
        double deposit = 0.0;
        double interestRate = 0.0;
        double years = 0.0;
        // get user input
        System.out.print("Enter the deposit amount: $");
        deposit = keyboard.nextDouble();
        System.out.print("Enter the interest rate: ");
        interestRate = keyboard.nextDouble();
        interestRate /= 100;
        System.out.print("Enter the number of years: ");
        years = keyboard.nextDouble();

        // calculations

        double futureValue = deposit;

        for(int i = 0; i < years; i++){
            futureValue *= (1 + interestRate);
        }

        double totalInterest;

        totalInterest = futureValue - deposit;

        // display data

        System.out.printf("Your future value after %.2f   years would be: $%.2f" , years,futureValue);

        System.out.printf("Total amount interest earned: $%.2f" , totalInterest );
    }



}
