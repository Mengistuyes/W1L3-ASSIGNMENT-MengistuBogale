package problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class HeartRates {
	private String firstName;
	private String lastName;	
	private LocalDate dateOfBirth;
	private static final int RHR = 70;   // Resting Heart Rate (RHR) = 70;
	private static final double LB = 0.5;   //Assign Lower Boundary(LB) = 0.5
	private static final double UB = 0.85;   //Assign Upper Boundary(UB) = 0.5
	
	private static int MHR;
	private double LBTHR;
	private double UBTHR;
	private int age;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
	
	public HeartRates(String firstName,String lastName,LocalDate dateOfBirth)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
	}
	public int calculateAge(LocalDate birthday) {
	        LocalDate today = LocalDate.now();
	        age= Period.between(birthday, today).getYears();
	        return age;
	    }
	
	  public static int maxHeartRate(int age)
	  {
		  	MHR=220-age;
		  return (220-age);
	  }
	   public void targetHeartRateRange(int age)
	  {
		   int AHR=this.maxHeartRate(age)-RHR;//Average Heart Rate (AHR) = MHR – RHR
		    LBTHR= (AHR*LB) + RHR; //Lower Boundary Target Heart Rate
		    UBTHR = (AHR*UB) + RHR; //Upper Boundary Target Heart Rate
		  // System.out.println("Your Target Heart Rate Range is between " + LBTHR + " and " + UBTHR);
		   		  
	  }
	   public String toString() {
			return "[ FullName: " + firstName + " " + lastName + ", dateOfBirth: " + dateOfBirth + ", Max Heart Rate: " + MHR + ", age: "  + age + ",  Target Heart Rate Range is between: "+ UBTHR + "-" + LBTHR
			+ "]";
			}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
