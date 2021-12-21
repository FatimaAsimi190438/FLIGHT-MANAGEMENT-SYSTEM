package Assignment02;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Ticket extends SearchFlight{
	public String []ticketnos;
	public int ticketcount;
	public String ticketno ;
	Customer obj = new Customer();
	Ticket(){
		ticketnos = new String [100];
		ticketcount = 0;
	}
    public void printTicket(String Name, String []origin, String Origin, String Destination,  int [] n_seat, String [] destination, int []n_seats, String []FType, int[] ffare, String[] PlaneType ) 
	{
    	//String ticketno ;
    	
    	
    	String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
          int index = random.nextInt(alphaNumeric.length());
          char randomChar = alphaNumeric.charAt(index);
          sb.append(randomChar);
        }
        
        ticketno = sb.toString();
      
        Random rand = new Random();
        int seatno = rand.nextInt(250);
        RandomDates obj1 = new RandomDates();
        System.out.println("Printing Ticket..... Please Wait.");
        System.out.println("_____________________________________________________________________________________");
        System.out.println("|"+Origin+"TO"+Destination);
        System.out.println("|TicketNumber:"+ticketno);        
        System.out.println("|Seat Number:"+seatno);
        System.out.println("|Flight Date:"+obj1.createRandomDate(2021, 2022));
        System.out.println("|Passenger Name:" +Name);
        System.out.println("_____________________________________________________________________________________");
        ticketnos[ticketcount]= ticketno;
        ticketcount++;
        System.out.println("\n");
    	}
    	
    			
		
		
	
}