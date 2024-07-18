import java.util.*;

class RevSort {
    public static void main(String args[]) {
        String names = "KIRANAMYE";
	String reverse=" ";
	char[] a = names.toCharArray();
        char temp;
        int n = a.length;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
	for(i=0;i<n;i++){
			reverse=reverse+a[i];
		}
	System.out.println("The reversed string : "+reverse);
    }
}
	