import java.util.Arrays;

class Mean {
    public static void main(String args[]) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        int n = arr.length;
        double mean = 0;
        int sum = 0;

        // Calculate mean
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        mean = (double) sum / n;
        System.out.println("Mean: " + mean);

        // Calculate median
        Arrays.sort(arr);
        double median;
        if (n % 2 == 0) {
            median = ((double) arr[n / 2 - 1] + arr[n / 2]) / 2;
        } else {
            median = arr[n / 2];
        }
        System.out.println("Median: " + median);

        // Calculate mode
        int mode = arr[0];
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = arr[i];
            }
        }
        System.out.println("Mode: " + mode);
    }
}
