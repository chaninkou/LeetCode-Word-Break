package example11;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display will show the driving cost.
*/
public class Example11
{ 
    public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
	    double distance;
		double milesPerGallon;
		double pricePerGallon;
		double total;
		
		// Prompt the user to enter the driving distance and store the value
		System.out.print("Enter the driving distance: ");
		distance = in.nextDouble();
		
		// Prompt the user to enter the fuel efficiency of the car in miles per gallon and store the value
        System.out.print("Enter miles per gallon: ");
		milesPerGallon = in.nextDouble();
		
		// Prompt the user to enter the price per gallon and store the value
		System.out.print("Enter price per gallon: ");
		pricePerGallon = in.nextDouble();
	
		//Calculation
		total = (distance/milesPerGallon) * pricePerGallon;
		
		//Display the correct cost of the trip
		System.out.println("The cost of driving is " + "$" + total);
	} 
}