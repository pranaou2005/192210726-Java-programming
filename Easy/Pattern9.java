import java.util.Scanner;
import java.lang.Math;
class Pattern9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
		int n,i,j,k=1;
        System.out.print("Enter the no of rows:");
        n=in.nextInt();
		for(i=1;i<=n;i++)
		{
		for(j=1;j<=i;j++)
		{
		System.out.print((int)Math.pow(k,2)+" ");
		k++;
		}
		System.out.println();
		}
		
        			
    }
}