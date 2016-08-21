import java.util.Scanner;
public class Date1 {
	private int month;
	private int day;
	private int year;
public Date1()
{
	month=0;
	day=0;
	year=0;
}
public void setMon(int m)
{
	month=m;
	}
public void setDay(int d)
{
	day=d;
	
}
public void setYear(int y)
{
	year=y;
}
public int getMon()
{
	return month;
}
public int getDay()
{
	return day;
}
public int getYear()
{
	return year;
}
public void displaydate()
{
	System.out.println("the date is");
	System.out.printf("%d/%d/%d",getDay(),getMon(),getYear());
}
	

}
