package problem4;

import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		getUserInputAndDisplay();
	}
	public static void getUserInputAndDisplay() {
	    Scanner scanner = new Scanner(System.in);
	    boolean loopUntiTrue=false;
	    Main.DisplayMenu();
	    do
			{			
			  String input = scanner.nextLine();
					
		try {
			
			   if(input.trim().equals("C".trim()) || input.trim().equals("c".trim()))
					{
						System.out.println("Enter the radius of the Circle");	
						double radius = Double.parseDouble(scanner.nextLine());
						Circle MyCircle=new Circle(radius);
						System.out.printf("The area of Circle is : %.2f" , MyCircle.computeArea());
					}
				
				else if(input.trim().equals("R".trim()) || input.trim().equals("r".trim()))
				{
					System.out.println("Enter the width of the Rectangle");	
					double width = Double.parseDouble(scanner.nextLine());
					
					System.out.println("Enter the height of the Rectangle");	
					double height = Double.parseDouble(scanner.nextLine());
					
					
					Rectangle MyRectangle=new Rectangle(width,height);
				//	Double RectangleArea=MyRectangle.computeArea();
					System.out.printf("The area of Triangle is :  %.2f" , MyRectangle.computeArea());
				}
				else if(input.trim().equals("T".trim()) || input.trim().equals("t".trim()))
				{
					System.out.println("Enter the base of the Triangle");	
					double base = Double.parseDouble(scanner.nextLine());
					
					System.out.println("Enter the height of the Triangle");	
					double height = Double.parseDouble(scanner.nextLine());
					
					Triangle MyTriangle=new Triangle(base,height);
					System.out.printf("The area of Triangle is : %.2f" , MyTriangle.computeArea());
				}
			
			    System.out.println("\n");
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
			   
			   System.out.println("\n");
		           
	        } catch(DateTimeParseException e) {
	            System.out.println("Error! Please try again");
	            loopUntiTrue=true;
	        	Main.DisplayMenu();
	        }
		}while(loopUntiTrue);//End of while
	    scanner.close();
	}
	
	private static void DisplayMenu()
	{
		  	System.out.println("Enter C for Circle");
			System.out.println("Enter R for Rectangle");
			System.out.println("Enter T for Triangle");
			System.out.println("Choose your Choice : ");
	}

}
