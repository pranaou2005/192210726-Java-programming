class Fibo{
	public static void main(String[] args){
		int i;
		int a=0;
		int b=1;
		int c=0;
		int n=5;	
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<=n;i++){
			System.out.println(c=a+b);
			a=b;
			b=c;
		}
	}
}