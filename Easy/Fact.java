class Fact{
	public static void main(String[] args){
		int i;
		int n=5;
		int fact=1;
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		System.out.println("Factorial is : "+fact);
	}
}