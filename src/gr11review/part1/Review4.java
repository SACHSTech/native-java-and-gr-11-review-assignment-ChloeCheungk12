package gr11review.part1;

import java.io.*;
import java.text.DecimalFormat;

public class Review4{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    int intNumItems;
    intNumItems = Integer.parseInt(key.readLine());
    for (int intCount = 1; intCount <= intNumItems; intCount++){
        System.out.print('Enter the price for item ' + intCount + ":");
         
    }
