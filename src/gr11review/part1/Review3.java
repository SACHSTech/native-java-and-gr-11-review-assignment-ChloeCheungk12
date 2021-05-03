package gr11review.part1;
 
import java.io.*;


/**
* A program that prints the odd numbers from 20 to 100 and prints the numbers from 29 to 2 in decreasing order. 
* You will need to create two separate loops with a blank line between them.
* @author: Chloe Cheung
*
*/

public class Review3{
  public static void main(String[] args) throws IOException{
        
        // for loop to count in ascending order
        for (int intCount = 21; intCount < 100; intCount++) {
            System.out.println(intCount);
            intCount += 1;
        }
        
        // for loop to loop in decsending order
        System.out.println("");
        for (int intCount = 29; intCount >= 2; intCount--) {
            System.out.println(intCount);
        }
    }
}
 
