package Assignment02;

import java.io.FileWriter;
import java.io.IOException;

public class CustomerDetails {
	public void FileWriting(String Name,int Age,String Gender,String TphoneNumber,String Address,String Origin,String Destination,String ticketno,String seatno, String [] ffare)
	{
		
		try {
			
			FileWriter myfile=new FileWriter("CustomerDetailsFile.txt");
			
			myfile.write("Reservation Details");

			myfile.write("\nCustomer Name:"+Name);

			myfile.write("\nAge:"+Age);
			

			myfile.write("\nTicket Number:"+ticketno);

			myfile.write("\nSeat Number"+seatno);
			
			myfile.write("\nOrigin:"+Origin);
			myfile.write("\nDestination:"+Destination);
			myfile.write("\nTotal Due:"+ffare);
			
			
			
			myfile.close();
			
			System.out.println("Successfully written in a file");
		} catch(IOException e)
		{
			System.out.println("Error Occurred");
			e.printStackTrace();
		}
		
		
		
	}
}
