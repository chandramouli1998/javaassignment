import java.util.Scanner;


public class Datetest {

	public static void main(String[] args) {
		Scanner user_input=new Scanner(System.in);
		Date1 p=new Date1();
		System.out.println("enter the month");
		int month=user_input.nextInt();
		System.out.println("enter the day");
		int date=user_input.nextInt();
		System.out.println("enter the year");
		int year=user_input.nextInt();	
		p.setDay(date);
		p.setMon(month);
		p.setYear(year);
		p.displaydate();

	}

}
