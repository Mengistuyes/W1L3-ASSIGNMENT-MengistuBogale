package problem3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MyDate {

	private int Day;
	private int Month;
	private int Year;
	
	private int Day2;
	private String Month2;
	private int Year2;
	//Change my date to LocalDate
	public LocalDate ChangeMyDateToLocalDate(String date,String Pattern) {
	return LocalDate.parse(date,DateTimeFormatter.ofPattern(Pattern));
	}
	//Print it my date with my Date format pattern
	public String PrintMyLocalDate(LocalDate date,String DATE_PATTERN) {
		return date.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
		}

	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int getDay2() {
		return Day2;
	}
	public void setDay2(int day2) {
		Day2 = day2;
	}
	public String getMonth2() {
		return Month2;
	}
	public void setMonth2(String month2) {
		Month2 = month2;
	}
	public int getYear2() {
		return Year2;
	}
	public void setYear2(int year2) {
		Year2 = year2;
	}
	public int getDay3() {
		return Day3;
	}
	public void setDay3(int day3) {
		Day3 = day3;
	}
	public int getYear3() {
		return Year3;
	}
	public void setYear3(int year3) {
		Year3 = year3;
	}

	private int Day3;
	private int Year3;
	
	public MyDate(int Month,int Day,int Year)
	{
		this.Month=Month;
		this.Day=Day;
		this.Year=Year;
	}
	public MyDate(String Month2,int Day2,int Year2)
	{
		this.Month2=Month2;
		this.Day2=Day2;
		this.Year2=Year2;
	}
	
	public MyDate(int Day3,int Year3)
	{
		this.Day3=Day3;
		this.Year3=Year3;
		
	}
	
}
