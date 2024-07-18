import java.util.*;
class Vowels{
	public static int vowel(String str){
	 	int i,j,k,count=0;
		for(i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				count++;
			}
		}
		return count;
	}
	public static void main(String args[]){
		String s="sriraagavi";
		int c=vowel(s);
		System.out.println("The num of vowles: "+c);
	}
}