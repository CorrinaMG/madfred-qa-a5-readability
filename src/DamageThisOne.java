import java.util.Scanner;

public class DamageThisOne {
	
	
	
		public static void main(String[] args) 
		
		//This section is a list of some things and that a box will apear sometime
{int ticketNumber, stem, cD; Scanner sc = new Scanner(System.in);
		
		/* Some calculations 
		 */
System.out.print("Please enter a six-digit ticket number: ");ticketNumber = sc.nextInt();stem = ticketNumber / 10;cD = ticketNumber % 10;	

		/* checking the ticket
		 */
while (cD != stem % 7) {
System.out.println("That is NOT a valid ticket number, bucko!");
System.out.print("Try again: ");ticketNumber = sc.nextInt();stem = ticketNumber / 10;cD = ticketNumber % 10;	
}
	//print message					
System.out.println("That is a valid ticket number, well done!");

}

}


//DONE BY CORRINA MERASTY-GALLANT