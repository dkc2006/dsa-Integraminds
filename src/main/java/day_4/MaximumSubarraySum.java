package day_4;

import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input subarray size
        System.out.print("Enter the size of the subarray (k): ");
        int k = sc.nextInt();

        if (k > n) {
            System.out.println("Subarray size is larger than the array size.");
            return;
        }

        // Sliding window approach to find the maximum sum of subarray of size k
        int maxSum = 0, windowSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window over the array
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k]; // Add the next element and remove the first element of the window
            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("The maximum sum of a subarray of size " + k + " is: " + maxSum);
        sc.close();
    }
}
