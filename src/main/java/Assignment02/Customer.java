package Assignment02;
import java.util.*;



public class Customer {
	private static  String name;
	private int age;
	private String gender;
    private  String address;
    private String telephoneNumber;
    private String origin;
    private String destination;
    private String passportnumber;
    private String planeType;
    
    public static  String getName() {
        return name;
    }
    
    public  int getAge() {
        return age;
    }
    
    public  String getGender() {
        return gender;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    
    public  String getOrigin() {
        return origin;
    }
    
    public  String getDestination() {
        return destination;
    }
    
    public  String getpassportNumber() {
        return passportnumber;
    }
    
    public  String getPlaneType() {
        return planeType;
    }
    
    public void setName(String n_name) {
        this.name = n_name;
    }

    public void setage(int n_age) {
        this.age = n_age;
    }
    
    public void setGender(String  n_gender) {
        this.gender = n_gender;
    }
    
    public void setAddress(String  n_address) {
        this.address = n_address;
    }

    public void setTelephoneNumber(String n_telephoneNumber) {
        this.telephoneNumber = n_telephoneNumber;
    }
    
    public void setOrigin(String n_Origin) {
        this.origin = n_Origin;
    }
    
    public void setDestination(String n_destination) {
        this.destination = n_destination;
    }
    
    public void setpassportNumber(String n_passportNumber) {
        this.passportnumber = n_passportNumber;
    }
    
    public void setPlanetype(String n_planeType) {
    	this.planeType = n_planeType;
     }
      
}
