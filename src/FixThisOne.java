import java.util.Scanner;
/**
 * @author Corrina Merasty-Gallant
 * @version 1.0
 * @date September 12, 2013
 * @param void
 */

//declaring the class of this code project
public class FixThisOne {

	public static void main(String[] args) {
		//This program will ask the user how many eggs they would like to order.
		
		//The next block of code is declaring 3 float variables and one int variable.
		
		final float PRICE_PER_DOZEN = 3.25f;
		final float PRICE_PER_SINGLE = 0.45f;
		int eggs, d, s;
		float dozens_cost, singlesCost, totalCost;
		// this is telling the program to accept the users input via the keyboard.
		Scanner keyboard = new Scanner(System.in);
		//user is prompted with the question of how many eggs are wanted.
		System.out.print("How many eggs do you want? >> ");
		//customers data typed into the keyboard is a new variable named eggs, that holds the # input by user.
		eggs = keyboard.nextInt();
		//below are the methods declared to start calculating the amount of eggs input by the user.
		d = eggs / 12;
		s = eggs % 12;
		dozens_cost = d * PRICE_PER_DOZEN;
		singlesCost = s * PRICE_PER_SINGLE;
		totalCost = dozens_cost + singlesCost;
		
		/*
		 *The below info will print out the results input by the user, after being passed through calculation in the methods above
		 *and a the result will be printed on the screen.
		 */
		System.out.println("You ordered " + eggs + " eggs in total.");
		System.out.println("That's " + d + " dozen at $3.25, or $" + dozens_cost);
		System.out.println("That's " + s + " singles at 45 cents, or $ " + singlesCost);
		System.out.println("Your total cost is $ " + totalCost);
	}

}
