package problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
		HeartRates HRCalculator = new HeartRates("Mengistu","Bogale",LocalDate.parse("1990-10-18"));
       // LocalDate birthday =  HRCalculator.getBirthday();
        int age =  HRCalculator.calculateAge(HRCalculator.getDateOfBirth());
      //  System.out.printf("Today you are %d years old%n",age);
        HRCalculator.targetHeartRateRange(age);
        
        System.out.printf(HRCalculator.toString());
	}




}
