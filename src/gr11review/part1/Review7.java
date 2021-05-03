package gr11review.part1;
 
import java.io.*;
 

/**
* A program that will input a sentence from the user and store it in a String variable called theSentence. 
* Uses the String methods to compute the following about the sentence.
Stats about the sentence:
* There are # characters in the sentence.
* There are # spaces in the sentence.
* There are # letter a in the sentence.
* Taking the odd numbered characters in the sentence produces the following string “---------“
* @author: Chloe Cheung
*
*/

public class Review7{
  public static void main(String[] args) throws IOException{
    // Buffered Reader
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    // Declare variables
    String theSentence;
    String strDashes;
    char charLetter;
    int intCharCount;
    int intSpaceCount;
    int intNumOfA;
    
    // Initialize variables
    intCharCount = 0;
    intCharCount = 0;
    intSpaceCount = 0;
    intNumOfA = 0;
    strDashes = "";
 
    // Gather input
    theSentence = key.readLine();
    
    // For loop that loops once for every character 
    for (int intCount = 0; intCount < theSentence.length(); intCount++) {
        charLetter = theSentence.charAt(intCount);
        intCharCount++;
        // If statements
        if (charLetter == ' ') {
            intSpaceCount++;
        }
        if (charLetter == 'a') {
            intNumOfA++;
        }
        if (intCharCount % 2 == 1) {
            strDashes += "-";
        }
    }

    // Output to screen
    System.out.println("There are " + intCharCount + " characters in the sentence.");
    System.out.println("There are " + intSpaceCount + " spaces in the sentence.");
    System.out.println("There are " + intNumOfA + " letter a in the sentence.");
    System.out.println(strDashes);
    
    }
}

