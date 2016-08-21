import java.util.Scanner;


public class Employeetest {

	public static void main(String[] args) {
		Scanner user_input=new Scanner(System.in);
		Employee a=new Employee();
	Employee b=new Employee();	
		double d,e,f;
		System.out.println("The employees salatry is");
			System.out.println("enter the first name for Employee 1:");
			String first=user_input.next();
			System.out.println("enter the second name fo remployee 1:");
			String second=user_input.next();
			System.out.println("enter the salary");
			double s=user_input.nextInt();
			a.setFrstName(first);
			a.setSecndName(second);
			if(s>0)
			{
				a.setSalary(s);
			}
			else
			{
				System.out.println("enter the positive salary");
			}
			d=a.getSalary();
			d=d*12;
			System.out.println("employee 1 details");
			System.out.println("the first name is"+a.getFrstName());
			System.out.println("the second name is :"+a.getSecndName());
			System.out.println("the monthly salarey is :"+a.getSalary());
			System.out.println("the yearly salary is:"+d);
			System.out.println("the incremented salary is");
			f=d*(1+0.1);
			System.out.println(f);
			System.out.println("enter emplouyue 2 details:");
			System.out.println("enter the first name");
			first=user_input.next();
			System.out.println("enter the second name");
			second=user_input.next();
			System.out.println("enter the salary");
			s=user_input.nextDouble();
			b.setFrstName(first);
			b.setSecndName(second);
			if(s>0)
			{
				b.setSalary(s);
			}
			else
			{
				System.out.println("enter the positive value");
			}
			e=b.getSalary();
			e=e*12;
			System.out.println("employee 2 details");
			System.out.println("the first name is"+b.getFrstName());
			System.out.println("the second name is :"+b.getSecndName());
			System.out.println("the monthly salarey is :"+b.getSalary());
			System.out.println("the yearly salary is:"+e);
			f=f*(1+0.1);
			System.out.println("the incremented salary is");
			System.out.println(f);
			

	}

}
