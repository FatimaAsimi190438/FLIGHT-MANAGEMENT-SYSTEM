package Assignment02;
import java.util.Scanner;
import java.util.*; 
import java.util.Random;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors


public class FMS {

	 String Name;
	int Age ;
	 String Gender ;
	 String TphoneNumber ;
	 String Address;
	String Origin;
	String Destination;
	 String Pportnumber;
	 String FType ;
	public static void main(String[] args) throws LengthException, AgeException, intException {
		Scanner scanner= new Scanner(System.in); 
		Scanner sc= new Scanner(System.in); 
		Scanner scan= new Scanner(System.in);
	    char opt;
	    String Name = null ;
	    int Age = 0;
	    String Gender = null;
	    String Address = null;
	    String TphoneNumber = null;
	    String Origin ="";
	    String Destination="";
	    String Pportnumber = null;
	    int PType;
	    int FlightType;
	    String [] destination = {"Islamabad","London","Dubai","Islamabad","Faisalabad","Karachi"};
	    String [] origin =      {"Lahore","Islamabad","Karachi","Sakardu","Multan","Faisalabad"};
	    int [] n_seat= {20,40,50,30,30,45};
	    int [] ffare= {9000,40000,70000,7000,9000,10000};
	    String [] PlaneType= {"Economy","Buisness","Buisness", "Economy","Economy","Economy"};
	    String [] FType= {"Direct","Indirect via Dubaii","Indirect via UAE", "Direct","Direct","Direct"};
	   
	    SearchFlight obj = new SearchFlight();
	    Ticket obj1 = new Ticket();
	    CustomerDetails obj2 = new CustomerDetails();
	    
	    do {
	    	System.out.println("------------------------------------------------------------------");
	    	System.out.println("|         WELCOME TO FLIGHT MANAGEMENT SYSTEM PAKISTAN           |");
	    	System.out.println("|             1. Book a Seat  & Print A Ticket                   |");
	    	System.out.println("|                     2. Cancel a Seat                           |");
	    	System.out.println("|                 3. View customer Details                       |");
	    	System.out.println("|                  4. View Flight Details                        |");
	    	System.out.println("|                    5. Quit                                     |");
	    	System.out.println("|                    Enter Desired Option                        |");
	    	System.out.println("------------------------------------------------------------------");
	    	opt= scanner.next().charAt(0);
	    	
	    	if(opt == '1') {
	    		System.out.println("Please Enter The Following Details");
	    		System.out.println("Enter Your Name");
	    		Name = sc.nextLine();
	    		System.out.println("Enter Your Age");
	    		Age = scan.nextInt();
	    		try {
	    		if(Age < 20) 
	    			throw new AgeException("Age must be greater than 20");
	    		}
	    		catch(AgeException e) {
	    			System.err.println(e);
	    		}
	    		System.out.println("Enter Your Gender");
	    		Gender = sc.nextLine();
	    		System.out.println("Enter Your Address");
	    		Address = sc.nextLine();
	    		System.out.println("Enter Your Telephone Number");
	    		TphoneNumber = sc.nextLine();
	    		try {
	    		if (TphoneNumber.length() != 11)
	    			throw new LengthException("Phone number must have 11 digits");
	    		}
	    		catch(LengthException e){
	    			System.err.println(e);
	    		}
	    		System.out.println("Enter Your Origin");
	    		Origin = sc.nextLine();
	    		System.out.println("Enter Your Destination");
	    		Destination = sc.nextLine();
	    		System.out.println("Enter Your 9 Digit Passport Number");
	    		Pportnumber = sc.nextLine();
	    		try {
	    		if (Pportnumber.length() != 9)
	    			throw new LengthException("passport number can only have 10 characters");
	 
	    		}
	    		catch (LengthException e){
	    			System.err.println(e);
	    		}
	    		obj.search(Name, origin, Origin, Destination, n_seat, destination, n_seat, FType, ffare, PlaneType);
	    		}
	    	if(opt == '2') {
	    		System.out.println("To Cancel The Ticket Please Enter The Following Information");
	    		System.out.println("Enter Your Ticket Number");
	    		obj1.ticketno= sc.nextLine();
	    		try {
	    		if (obj1.ticketno.length() != 10)
	    			throw new LengthException("ticket number can only have 10 characters");
	    		}
	    		catch (Exception e) {
	    			System.err.println(e);
	    		}
	    		for (int i =0; i< obj1.ticketnos.length; i++) {
		    		if (obj1.ticketno == obj1.ticketnos[i]) {
		    			System.out.println("Ticket Found");
		    			System.out.println("Cancelling Ticket");
		    			break;
		    		}
		    		
		    		else {
		    			System.out.println("Ticket Not Found");
		    			break;
		    		}
		    		}
}
	    	if(opt == '3') {
		    	obj2.FileWriting(Name, Age, Gender, TphoneNumber, Address, Origin, Destination, Destination, Pportnumber, FType);
	    }
	    }	    	
	    	 while (opt != '5');
	    
	    }
	
	    
}


