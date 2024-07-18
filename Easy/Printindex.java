import java.util.*;
class Printindex{
	public static void Search(String str,char t){
	 	int n=str.length();
		int i,j,k;
		for(i=0;i<n;i++){
			if(str.charAt(i)==t){
				System.out.println("The index is: "+i);
			}
		}
	}
	public static void main(String args[]){
		String s="sriraagavi";
		char c='r';
		Search(s,c);
	}
}