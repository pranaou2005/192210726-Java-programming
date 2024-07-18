import java.util.*;
class MergeSort{
	public static void sort(int a[],int s){
		int i,j,k,temp;
		for(i=0;i<s;i++){
			for(j=i+1;j<s;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=0;i<s;i++){
			System.out.println(a[i]);
		}
	}
		
	public static void main(String args[]){
		int[] a={1,3,10,4};
		int[] b={5,6,7,11};
		int s1=a.length;
		int s2=b.length;
		int s3=s1+s2;
		int c[]=new int[s3];
		int i=0,j=0,k;
		k=0;
		while(i<s1){
			c[k++]=a[i++];
		}
		while(j<s2){
			c[k++]=b[j++];
		}
		i=0;
		for(i=0;i<s3;i++){
			System.out.println(c[i]);
		}
		System.out.println("The array after sorting:");
		sort(c,s3);
	}
}