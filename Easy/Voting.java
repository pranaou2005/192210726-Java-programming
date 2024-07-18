import java.util.Scanner;
class Voting{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int y= 18 - a;
		if(a>=18){
			System.out.println("Eligible");
		}
		else{
			System.out.println("Not Eligible ,Still "+y+" years to get eligible");
		}
	}
}