import java.util.Scanner;

class Perfect
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=in.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
		if(n%i==0)
		{
		sum+=i;
		}
		}
		if(n==sum)
		{
		System.out.println(n+" is a perfect number");
		}
		else
		{
		System.out.println(n+" is Not a perfect number");
		}
		
		
	}
}