// Program: Tip Calculator
// Written by: Andrew Nguyen
// Description: Using scanner class I will calculate the tip needed after giving info on meal prices.
// Challenges:: Using the right arguments for different types such as for ints or double variables.
// Time Spent: 2 Hours
//
//                   Revision History
// Date:                   By:               Action:
// ---------------------------------------------------
// 05/31/2018         (initals)       Created
 
 
/* filename must be: Anyname.java */ 
import java.util.Scanner;
import java.util.*;
public class A2Scanner
{ 
public static void main(String args [ ] ) 
{ 
// Your Java statements here 
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please Enter the cost of your meal?");
    double mealCost = keyboard.nextDouble();
    System.out.printf("The cost of your meal: $%.2f\n", mealCost);
    System.out.println("What percentage would you like to tip (15 or 18 or 20)?");
    int percentage = keyboard.nextInt();
    System.out.println("The tip percentage = %" +percentage+ "");
    double totalTip = mealCost/100*percentage;
    System.out.printf("Your tip amount: $%.2f\n", totalTip);
    double billTip = totalTip+mealCost;
    System.out.printf("Your Bill + tip is: $%.2f\n", billTip);
    System.out.println("How many people would you like to split this bill with?");
    int people = keyboard.nextInt();
    System.out.printf("Each person’s share is: $%.2f\n", (billTip/people));
    System.exit(0);
}/*end main method */
}/*end class Anyname*/
