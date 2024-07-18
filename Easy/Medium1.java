import java.util.*;
import java.util.ArrayList;
class Medium1{
	public static void main(String arr[]){
		int flag=0;
		int i,j,k,n=3;
		ArrayList<Integer> p=new ArrayList<>();
		for(i=2;i<1000;i++){
			for(j=2;j<=i/2;j++){
				if(i%j==0){
					flag=1;
					break;
				}
				else{
					flag=0;
				}
			}
		if(flag==0){
			p.add(i);
			}
		}
		System.out.println("Nth prime is : "+p.get(n-1));
		k=0;
		for(i=n;k<n;i++){
			System.out.println(p.get(i));
			k++;
		}
	}
}