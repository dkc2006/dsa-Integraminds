package day_11.heap;

public class InsertionHeap {
    // Function to restore the max-heap property after insertion
    static void heapify(int[] arr, int n, int i) {
        int parent = (i - 1) / 2;  // Find the parent index

        if (parent >= 0) {
            if (arr[i] > arr[parent]) {  // If the child is greater than the parent, swap
                int temp = arr[i];
                arr[i] = arr[parent];
                arr[parent] = temp;
                heapify(arr, n, parent);  // Recursively call heapify for the parent
            }
        }
    }

    // Function to insert a new element into the heap
    static int insertNode(int[] arr, int n, int key) {
        arr[n] = key;  // Insert the new key at the end
        heapify(arr, n + 1, n);  // Restore the heap property
        return n + 1;  // Return the new size of the heap
    }

    // Function to print the heap
    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver Code
    public static void main(String[] args) {
        int MAX = 1000;  // Maximum array size
        int[] arr = new int[MAX];

        // Initial heap
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 4;

        int n = 5;  // Current heap size

        // Insert 15 into the heap
        n = insertNode(arr, n, 15);

        // Insert 3 into the heap
        n = insertNode(arr, n, 3);

        // Print the final heap
        printArray(arr, n);
    }
}
