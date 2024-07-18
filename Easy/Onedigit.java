class Onedigit{
	public static void main(String args[]){
		int n=123459;
		if(n%9==0){
			System.out.println("The sum is: "+9);
		}
		else{
			System.out.println("The sum is: "+ n % 9);
		}
	}
}