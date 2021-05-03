package gr11review.part1;
 
import java.io.*;
 
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
 
