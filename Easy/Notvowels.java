import java.util.*;
class Notvowels{
	public static void vowel(String str){
	 	int i,j,k,count=0;
	 	String r = "";
		for(i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				r=r+" ";
			}
			else{
				r=r+ch;
			}
		}
		System.out.println(r);
	}
	public static void main(String args[]){
		String s="Pranaou";
		vowel(s);
	}
}
		