import java.util.*;
import java.util.ArrayList;
class Perfect{
	public static void main(String args[]){
		int n,i,j,k,sum;
		Scanner sc =  new Scanner (System.in);
		n=sc.nextInt();
		ArrayList <Integer> p = new ArrayList<>();
		for(i=1;i<10000;i++){
			sum=0;
			for(j=1;j<i;j++){
				if(i%j==0){
					sum=sum+j;
				}
			}
			if(sum==i){
				p.add(i);
			}
		}
			
		for(i=0;i<n;i++){
			System.out.println(p.get(i));
		}
	}
}
					