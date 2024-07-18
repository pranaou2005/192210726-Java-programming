class Armstrong{
	public static void main(String args[]){
		int n=153,rem;
		int sum=0,temp=n;
		while(n!=0){
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum){
			System.out.println("The number is Armstrong");
		}
		else{
			System.out.println("The number is not Armstrong");
		}
	}
}