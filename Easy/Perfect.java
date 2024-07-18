class Perfect{
	public static void main(String[] args){
		int n=6;
		int i=0,sum=0;
		for(i=1;i<n;i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(n==sum){
			System.out.println("perfect number");
		}
		else{
			System.out.println("Not perfect number");
		}
	}
}