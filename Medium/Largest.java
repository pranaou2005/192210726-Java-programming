import java.util.*;
class Largest{
	public static void main(String args[]){
		int [] arr={1,2,3,4,5};	
		int t=2;
		int s=arr.length;
		int lar=arr[0],i,temp,j;
		for(i=0;i<s;i++){
			for(j=i+1;j<s;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}		
			}
		}
		s=s-1;
		System.out.println("The largest: "+arr[s-(t-1)]);
	}
}