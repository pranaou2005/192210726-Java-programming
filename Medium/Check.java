import java.util.*;
class Check{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string(1) or integer(2):");
		int type = sc.nextInt();
		sc.nextLine();
		int l,r,c=0;
		switch(type) {
			case 1:
				System.out.println("Enter the string:");
				String str = sc.nextLine();
				l=0;
				r=str.length()-1;
				while(l<r){
					if(str.charAt(l)!=str.charAt(r)){
						c++;
					}
					l++;
					r--;
				}
				r=str.length()-1;
				if(c==0){
					System.out.println("Pall");
				}
				else{
					System.out.println("Not pall");
				}
				break;
			case 2:
				System.out.println("Enter the number :");
				int num = sc.nextInt();
				int temp = num;
				int rem=0,rev=0;
				while(temp!=0){
					rem=temp%10;
					rev=rev*10+rem;
					temp=temp/10;
				}
				if(rev==num){
					System.out.println("Pall num");
				}
				else{
					System.out.println("Not pall num");
				}
				break;
			default:
				System.out.println("Invalid choice");
		
		}
	}
}
				