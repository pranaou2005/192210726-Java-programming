class Composite{
	public static void main(String args[]){
		int n=20;
		int i,flag=0,j;
		for(i=2;i<n;i++){
			for(j=2;j<=i/2;j++){
				if(i%j==0){
					flag=1;
					break;
				}
				else{
					flag=0;
				}
			}
		if(flag==1){
			System.out.println("Composite: "+i);
		}
		else{
			System.out.println("Prime: "+i);
		}
		}
	}
}