import java.util.Scanner;
public class SalesCommision {
	public static void main(String args[])
	{
		Scanner user_input=new Scanner(System.in);
		int n;
		System.out.println("enter the number of emmployees");
		n=user_input.nextInt();
		int s[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the sales of emplooyeee"+(i+1)+" :");
			s[i]=user_input.nextInt();
			s[i]=200+(s[i]*9)/100;
		
		}
		int employees[]=new int[9];
		for(int i=0;i<n;i++)
		{
			if((s[i]>199)&&(s[i]<300))
			{
				employees[0]++;
			}
			else if(s[i]>=300&&s[i]<400)
			{
				employees[1]++;
			}
			else if(s[i]>=400&s[i]<500)
			{
				employees[2]++;
			}
			else if(s[i]>=500&&s[i]<600)
			{
				employees[3]++;
			}
			else if(s[i]>=600&&s[i]<700)
			{
				employees[4]++;
			}
			else if(s[i]>=700&&s[i]<800)
			{
				employees[5]++;
			}
			else if(s[i]>=800&&s[i]<900)
			{
				employees[6]++;
			}
			else if(s[i]>=900&&s[i]<1000)
			{
				employees[7]++;
			}
			else
			{
				employees[8]++;
			}
		}
		System.out.println("commision range     |     Number");
		System.out.println("--------------------------------");
		System.out.println("$200-299            |     "+employees[0]);
		System.out.println("$300-399            |     "+employees[1]);
		System.out.println("$400-499            |     "+employees[2]);
		System.out.println("$500-599            |     "+employees[3]);
		System.out.println("$600-699            |     "+employees[4]);
		System.out.println("$700-799            |     "+employees[5]);
		System.out.println("$800-899            |     "+employees[6]);
		System.out.println("$908-999            |     "+employees[7]);
		System.out.println("greater than $1000  |     "+employees[8]);

		
	}

}
