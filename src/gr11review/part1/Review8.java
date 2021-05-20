package gr11review.part1;
 
import java.io.*;


/**
*  A program that simulates 1000 pulls of a slot machine, such that 3 random numbers (between 0 and 8) are generated for each pull.  
* Output the result of each pull on a single line (a space separating the 3 numbers) and the total count of the number times a triple (all 3 numbers equal) was pulled.
* @author: Chloe Cheung
*
*/


public class Review8{
  public static void main(String[] args) throws IOException{
    
    // Declare variables
    int intNumTriples;
    int intFirstNum;
    int intSecondNum;
    int intThirdNum;
    
    // Initialize variables
    intNumTriples = 0;
    
    // For loop that loops 1000 times
    for (int intCount = 0; intCount < 1000; intCount++) {
        // Generate random numbers
        intFirstNum = (int)(Math.random() * 8) + 1;
        intSecondNum = (int)(Math.random() * 8) + 1;
        intThirdNum = (int)(Math.random() * 8) + 1;

        // Output numbers to screen
        System.out.println(intFirstNum + " " + intSecondNum + " " + intThirdNum);

        // If statement to count triples
        if (intFirstNum == intSecondNum && intSecondNum == intThirdNum) {
            intNumTriples++;
        }
        
    }
    // Output to screen
    System.out.print(intNumTriples);
  }
}
