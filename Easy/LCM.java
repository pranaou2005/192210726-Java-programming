import java.util.*;
class LCM{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int q=n*m,lcm=1;
		int min=(n<m)?n:m;
		int gcd=1;		
		for(int i=1;i<=min;i++){
			if(m%i==0 && n%i==0){
				gcd=i;
			}
		}
		System.out.println("LCM: "+gcd);
		lcm=(n*m)/gcd;
		System.out.println("GCD: "+lcm);
	}
}