import java.util.Scanner;

class Maxmin {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 1};
        int i, j, t;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position for min: ");
        int min = sc.nextInt();
        
        System.out.print("Enter the position for max: ");
        int max = sc.nextInt();
        
        int s = arr.length;
        System.out.println("Size: " + s);
        for (i = 0; i < s - 1; i++) {
            for (j = i + 1; j < s; j++) {
                if (arr[j] < arr[i]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("Sorted array:");
        for (i = 0; i < s; i++) {
            System.out.println(arr[i]);
        }
       	System.out.println("Mth max: "+arr[s-max]);
	System.out.println("Nth min: "+arr[min-1]);
	System.out.println("Sum: "+(arr[s-max]+arr[min-1]));
	System.out.println("Difference:"+(arr[s-max]-arr[min-1]));
    }
}
