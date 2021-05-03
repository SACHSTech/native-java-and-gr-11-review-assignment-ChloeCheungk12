package gr11review.part1;
 
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
 
public class Review4{
  public static void main(String[] args) throws IOException{
    // buffered reader
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
    
    // Changed decimal format
    NumberFormat numberFormat = new DecimalFormat("###0.00");
    
    // Declare variables
    int intNumItems;
    double dblPrice;
    double dblSubtotal;
    double dblTax;
    double dblTotal;
    
    // initialize variables
    dblSubtotal = 0;
    intNumItems = 0;
    
    // Output to screen
    System.out.print("How many items do you want to buy? ");
    
    // Get user input
    intNumItems = Integer.parseInt(key.readLine());
    
    // for loop that loops the number of times the user specifies
    for (int intCount = 0; intCount < intNumItems; intCount++){
        System.out.print("Enter the price for item " + (intCount + 1) + ": ");
        dblPrice = Double.parseDouble(key.readLine());
        dblSubtotal += dblPrice;
    }
    
    // Calculate tax, total
    dblTax = dblSubtotal * 0.13;
    dblTotal = dblSubtotal + dblTax;
    
    // Output to screen
    System.out.println("Subtotal: $" + numberFormat.format(dblSubtotal));
    System.out.println("Tax: $" + numberFormat.format(dblTax));
    System.out.println("Total: $" + numberFormat.format(dblTotal));

  }
}
