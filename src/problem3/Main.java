package problem3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	public static final String DATE_PATTERN = "MM/dd/yyyy";
	public static void main(String[] args) {	
		Main.getUserInputAndDisplay();		
	}
	public static void getUserInputAndDisplay() {
	    Scanner scanner = new Scanner(System.in);
	    	Main.DisplayMenu();
			int Day=0,Month=0,Year=0;
			int Day2=0,Year2=0;
			String Month2;
			int dayOfYear=0,Year3=0;
			boolean loopUntiTrue=false;
			LocalDate d;
	    do {
	    	 try {
	    		 loopUntiTrue=false;
			        String input = scanner.nextLine();	        
			        if((Integer.parseInt(input))==1)
			        {
			        	 System.out.println("Choice : " + input);
			        	 System.out.println("Enter Month\n");
			        	 Month = Integer.parseInt(scanner.nextLine());
			           	 System.out.println("Enter Day\n");
			        	 Day = Integer.parseInt(scanner.nextLine());
			        	 System.out.println("Enter Year\n");
			        	 Year = Integer.parseInt(scanner.nextLine());
			        	 MyDate MyDateNumberFormat=new MyDate(Month,Day,Year);
			        	
			        	
			        	 d=MyDateNumberFormat.ChangeMyDateToLocalDate((Month + "/" + Day + "/" + Year),DATE_PATTERN);
		            				        				        	 
			        	 System.out.println("MM/dd/yyyy: " + MyDateNumberFormat.PrintMyLocalDate(d,DATE_PATTERN));
			        	 System.out.println("MMM dd,YYYY: " + MyDateNumberFormat.PrintMyLocalDate(d,"MMMM dd,YYYY"));
			        	 System.out.println("DDD YYYY: " + MyDateNumberFormat.PrintMyLocalDate(d,"DDD YYYY"));
			        	 
			            }
			        else if((Integer.parseInt(input))==2)
			        {
			        	 System.out.println("Choice : " + input);
			        	 System.out.println("Enter Month in text:\n");
			        	 Month2 = scanner.nextLine();
			           	 System.out.println("Enter Day\n");
			        	 Day2 = Integer.parseInt(scanner.nextLine());
			          	 System.out.println("Enter Year\n");
			        	 Year2 = Integer.parseInt(scanner.nextLine());
			        	 MyDate MyDateNumberFormat=new MyDate(Month2,Day2,Year2);
			        	
			        	 d=MyDateNumberFormat.ChangeMyDateToLocalDate((Month2 + " " + Day2 + "," + Year2),"MMMM dd,yyyy");
			        			        	 
			        	 System.out.println("MM/dd/yyyy: " + MyDateNumberFormat.PrintMyLocalDate(d,DATE_PATTERN));
			        	 System.out.println("MMM dd,YYYY: " + MyDateNumberFormat.PrintMyLocalDate(d,"MMMM dd,YYYY"));
			        	 System.out.println("DDD YYYY: " + MyDateNumberFormat.PrintMyLocalDate(d,"DDD YYYY"));
			        }
			        else if((Integer.parseInt(input))==3)
			        {
			        	 System.out.println("Choice : " + input);
			        	 System.out.println("Enter Day of Year:\n");
			        	 dayOfYear = Integer.parseInt(scanner.nextLine());
			        	
			        	 System.out.println("Enter Year\n");
			        	 Year3 = Integer.parseInt(scanner.nextLine());
			        	 MyDate MyDateNumberFormat=new MyDate(dayOfYear,Year3);
			        	 d=MyDateNumberFormat.ChangeMyDateToLocalDate((dayOfYear + " " + Year3),"DDD yyyy");
			        			        	 
			        	 System.out.println("MM/dd/yyyy: " + MyDateNumberFormat.PrintMyLocalDate(d,DATE_PATTERN));
			        	 System.out.println("MMM dd,YYYY: " + MyDateNumberFormat.PrintMyLocalDate(d,"MMMM dd,YYYY"));
			        	 System.out.println("DDD YYYY: " + MyDateNumberFormat.PrintMyLocalDate(d,"DDD YYYY"));
			        }
			        System.out.println("Do you want to Continue : Y/N");
			        input=scanner.nextLine();
			        if(input.trim().equals("Y".trim()) || input.trim().equals("y".trim()))
			        {
			        	loopUntiTrue=true;
			        	Main.DisplayMenu();
			        }
			        else
			        {
			        	System.out.println("Terminated");
			        	loopUntiTrue=false;			        }
			                  
	        } catch(DateTimeParseException e) {
	            System.out.println("Error! Please try again");
	            loopUntiTrue=true;
	        	Main.DisplayMenu();
	        }
	    }while (loopUntiTrue);
	}
	
	private static void DisplayMenu()
	{
			System.out.println("Enter 1 for format: MM/DD/YYYY");
			System.out.println("Enter 2 for format: Month DD, YYYY");
			System.out.println("Enter 3 for format: DDD YYYY");
			System.out.println("Choose your Choice : ");
	}

}
