package gr11review.part1;
 
import java.io.*;
 
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
