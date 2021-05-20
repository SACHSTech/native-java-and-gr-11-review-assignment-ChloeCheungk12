package gr11review.part1;

import java.io.*;

/**
* a program that prompts for a `yearly_amount`, annual `compound_interest_rate`, and outputs the number of years .  
* For compound interest, the interest rate is applied to the existing amount after each year.  
* @author: Chloe Cheung
*
*/


public class Review5{
  public static void main(String[] args) throws IOException{
    // Buffered Reader
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    // Declare Variables
    double yearly_amount;
    double compound_interest_rate;
    double dblTargetAmount;
    double dblAmount;
    int intNumYears;

    // Output to screen and get inputs
    System.out.print("Enter the yearly invested amount: ");
    yearly_amount = Double.parseDouble(key.readLine());
    System.out.print("Enter the compound interest rate: ");
    compound_interest_rate = Double.parseDouble(key.readLine());
    System.out.print("Enter the target amount: ");
    dblTargetAmount = Double.parseDouble(key.readLine());

    // Initialize variables
    dblAmount = 0;
    intNumYears = 0;
    
    // While loop 
    while (dblAmount < dblTargetAmount){
        intNumYears += 1;
        dblAmount += yearly_amount;
        dblAmount += (compound_interest_rate / 100) * dblAmount;
    }

    // Output to screen
    System.out.println("The target amount will be earned in " + intNumYears + " years.");


  }
}