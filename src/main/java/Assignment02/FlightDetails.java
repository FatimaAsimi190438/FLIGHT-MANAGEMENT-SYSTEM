package Assignment02;
import java.io.FileWriter;
import java.io.IOException;

public class FlightDetails {
	public void FileWriting(String Name,int Age,String Gender,String TphoneNumber,String Address,String Origin,String Destination,String ticketno,String seatno, String [] ffare, String []FType, String []PlaneType,String [] n_Type)
	{
		
		try {
			
			FileWriter myfile=new FileWriter("FlightDetailsFile.txt");
			
			myfile.write("Flight Details");
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