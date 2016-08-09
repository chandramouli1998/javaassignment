import java.util.Scanner;
public class Duplicateelimination {

	public static void main(String[] args) {
		
		Scanner user_input=new Scanner(System.in);
		int c[]=new int[5];
		int b,a,y=0;
		for(int i=0;i<5;i++)
		{
			a=0;
			System.out.println("enter the number");
			b=user_input.nextInt();
			if(b>9&&b<101)
			{
				for(int j=0;j<i;j++)
				{
					if(c[j]==b)
					{
						a=1;
						break;
					}
					
					else
					{
						continue;
					}
				}
				if(a==1)
				{
					continue;
				}
				else
				{
					c[y]=b;
					y++;
					System.out.println("the unique array is");
					for(int k=0;k<y;k++)
					{
						System.out.println(" "+c[k]);
					}
				}
			}
		}
}
}


