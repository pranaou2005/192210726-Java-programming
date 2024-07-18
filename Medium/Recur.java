import java.util.*;
class Recur{
	public static long factorial(int n){
		if(n<=1){
			return n;
		}
		else{
			return n*factorial(n-1);
		}
	}
	public static void main( String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("The factorial is: "+factorial(n));
	}
}		
		