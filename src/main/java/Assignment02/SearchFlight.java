package Assignment02;
import java.util.Scanner;
import java.util.*; 
public class SearchFlight {
		public void search(String Name,String []origin, String Origin, String Destination,  int [] n_seat, String [] destination, int []n_seats, String []FType, int[] ffare, String[] PlaneType ) 
		{
			char opt='\0';
			Scanner scanner= new Scanner(System.in);
		for (int i = 0; i<origin.length; i++) {
			if(Origin.equals(origin[i])) {
				if(Destination.equals(destination[i])) {
								
								System.out.println("------------FLight Avaiable------------- ");
								System.out.println("Seats Avaiable: " + n_seat[i]);
								System.out.println("Price of one ticket: RS" + ffare[i]);
								System.out.println("Type of Seat Available: " + PlaneType[i]);
								System.out.println("Type of Flight: " + FType[i]);
								System.out.println("To Buy A Ticket Press 1");
								opt= scanner.next().charAt(0);
							    if(opt == '1') {
							    	Ticket obj1 = new Ticket();
							    	obj1.printTicket(Name, origin, Origin, Destination, n_seat, destination, n_seats, FType, ffare, PlaneType);
							    	System.out.println("Have A Safe Journey");
							    	System.out.println("\n");
							    }
								
								if (opt!=1) {
									System.exit(0);
								}
								break;
				}
				
											
		}
	
			else {
				System.out.println("FLight Not Available");
				System.out.println("Sorry.For Inconvinience");
				break;
			}
		}
		
		}
}
