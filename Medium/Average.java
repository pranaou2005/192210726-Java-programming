import java.util.*;
class Average{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		int arr [] = new int [1000];
		int i,j,k,a,neg=0,pos=0,cn=0,cp=0;
		System.out.println("Enter the numbers:");
		for(i=0;i<1000;i++){
			a=sc.nextInt();
			arr[i]=a;
			if(a==-1){
				System.out.println("break it man!");
				break;
			}
		}
		for(j=0;j<i;j++){
			if(arr[j]<0){
				neg=neg+arr[j];
				cn=cn+1;
			}
			else{
				pos=pos+arr[j];
				cp=cp+1;
			}
		}
		System.out.println("The neg sum: "+neg/cn+" The pos sum: "+pos/cp);
		
	}
}
