package gr11review.part1;
 
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
 
public class Review6{
  public static void main(String[] args) throws IOException{
    // Buffered Reader
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        
        // Changed decimal format
        NumberFormat numberFormat = new DecimalFormat("###0.00");
        
        // Declare variables
        Double dblPrice;
        double dblSubtotal;
        double dblTax;
        double dblTotal;

        // Initialize variables
        dblSubtotal = 0;
        dblPrice = 1.0;
 
        // While loop
        while(dblPrice != 0) {
            System.out.print("Enter the price for an item: ");
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
